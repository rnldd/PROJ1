import java.util.ArrayList;
import java.util.Scanner;

public class Klant extends Gebruiker{
    private ArrayList<Review> geschrevenReviews;
    private Scanner scanner;

    public Klant(String naam) {
        super(naam);
        this.geschrevenReviews = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    public Klant(String gebruikersnaam, String wachtwoord){
        super(gebruikersnaam, wachtwoord);
        this.geschrevenReviews = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void schrijfReview(){
        //TODO ZOEK GAME. en doe
            System.out.println("Schrijf je review voor: " + game.getTitelGame());
            System.out.print("Gameplay beoordeling (1-10): ");
            double gameplayBeoordeling = scanner.nextDouble();
            System.out.print("Graphics beoordeling (1-10): ");
            double graphicsBeoordeling = scanner.nextDouble();
            System.out.print("Storyline beoordeling (1-10): ");
            double storylineBeoordeling = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Beschrijving van de review: ");
            String beschrijving = scanner.nextLine();

            Review review = new Review(geschrevenReviews.size() + 1, gameplayBeoordeling, graphicsBeoordeling, storylineBeoordeling, beschrijving, this, game);
            geschrevenReviews.add(review);
            game.addReview(review);
    }

    public void toonReviews(){
        if (geschrevenReviews.isEmpty()) {
            System.out.println("Er zijn geen reviews geschreven.");
            return;
        }

        for (Review review : geschrevenReviews) {
            System.out.println("Review geschreven door: " + review.getKlant());
            System.out.println("Game: " + review.getGame().getTitelGame());
            System.out.println("Beoordeling Gameplay: " + review.getBeoordelingGameplay());
            System.out.println("Beoordeling Graphics: " + review.getBeoordelingGraphics());
            System.out.println("Beoordeling Storyline: " + review.getBeoordelingStoryline());
            System.out.println("Gemiddelde beoordeling: " + review.getGemiddelde());
            System.out.println("Beschrijving: " + review.getBeschrijving());
            System.out.println();
        }
    }
}



