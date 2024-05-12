import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Game {
    private String genreGame;
    private String titelGame;
    private double prijsGame;
    private double gemiddelde;
    private ArrayList<Review> reviewsLijst = new ArrayList<>();

    Game(String genreGame, String titelGame,
         double prijsGame) {
        this.genreGame = genreGame;
        this.titelGame = titelGame;
        this.prijsGame = prijsGame;
    }

    public void addReview(Review review) {
        reviewsLijst.add(review);
        this.berekenGemiddelde(); // Update gemiddelde na toevoegen review
    }

    public void verwijderReview(Review review){
        reviewsLijst.remove(review);
        this.berekenGemiddelde(); // Update gemiddelde na verwijderen review
    }

    public double berekenGemiddelde() {
        int aantal = 0;
        double somGemiddelden = 0;
        for (Review review : reviewsLijst) {
            somGemiddelden = somGemiddelden + review.getGemiddelde();
            aantal = aantal + 1;
        }
        return somGemiddelden / aantal;
    }

    public void toonAlleReviews(){
        if (reviewsLijst.isEmpty()) {
            System.out.println("Er zijn nog geen reviews voor " + titelGame + ".");
            return;
        }
        System.out.println("Reviews voor " + titelGame + ":");
        for (Review review : reviewsLijst) {
            System.out.println("Review ID: " + review.getReviewID());
            System.out.println("Review geschreven door: " + review.getKlant().getNaam());
            System.out.println("Beoordeling Gameplay: " + review.getBeoordelingGameplay());
            System.out.println("Beoordeling Graphics: " + review.getBeoordelingGraphics());
            System.out.println("Beoordeling Storyline: " + review.getBeoordelingStoryline());
            System.out.printf("Gemiddelde beoordeling: %.2f\n", review.getGemiddelde());
            System.out.println("Beschrijving: " + review.getBeschrijving());
            System.out.println();
        }

    }

    public double getPrijsGame() {
        return prijsGame;
    }
    public void setPrijsGame(double prijsGame) {
        this.prijsGame = prijsGame;
    }
    public String getTitelGame() {
        return titelGame;
    }
}
