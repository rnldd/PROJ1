import java.util.*;

public class Review {
    private static List<Review> alleReviews = new ArrayList<>();

    public int reviewID;

    private double beoordelingGameplay;
    private double beoordelingGraphics;
    private double beoordelingStoryline;
    private double gemiddelde;
    private String beschrijving;
    private Klant klant;
    private Scanner scanner;
    private Game game;
    private Vragenlijst vragenlijst = new Vragenlijst();

    public Review(int reviewID, double beoordelingGameplay, double beoordelingGraphics,
                  double beoordelingStoryline, String beschrijving, Klant klant, Game game) {
        this.reviewID = reviewID;
        this.beoordelingGameplay = beoordelingGameplay;
        this.beoordelingGraphics = beoordelingGraphics;
        this.beoordelingStoryline = beoordelingStoryline;
        this.beschrijving = beschrijving;
        this.klant = klant;
        this.berekenGemiddelde();
        this.vraagOverVragenlijst();
        alleReviews.add(this);
    }

    public double berekenGemiddelde(){
         return gemiddelde = (beoordelingGameplay + beoordelingGraphics + beoordelingStoryline) / 3;
    }

    private void vraagOverVragenlijst() {
        System.out.print("Wil je een vragenlijst invullen? (y/n): ");
        String antwoord = scanner.nextLine();

        if (antwoord.equals("y")) {
            toonVragenlijst();
        } else {
            System.out.println("Oke, bedankt voor je review!");
        }
    }

    public static void Ranglijst() {
        alleReviews.sort(new Comparator<Review>() {
            @Override
            public int compare(Review r1, Review r2) {
                return Double.compare(r2.gemiddelde, r1.gemiddelde);
            }
        });

        System.out.println("Gemiddelde beoordelingen, van hoog naar laag:");
        for (Review review : alleReviews) {
            System.out.printf("Review ID %d: %f\n", review.reviewID, review.gemiddelde);
        }
    }

    private void toonVragenlijst() {
        System.out.println("Vragenlijst wordt gestart...");
        vragenlijst.vraagInvullen();
    }

    public double getBeoordelingGameplay() {
        return beoordelingGameplay;
    }

    public double getBeoordelingGraphics() {
        return beoordelingGraphics;
    }

    public double getBeoordelingStoryline() {
        return beoordelingStoryline;
    }

    public Klant getKlant() {
        return klant;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public double getGemiddelde() {
        return gemiddelde;
    }

    public Game getGame() {
        return game;
    }

    public int getReviewID() {
        return reviewID;
    }
}



