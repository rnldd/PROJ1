public class Korting {

    private int percentage;

    public Korting(int percentage){
        this.percentage = percentage;
    }
    public static int berekenNieuwePrijs(Game game, int percentage) {
        return (int)(game.getPrijsGame() * (1 - percentage / 100.0));
    }
}
