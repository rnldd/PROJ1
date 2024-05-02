import java.util.Scanner;

public class Main {

    public static void keuzeSchermGenres(){
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int keuze;

        do {
            keuzeSchermGenres();
            keuze = scanner.nextInt();

            switch (keuze) {
                case 1: // Adventure genre
                    do {
                        keuzeSchermAdventure();
                        keuze = scanner.nextInt();
                        // Hier zouden acties voor de specifieke keuze voor Adventure games geïmplementeerd worden.
                    } while (keuze != 4);
                    break;
                case 2: // Strategy genre
                    do {
                        keuzeSchermStrategy();
                        keuze = scanner.nextInt();
                        // Hier zouden acties voor de specifieke keuze voor Strategy games geïmplementeerd worden.
                    } while (keuze != 4);
                    break;
                case 3: // Shooter genre
                    do {
                        keuzeSchermShooter();
                        keuze = scanner.nextInt();
                        // Hier zouden acties voor de specifieke keuze voor Shooter games geïmplementeerd worden.
                    } while (keuze != 4);
                    break;
                case 4: // Exit the main genres menu
                    System.out.println("Sluit applicatie");
                    break;
                default:
                    System.out.println("Ongeldige keuze, probeer het opnieuw.");
                    break;
            }
        } while (keuze != 4);

        scanner.close();

        // TODO case voor reviews per game laten zien (daarvoor moeten er eerst reviews bestaan)

        // Testnaam
        Klant klant = new Klant("Hannie de Boer");

        // Test reviews
        klant.koppelReview(new Review(12345, 8.5, 9.0, 7.0, "Geweldig spel met prachtige graphics, maar het verhaal is een beetje kort", klant));
        klant.koppelReview(new Review(67890, 7.5, 6.5, 9.0, "Leuk spel, maar de graphics kunnen beter", klant));

        // Output in console
        System.out.println("Reviews geschreven door klant: " + klant.getKlantNaam());

        for (Review review : klant.getGeschrevenReviews()) {
            System.out.println("Review ID: " + review.getReviewID());
            System.out.println("Gameplay beoordeling: " + review.getBeoordelingGameplay());
            System.out.println("Graphics beoordeling: " + review.getBeoordelingGraphics());
            System.out.println("Storyline beoordeling: " + review.getBeoordelingStoryline());
            System.out.printf("Gemiddelde beoordeling: %.2f \n", review.getGemiddelde()); // 2 decimalen
            System.out.println("Beschrijving: " + review.getBeschrijving());
            System.out.println();
        }
    }
}