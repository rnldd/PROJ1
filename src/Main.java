import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserManager userManager = new UserManager();
        Security security = new Security(userManager);
        System.out.println("1. Inloggen");
        System.out.println("2. Registreren");
        String keuze;
        Gebruiker ingelogd = null;
        boolean bIngelogd = false;

        while (!bIngelogd) {
            keuze = scanner.nextLine();  // Move this inside the while loop to get new input each time

            if (keuze.equals("1")) {
                ingelogd = security.login();
                if (ingelogd != null) {
                    bIngelogd = true;
                } else {
                    System.out.println("Login mislukt, probeer het opnieuw of registreer.");
                }
            } else if (keuze.equals("2")) {
                security.RegistreerKlant();
                System.out.println("Geregistreerd. Probeer nu in te loggen.");
            } else {
                System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }

        if (bIngelogd && ingelogd != null) {
            Menu menu = new Menu(ingelogd, security);
            menu.startMenu();
        }
    }
}
