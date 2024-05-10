import java.util.ArrayList;
import java.util.Scanner;

public class Security {
    private transient final UserManager userManager;
    private boolean ingelogd = false;
    private final Scanner keyboard = new Scanner(System.in);

    public Security(UserManager userManager){
        this.userManager = userManager;
    }

    public Gebruiker login() {
        System.out.println("Voer uw gebruikersnaam en wachtwoord in om in te loggen.");
        String gebruikersnaam = keyboard.nextLine();
        String wachtwoord = keyboard.nextLine();

        for (Gebruiker gebruiker : userManager.getGebruikers()) {
            if (gebruiker.getGebruikersnaam().equals(gebruikersnaam) && gebruiker.getWachtwoord().equals(wachtwoord)) {
                ingelogd = true;
                System.out.println();
                System.out.println("Welkom " + gebruiker.getNaam() + "!");
                System.out.println();
                return gebruiker;
            }
        }
        if(!ingelogd){
            System.out.println("De ingevoerde gebruikersnaam of wachtwoord is incorrect, of u bent niet geregistreerd in ons systeem.");
            System.out.println("Registreer uzelf als dietist (indien u dit natuurlijk bent), of vraag uw dietist u te registreren als klant.");
        }
        return null;
    }
    public void logUit(){
        ingelogd = false;
    }
    public ArrayList<Gebruiker> getGebruikers() {
        return userManager.getGebruikers();
    }
    public void addGebruiker(Gebruiker gebruiker){
        userManager.getGebruikers().add(gebruiker);
    }
}
