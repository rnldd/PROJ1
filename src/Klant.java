import java.util.ArrayList;
class Klant {
    private int klantID;
    private ArrayList<Review> geschrevenReviews;

    public Klant(int klantID) {
        this.klantID = klantID;
        this.geschrevenReviews = new ArrayList<>();
    }

    public void koppelReview(Review review) {
        // Voeg review toe aan lijst met reviews van de klant
        geschrevenReviews.add(review);
        review.setKlant(this);
    }

    public ArrayList<Review> getGeschrevenReviews() {
        return geschrevenReviews;
    }

    public int getKlantID() {
        return klantID;
    }
}
