import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    Gebruiker ingelogd;
    Security security;

    Menu(Gebruiker ingelogd, Security security){
        ingelogd = ingelogd;
        this.security = security;
    }

    public void startMenu() {

        String ranglijst = "1";
        String uitverkoop = "2";
        String logout = "0";

        boolean startMenu = true;
        while (startMenu) {
            printStartmenu();

            String keuze;
            keuze = scanner.nextLine();

            if(keuze.equals(ranglijst)){
                Gebruiker.toonRanglijst();
            }
            if(keuze.equals(uitverkoop)){
                Gebruiker.toonUitverkoop();
            }
            if(keuze.equals(logout)){
                security.logUit();
                startMenu = false;
            }
        }
    }

    private void printStartmenu() {
        System.out.println("1. Bekijk de ranglijst");
        System.out.println("2. Bekijk wat er in de uitverkoop is");
        System.out.println("0. Log uit");
    }
}