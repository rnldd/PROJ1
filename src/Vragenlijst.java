import java.util.Scanner;

public class Vragenlijst {
    private Scanner scanner = new Scanner(System.in);

    public void vraagInvullen() {
        // Startvraag
        System.out.println("Is deze applicatie gebruiksvriendelijk? (y/n)");
        String gebruiksvriendelijk = scanner.nextLine().toLowerCase();

        // Afhankelijk van het antwoord op de eerste vraag, stel een andere vraag
        if (gebruiksvriendelijk.equals("y")) {
            System.out.println("Heeft u nog feedback voor deze applicatie? (y/n)");
            String negatiefCommentaar = scanner.nextLine().toLowerCase();
            if (negatiefCommentaar.equals("y")) {
                System.out.println("Wat zou u willen verbeteren?");
                String verbetering = scanner.nextLine();
                System.out.println("Uw feedback: " + verbetering + " is genoteerd. Dank u!");
            } else {
                System.out.println("Dank u voor uw positieve feedback!");
            }
        } else if (gebruiksvriendelijk.equals("n")) {
            System.out.println("Heeft dit te maken met de interface? (y/n)");
            String overInterface = scanner.nextLine().toLowerCase();

            if (overInterface.equals("y")) {
                System.out.println("Wat aan de interface zou u willen verbeteren?");
                String interfaceVerbetering = scanner.nextLine();
                System.out.println("Uw feedback over de interface: " + interfaceVerbetering + " is genoteerd. Dank u!");
            } else {
                System.out.println("Wat zijn de andere aspecten die u niet gebruiksvriendelijk vindt?");
                String andereAspecten = scanner.nextLine();
                System.out.println("Uw feedback: " + andereAspecten + " is genoteerd. Dank u!");
            }
        } else {
            System.out.println("Ongeldig antwoord. Antwoord alstublieft met 'y' voor ja of 'n' voor nee.");
            vraagInvullen();  // Herhaal de vraag bij ongeldig antwoord
        }
    }
}
