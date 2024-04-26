public class Review {
    public int reviewID;
    private double beoordelingGameplay;
    private double beoordelingGraphics;
    private double beoordelingStoryline;
    private double gemiddelde;
    private String beschrijving;
    private Klant klant;

    public Review(int reviewID, double beoordelingGameplay, double beoordelingGraphics,
                  double beoordelingStoryline, String beschrijving, Klant klant) {
        this.reviewID = reviewID;
        this.beoordelingGameplay = beoordelingGameplay;
        this.beoordelingGraphics = beoordelingGraphics;
        this.beoordelingStoryline = beoordelingStoryline;
        this.beschrijving = beschrijving;
        this.klant = klant;
        this.berekenGemiddelde();
    }

    public void berekenGemiddelde(){
        gemiddelde = (beoordelingGameplay + beoordelingGraphics + beoordelingStoryline) / 3;
    }

    public void addBeoordeling() {
        if (klant != null){
            klant.koppelReview(this);
        }
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public double getBeoordelingGameplay() {
        return beoordelingGameplay;
    }

    public void setBeoordelingGameplay(double beoordelingGameplay) {
        this.beoordelingGameplay = beoordelingGameplay;
    }

    public double getBeoordelingGraphics() {
        return beoordelingGraphics;
    }

    public void setBeoordelingGraphics(double beoordelingGraphics) {
        this.beoordelingGraphics = beoordelingGraphics;
    }

    public double getBeoordelingStoryline() {
        return beoordelingStoryline;
    }

    public void setBeoordelingStoryline(double beoordelingStoryline) {
        this.beoordelingStoryline = beoordelingStoryline;
    }

    public double getGemiddelde() {
        return gemiddelde;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }
}
