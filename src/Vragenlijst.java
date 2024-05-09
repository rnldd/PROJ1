
import java.util.Scanner;

public class Vragenlijst {
    Scanner scanner = new Scanner(System.in);

    public void vraagInvullen() {
        System.out.println("Vond u de game leuk?");
        String gameLeuk = scanner.nextLine();
        System.out.println("Vind u de spel prijs waard");
        String prijsWaard = scanner.nextLine();
        System.out.println("Zou je deze spel aanraden voor je vrienden?");
        String spelAanraden = scanner.nextLine();
        naChecken(prijsWaard, gameLeuk, spelAanraden);
    }

    public void naChecken(String prijsWaard, String gameLeuk, String spelAanraden) {
        System.out.println("Vond u de game leuk? " + " = " + gameLeuk);
        System.out.println("Vind u de spel prijs waard " + " = " + prijsWaard);
        System.out.println("Zou je deze spel aanraden voor je vrienden? " + " = " + spelAanraden);
        System.out.println("Klopt dit?");
        String antwoord = scanner.nextLine();
        if (antwoord.equalsIgnoreCase("Ja")) {
            System.out.println("Dank u wel!");
        } else {
            vraagInvullen();
        }
    }
}
