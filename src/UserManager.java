import java.io.*;
import java.util.ArrayList;
class UserManager {
    private ArrayList<Gebruiker> gebruikers = new ArrayList<>();
    private static final String USERS_FILE_PATH = "users.ser";

    public ArrayList<Gebruiker> getGebruikers() {
        return gebruikers;
    }

    public void laadGebruikers(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USERS_FILE_PATH))) {
            gebruikers = (ArrayList<Gebruiker>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Geen opgeslagen gebruikers gevonden. Een nieuw bestand zal worden aangemaakt.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void SlaGebruikersOp(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USERS_FILE_PATH))) {
            oos.writeObject(gebruikers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
