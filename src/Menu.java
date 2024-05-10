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
                case registreerBeheerder -> registreerBeheerder(security);
                case stopProgramma -> {
                    System.out.println("Het programma wordt beeindigd.");
                    startMenu = false;
                }
            }
        }
    }

    public void beheerderMenu(Security security, Beheerder ingelogdeDietist) {

        boolean dietistMenu = true;

        while (dietistMenu) {

            printBeheerderMenu();

            final String terug = "0";

            String input = keyboard.nextLine();
            if (input.equals(terug)) {
                security.logUit();
                dietistMenu = false;
            }
        }
    }

    public void klantMenu(Security security, Klant ingelogdeKlant) {

        boolean klantMenu = true;


        while (klantMenu) {

            printKlantMenu();

            final String terug = "0";



            switch (keyboard.nextLine()) {
                case terug: {
                    security.logUit();
                    klantMenu = false;
                }
            }
        }
    }

    public void registreerBeheerder(Security security) {
        System.out.println("Wat is uw voornaam?");
        String voornaam = keyboard.nextLine();
        System.out.println("Wat is uw achternaam?");
        String achternaam = keyboard.nextLine();
        System.out.println("Wat is uw email-adres?");
        String email = keyboard.nextLine();
        System.out.println("Wat is uw telefoonnummer?");
        String telefoonnummer = keyboard.nextLine();
        System.out.println("Stel uw gebruikersnaam in.");
        String gebruikersnaam = keyboard.nextLine();
        System.out.println("Stel uw wachtwoord in.");
        String wachtwoord = keyboard.nextLine();
        System.out.println("Wat is uw licentienummer?");
        int licentienummer = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Voer uw kwalificaties in, gescheiden door spaties.");
        String invoerK = keyboard.nextLine();
        String[] kwalificaties = invoerK.split(" ");
        System.out.println("Voer uw werkuren per dag in gescheiden door kommas. (Maandag: 9-5,Dinsdag: 9-12,enzovoort)");
        String invoerW = keyboard.nextLine();
        String[] werkuren = invoerW.split(",");

        security.getGebruikers().add(new Beheerder()));
    }

    public void printStartMenu() {
        System.out.println("Voer 1 in om in te loggen.");
        System.out.println("Voer 2 in om je te registeren.");
        System.out.println("Voer 0 in om het programma te stoppen.");
    }

    public void printBeheerderMenu() {
        System.out.println("x");
        System.out.println("Voer 0 in om terug te gaan naar het startmenu.");
    }

    public void printKlantMenu() {
        System.out.println("x");
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
                if ((gebruiker.getVoornaam() + " " + gebruiker.getAchternaam()).equals(klantnaam) && gebruiker instanceof Klant) {
                    return (Klant) gebruiker;
                }
            }

            System.out.println("Klant is niet gevonden, probeer het opnieuw of voer 0 in om terug te gaan.");
        }
    }
}
