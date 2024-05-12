import java.util.Scanner;
class Menu {
    private boolean startMenu = true;
    private transient final Scanner keyboard = new Scanner(System.in);
    public void startMenu(Security security) {
        while (startMenu) {

            printStartMenu();

            final String login = "1";
            final String registreerBeheerder = "2";
            final String stopProgramma = "0";

            String input = keyboard.nextLine();

            switch (input) {
                case login -> {
                    Gebruiker gebruikersType = security.login();
                    if (gebruikersType instanceof Beheerder) {
                        beheerderMenu(security, (Beheerder) gebruikersType);
                    }
                    if (gebruikersType instanceof Klant) {
                        klantMenu(security, (Klant) gebruikersType);
                    }
                }
                case registreerBeheerder -> registreerGebruiker(security);
                case stopProgramma -> {
                    System.out.println("Het programma wordt beeindigd.");
                    startMenu = false;
                }
            }
        }
    }

    public void beheerderMenu(Security security, Beheerder ingelogdeBeheerder) {

        boolean beheerderMenu = true;

        while (beheerderMenu) {

            printBeheerderMenu();

            final String terug = "0";
            final String ranglijst = "1";
            final String uitverkoop = "2";
            final String toonreview = "3";
            final String voegkortingtoe = "4";

            switch (keyboard.nextLine()) {
                case ranglijst: {
                    ingelogdeBeheerder.toonRanglijst();
                }
                case uitverkoop: {
                    ingelogdeBeheerder.toonUitverkoop();
                }
                case toonreview: {
                    ingelogdeBeheerder.toonReviews();
                }
                case voegkortingtoe: {
                    ingelogdeBeheerder.pasPrijsAan();
                }
                case terug: {
                    security.logUit();
                    beheerderMenu = false;
                }
            }
        }
    }

    public void klantMenu(Security security, Klant ingelogdeKlant) {

        boolean klantMenu = true;


        while (klantMenu) {

            printKlantMenu();

            final String ranglijst = "1";
            final String uitverkoop = "2";
            final String maakreview = "3";
            final String toonreview = "4";
            final String terug = "0";

            switch (keyboard.nextLine()) {
                case ranglijst: {
                    ingelogdeKlant.toonRanglijst();
                }
                case uitverkoop: {
                    ingelogdeKlant.toonUitverkoop();
                }
                case maakreview: {
                    ingelogdeKlant.schrijfReview();
                }
                case toonreview: {
                    ingelogdeKlant.toonReviews();
                }
                case terug: {
                    security.logUit();
                    klantMenu = false;
                }
            }
        }
    }

    public void registreerGebruiker(Security security) {
        System.out.println("Bent u een klant of een beheerder?");
        String gebruiker = keyboard.nextLine();
        System.out.println("gebruikersnaam?");
        String gebruikersnaam = keyboard.nextLine();
        System.out.println("wachtwoord?");
        String wachtwoord = keyboard.nextLine();
        if (gebruiker.equalsIgnoreCase("Klant")) {
            security.getGebruikers().add(new Klant(gebruikersnaam, wachtwoord));
        }
        if (gebruiker.equalsIgnoreCase("Beheerder")) {
            security.getGebruikers().add(new Beheerder(gebruikersnaam, wachtwoord));
        }
    }

    public void printStartMenu() {
        System.out.println("Voer 1 in om in te loggen.");
        System.out.println("Voer 2 in om je te registeren.");
        System.out.println("Voer 0 in om het programma te stoppen.");
    }

    public void printBeheerderMenu() {
        System.out.println("Voer 1 in om de ranglijst te bekijken");
        System.out.println("Voer 2 in om de uitverkoop te bekijken");
        System.out.println("Voer 3 in om reviews te bekijken.");
        System.out.println("Voer 4 in om korting toe te voegen.");
        System.out.println("Voer 0 in om terug te gaan naar het startmenu.");
    }

    public void printKlantMenu() {
        System.out.println("Voer 1 in om de ranglijst te bekijken");
        System.out.println("Voer 2 in om de uitverkoop te bekijken");
        System.out.println("Voer 3 in om een review achter te laten");
        System.out.println("Voer 4 in om reviews te bekijken.");
        System.out.println("Voer 0 in om het programma te beeindigen.");
    }

    public Klant vindKlant(Security security, String maakPlanTekst) {
        while (true) {
            System.out.println(maakPlanTekst);
            String klantnaam = keyboard.nextLine();

            if (klantnaam.equals("0")) {
                return null;
            }

            for (Gebruiker gebruiker : security.getGebruikers()) {
                if ((gebruiker.getNaam().equals(klantnaam) && gebruiker instanceof Klant)){
                    return (Klant) gebruiker;
                }
            }

            System.out.println("Klant is niet gevonden, probeer het opnieuw of voer 0 in om terug te gaan.");
        }
    }
}
