
import java.util.Scanner;

public class Vragenlijst {
    Scanner scanner = new Scanner(System.in);

    public void vraagInvullen() {
        System.out.println("Vond u de game leuk?");
        String gameLeuk = scanner.nextLine();
        System.out.println("Vindt u het spel de prijs waard");
        String prijsWaard = scanner.nextLine();
        System.out.println("Zou u dit spel aanraden aan je vrienden?");
        String spelAanraden = scanner.nextLine();
        naChecken(prijsWaard, gameLeuk, spelAanraden);
    }

    public void naChecken(String prijsWaard, String gameLeuk, String spelAanraden) {
        System.out.println("Vond u de game leuk? " + " = " + gameLeuk);
        System.out.println("Vindt u het spel de prijs waard? " + " = " + prijsWaard);
        System.out.println("Zou u dit spel aanraden aan je vrienden? " + " = " + spelAanraden);
        System.out.println("Klopt dit?");
        String antwoord = scanner.nextLine();
        if (antwoord.equalsIgnoreCase("Ja")) {
            System.out.println("Dank u wel!");
        } else {
            vraagInvullen();
        }
    }
}
