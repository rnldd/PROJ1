abstract class Gebruiker {
    protected int gebruikersID;

    public Gebruiker(int gebruikersID) {
        this.gebruikersID = gebruikersID;
    }

    // Aangenomen dat subklassen van Gebruiker een methode nodig hebben om hun ID op te halen
    public int getGebruikersID() {
        return gebruikersID;
    }
}
