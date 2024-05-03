import java.util.ArrayList;
import java.util.List;

public class TestData {
    private List<Game> games;
    private Klant klant;

    public TestData(String klantNaam) {
        this.klant = new Klant(klantNaam);
        this.games = createGames();
        koppelReviewsAanKlant();
    }

    private List<Game> createGames() {
        List<Game> games = new ArrayList<>();

        // Adventure games
        Game zelda = new Game("Adventure", "The Legend of Zelda", 45.99);
        zelda.addReview(new Review(1, 9.0, 8.5, 9.5, "Fantastisch avontuur en uitdagende puzzels", zelda));
        zelda.addReview(new Review(2, 9.0, 8.0, 9.0, "Een klassieker die nog steeds geweldig is", zelda));
        games.add(zelda);

        Game castlevania = new Game("Adventure", "Castlevania", 39.99);
        castlevania.addReview(new Review(3, 8.0, 8.5, 7.5, "Geweldige actie, moeilijk maar eerlijk", castlevania));
        games.add(castlevania);

        Game finalFantasyVII = new Game("Adventure", "Final Fantasy VII", 49.99);
        finalFantasyVII.addReview(new Review(4, 9.5, 9.0, 9.8, "Een episch verhaal met diepgaande personages", finalFantasyVII));
        games.add(finalFantasyVII);

        // Strategy games
        Game tetris = new Game("Strategy", "Tetris", 14.99);
        tetris.addReview(new Review(5, 8.5, 8.0, 7.0, "Verslavend en leuk, perfect voor korte sessies", tetris));
        games.add(tetris);

        Game warcraft = new Game("Strategy", "Warcraft", 44.99);
        warcraft.addReview(new Review(6, 9.0, 9.5, 9.2, "Fantastische RTS met een rijke lore", warcraft));
        games.add(warcraft);

        Game duneII = new Game("Strategy", "Dune II", 34.99);
        duneII.addReview(new Review(7, 8.0, 8.5, 8.5, "De grootvader van moderne RTS-games", duneII));
        games.add(duneII);

        // Shooter games
        Game doom = new Game("Shooter", "Doom", 49.99);
        doom.addReview(new Review(8, 9.5, 9.0, 8.0, "Extreem verslavend en uitdagend", doom));
        games.add(doom);

        Game callOfDuty = new Game("Shooter", "Call of Duty", 59.99);
        callOfDuty.addReview(new Review(9, 8.0, 8.5, 7.5, "Snelle actie en boeiende multiplayer", callOfDuty));
        games.add(callOfDuty);

        Game halfLife = new Game("Shooter", "Half-Life", 54.99);
        halfLife.addReview(new Review(10, 9.5, 9.8, 9.9, "Revolutionair spel dat het FPS-genre heeft veranderd", halfLife));
        games.add(halfLife);

        return games;
    }

    private void koppelReviewsAanKlant() {
        for (Game game : games) {
            for (Review review : game.getReviewsLijst()) {
                klant.koppelReview(review);
            }
        }
    }

    public List<Game> getGames() {
        return games;
    }

    public Klant getKlant() {
        return klant;
    }
}
