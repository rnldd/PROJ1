import java.util.Scanner;

public class Review {
    public int reviewID;
    private double beoordelingGameplay;
    private double beoordelingGraphics;
    private double beoordelingStoryline;
    private double gemiddelde;
    private String beschrijving;
    private Klant klant;
    private Scanner scanner;
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
    }

    public double berekenGemiddelde(){
         return gemiddelde = (beoordelingGameplay + beoordelingGraphics + beoordelingStoryline) / 3;
    }

    public double getGemiddelde() {
        return gemiddelde;
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

    private void toonVragenlijst() {
        System.out.println("Vragenlijst wordt gestart...");
        vragenlijst.vraagInvullen();
    }
}


