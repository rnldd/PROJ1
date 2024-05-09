public class Beheerder extends Gebruiker {
    public Game game;
    public Beheerder(int gebruikersID, Game game) {
        super(gebruikersID);
        this.game = game;
    }
    public void pasPrijsAan(double nieuwePrijs) {
        game.setPrijsGame(nieuwePrijs);
    }
}
