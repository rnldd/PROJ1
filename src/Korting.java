public class Korting {
    public static int berekenNieuwePrijs(Game game, int percentage) {
        return (int)(game.getPrijsGame() * (1 - percentage / 100.0));
    }
}
