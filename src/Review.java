import java.util.ArrayList;

class Review extends Game{
    public int reviewID;
    private double beoordelingGameplay;
    private double beoordelingGraphics;
    private double BeoordelingStoryline;
    private double beoordelingGemiddeld;
    private String beschrijving;

    public Review(ArrayList<Game> alleGenres, String genreGame, String titelGame, double prijsGame, double gameKorting, ArrayList<Review> ReviewsLijst) {
        super(alleGenres, genreGame, titelGame, prijsGame, gameKorting, ReviewsLijst);
    }

    public void berekenGemiddelde(double beoordelingGameplay, double beoordelingGraphics, double beoordelingStoryline){
        this.beoordelingGemiddeld = (beoordelingGameplay + beoordelingGraphics + beoordelingStoryline)/3;
    }

    public void addGemiddelde(){
        //voeg gemiddelde toe
    }

    public void addBeoordeling(){
        //voeg beoordeling toe
    }

    //geschreven door?? private String klantID
    // (get klant id )
}
