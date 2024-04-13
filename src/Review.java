import java.util.ArrayList;

public class Review {
    public int reviewID;
    private double beoordelingGameplay;
    private double beoordelingGraphics;
    private double beoordelingStoryline;
    private double gemiddelde;
    private String beschrijving;
    private Klant klant;

    public Review(int reviewID, double beoordelingGameplay, double beoordelingGraphics, double beoordelingStoryline, String beschrijving, Klant klant) {
        this.reviewID = reviewID;
        this.beoordelingGameplay = beoordelingGameplay;
        this.beoordelingGraphics = beoordelingGraphics;
        this.beoordelingStoryline = beoordelingStoryline;
        this.beschrijving = beschrijving;
        this.klant = klant;
        this.berekenGemiddelde();
    }

    public void berekenGemiddelde() {
        this.gemiddelde = (this.beoordelingGameplay + this.beoordelingGraphics + this.beoordelingStoryline) / 3;
    }

    public void addBeoordeling(double beoordelingGameplay, double beoordelingGraphics, double beoordelingStoryline, String beschrijving) {
        // Update de huidige waarden met de nieuwe beoordelingen en herbereken het gemiddelde
        this.beoordelingGameplay = beoordelingGameplay;
        this.beoordelingGraphics = beoordelingGraphics;
        this.beoordelingStoryline = beoordelingStoryline;
        this.beschrijving = beschrijving;
        this.berekenGemiddelde();
    }

    public int getReviewID() {
        return reviewID;
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
