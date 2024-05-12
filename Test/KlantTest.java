import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.junit.Assert.*;

public class KlantTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private Klant klant;
    private Game game;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        klant = new Klant("testGebruiker", "testWachtwoord");
        game = new Game("RPG", "Zelda", 49.99);

        // Schrijven van een test review
        Scanner scanner = new Scanner("8\n9\n10\nGeweldig spel!");
        klant.schrijfReview(game);
        scanner.close();
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }


    // Test of reviews op de goede manier gedisplayed worden
    @Test
    public void testToonReviews() {
        klant.toonReviews();
        String expectedOutput = "Review geschreven door: testGebruiker\n" +
                "Game: Zelda\n" +
                "Beoordeling Gameplay: 8.0\n" +
                "Beoordeling Graphics: 9.0\n" +
                "Beoordeling Storyline: 10.0\n" +
                "Gemiddelde beoordeling: 9.0\n" +
                "Beschrijving: Geweldig spel!\n\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
