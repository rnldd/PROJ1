import java.util.ArrayList;
class Klant extends Gebruiker {
    private String klantnaam;
    private ArrayList<Review> geschrevenReviews;

    public Klant(int gebruikersID, String klantnaam) {
        super(gebruikersID);
        this.klantnaam = klantnaam;
        this.geschrevenReviews = new ArrayList<>();
    }

    public void koppelReview(Review review) {
        // Voeg review toe aan lijst met reviews van de klant
        if (review != null && !this.geschrevenReviews.contains(review)) {
            this.geschrevenReviews.add(review);
            review.setKlant(this);
        }
    }

    public ArrayList<Review> getGeschrevenReviews() {
        return new ArrayList<>(this.geschrevenReviews);
    }

    public int getKlantID(){
        return super.getGebruikersID();
    }
}
