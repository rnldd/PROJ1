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

    public double getPrijsGame() {
        return prijsGame;
    }

    public void setPrijsGame(double prijsGame) {
        this.prijsGame = prijsGame;
    }

    public void addReview(Review review) {
        reviewsLijst.add(review);
    }

    public void verwijderReview(Review review){
        reviewsLijst.remove(review);
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
}
