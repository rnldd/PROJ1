import java.util.ArrayList;
class Klant extends Gebruiker {
    private String klantnaam;
    private ArrayList<Review> geschrevenReviews;

    public Klant() {
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
}
