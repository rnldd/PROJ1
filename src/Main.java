import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int keuze;
        final int adventuregenre = 1;
        final int strategygenre = 2;
        final int shootergenre = 3;
        final int exit = 4;
        boolean startMenu = true;

        do {
            printStartmenu();
            keuze = scanner.nextInt();
            scanner.nextLine();

            switch (keuze) {
                case adventuregenre -> {
                    startMenu = false;
                    keuzeSchermAdventure();
                    //
                }
                case strategygenre -> {
                    startMenu = false;
                    keuzeSchermStrategy();
                    //
                }
                case shootergenre -> {
                    startMenu = false;
                    keuzeSchermShooter();
                    //
                }
                case exit -> {
                startMenu = false;
                System.out.println("Sluit applicatie");
            }
                default -> System.out.println("Ongeldige keuze, probeer het opnieuw.");
            }
        } while (startMenu);
    }
    public static void printStartmenu(){
        System.out.println("Kies een genre:");
        System.out.println("1. Adventure");
        System.out.println("2. Strategy");
        System.out.println("3. Shooter");
        System.out.println("4. Exit");
    }

    public static void keuzeSchermAdventure(){
        System.out.println("Van welke game wil je reviews zien? Maak een keuze:");
        System.out.println("1. The Legend of Zelda");
        System.out.println("2. Castlevania");
        System.out.println("3. Final Fantasy VII");
        System.out.println("4. Terug");
        System.out.println("5. Exit");
    }

    public static void keuzeSchermStrategy(){
        System.out.println("Van welke game wil je reviews zien? Maak een keuze:");
        System.out.println("1. Tetris");
        System.out.println("2. Warcraft");
        System.out.println("3. Dune II");
        System.out.println("4. Terug");
        System.out.println("5. Exit");
    }

    public static void keuzeSchermShooter(){
        System.out.println("Van welke game wil je reviews zien? Maak een keuze:");
        System.out.println("1. Doom");
        System.out.println("2. Call of Duty");
        System.out.println("3. Half-Life");
        System.out.println("4. Terug");
        System.out.println("5. Exit");
    }
}