import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserManager userManager = new UserManager();
        Security security = new Security(userManager);
        System.out.println("1. Inloggen");
        System.out.println("2. Registreren");
        String keuze;
        keuze = scanner.nextLine();
        Gebruiker ingelogd = null;
        if (keuze.equals("1")) {
            ingelogd = security.login();
        }
        if(keuze.equals("2")){
            security.RegistreerKlant();
        }
        Menu menu = new Menu(ingelogd, security);
    }
}