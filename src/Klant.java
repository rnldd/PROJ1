import java.util.ArrayList;
import java.util.Scanner;

public class Klant extends Gebruiker{
    private ArrayList<Review> geschrevenReviews;

    public Klant(String naam) {
        super(naam);
        this.geschrevenReviews = new ArrayList<>();
    }
    public Klant(String gebruikersnaam, String wachtwoord){
        super(gebruikersnaam,wachtwoord);
    }

    public void schrijfReview(Game game, Scanner scanner){
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
        // TODO deze methode
    }
}



