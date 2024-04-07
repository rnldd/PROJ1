import java.util.ArrayList;
public class Game {
    private static ArrayList <Game> alleGenres;
    private String genreGame;
    private String titelGame;
    private double prijsGame;
    private double gameKorting;
    private ArrayList<Review>reviewsLijst;

    Game(ArrayList<Game> alleGenres, String genreGame, String titelGame,
         double prijsGame, double gameKorting, ArrayList<Review>ReviewsLijst) {
        this.alleGenres = alleGenres;
        this.genreGame = genreGame;
        this.titelGame = titelGame;
        this.prijsGame = prijsGame;
        this.gameKorting = gameKorting;
        this.reviewsLijst = reviewsLijst;
    }

    public static void sorteerReview(ArrayList<Review> reviewsLijst) {
        // TODO Reviews sorteren
    }

    public void addGameKorting(double prijsGame, double gameKorting){
        //TODO Korting doen
    }

    public void addReview (ArrayList<Review> reviewsLijst) {
        // TODO Reviews toevoegen
    }

    public void addGenre(String genreGame){
        // TODO Genre toevoegen aan game
    }

    public void voegBeoordelingtoe(){
        //TODO Beoordeling toevoegen
    }

    public void berekenGemmBeoordeling(){
        //TODO berekenen van Gemm Beoordeling
    }


}
