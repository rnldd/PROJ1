import java.util.ArrayList;

public class Vragenlijst {
    private ArrayList<Vraag> lijstMetVragen;
    private String ingevuldeAntwoord;
    private int huidigeVraagIndex; // Deze index houdt bij welke vraag momenteel wordt getoond

    public Antwoordenlijst() {
        this.lijstMetVragen = new ArrayList<>();
        this.ingevuldeAntwoord = ""; // Initializeer als lege string
        this.huidigeVraagIndex = 0; // Begin bij de eerste vraag
    }

    public Vraag volgendeVraag() {
        if (huidigeVraagIndex < lijstMetVragen.size()) {
            Vraag huidigeVraag = lijstMetVragen.get(huidigeVraagIndex);
            huidigeVraagIndex++; // Verhoog de index om de volgende keer de volgende vraag te tonen
            return huidigeVraag;
        }
        return null; // Geen volgende vraag beschikbaar
    }

    public void setIngevuldeAntwoord(String antwoord) {
        this.ingevuldeAntwoord = antwoord;
    }

    public String getIngevuldeAntwoord() {
        return ingevuldeAntwoord;
    }

    public ArrayList<Vraag> getLijstMetVragen() {
        return lijstMetVragen;
    }

    public int getHuidigeVraagIndex() {
        return huidigeVraagIndex;
    }
}
