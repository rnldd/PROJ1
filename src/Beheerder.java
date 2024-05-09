import java.util.Scanner;

public class Beheerder extends Gebruiker {
    public Game game;
    public Beheerder(int gebruikersID, Game game) {
        super(gebruikersID);
        this.game = game;
    }
    public void pasPrijsAan(double nieuwePrijs) {
        System.out.println("Wat is de nieuwe prijs?");
        game.setPrijsGame(nieuwePrijs);
        System.out.println("De prijs is nu: €" + nieuwePrijs + ".");
    }
}
