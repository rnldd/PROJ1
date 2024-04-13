import java.util.ArrayList;
public class Game {
    private static ArrayList <Game> alleGenres = new ArrayList<>();
    private String genreGame;
    private String titelGame;
    private double prijsGame;
    private ArrayList<Review>reviewsLijst;

    Game(ArrayList<Game> alleGenres, String genreGame, String titelGame,
         double prijsGame, ArrayList<Review>ReviewsLijst) {
        this.alleGenres = alleGenres;
        this.genreGame = genreGame;
        this.titelGame = titelGame;
        this.prijsGame = prijsGame;
        this.reviewsLijst = new ArrayList<>();
    }

    public static void sorteerReviews(ArrayList<Review> reviewsLijst) {
        // TODO Reviews sorteren
    }

    public void addGameKorting(double prijsGame){
        //TODO Korting doen
    }

    public void addReview (Review review) {
        if (review != null && !this.reviewsLijst.contains(review)) {
            this.reviewsLijst.add(review);
        }
    }

    public static void addGenre(Game game){
        if (game != null && !alleGenres.contains(game)) {
            alleGenres.add(game);
        }
    }

    public void voegBeoordelingToe(double gameplay, double graphics, double storyline, String beschrijving, Klant klant) {
        Review nieuweReview = new Review(reviewsLijst.size() + 1, gameplay, graphics, storyline, beschrijving, klant);
        this.addReview(nieuweReview);
    }

    public double berekenGemmBeoordeling(){
        if (reviewsLijst.isEmpty()) {
            return 0; // Als er geen reviews zijn, return 0
        } else {
            double totaal = 0;
            for (Review review : reviewsLijst) {
                totaal += review.getGemiddelde(); // Veronderstelt dat Review een methode getGemiddelde() heeft
            }
            return totaal / reviewsLijst.size(); // Bereken het gemiddelde
        }
    }

    public String getGenreGame() {
        return genreGame;
    }

    public void setGenreGame(String genreGame) {
        this.genreGame = genreGame;
    }

    public String getTitelGame() {
        return titelGame;
    }

    public double getPrijsGame() {
        return prijsGame;
    }

    public ArrayList<Review> getReviewsLijst() {
        return reviewsLijst;
    }
}
