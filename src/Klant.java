import java.util.ArrayList;

public class Klant {
    private String klantNaam;
    private ArrayList<Review> geschrevenReviews;

    public Klant(String klantNaam) {
        this.klantNaam = klantNaam;
        this.geschrevenReviews = new ArrayList<>();
    }

    public void koppelReview(Review review) {
        geschrevenReviews.add(review);
    }

    public ArrayList<Review> getGeschrevenReviews(){
        return geschrevenReviews;
    }

    public String getKlantNaam() {
        return klantNaam;
    }
}

