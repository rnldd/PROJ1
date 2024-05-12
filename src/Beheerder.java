import java.util.Scanner;

public class Beheerder extends Gebruiker {

    Scanner scanner = new Scanner(System.in);
    public Game game;
    public Beheerder(int gebruikersID, Game game) {
        super(gebruikersID);
        this.game = game;
    }
    public Beheerder(String gebruikersnaam, String wachtwoord){
        super(gebruikersnaam,wachtwoord);
    }
    public void pasPrijsAan() {
        System.out.println("Wat is de nieuwe prijs?");
        double nieuwePrijs = scanner.nextDouble();
        scanner.next();
        game.setPrijsGame(nieuwePrijs);
        System.out.println("De prijs is nu: €" + nieuwePrijs + ".");
    }
}
