class Gebruiker {
    private int gebruikersID;
    private String naam;
    private String gebruikersnaam;
    private String wachtwoord;

    public Gebruiker(int gebruikersID) {
        this.gebruikersID = gebruikersID;
    }

    public Gebruiker(String naam){
        this.naam = naam;
    }

    public Gebruiker(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }

    public  void toonRanglijst() {
        Review.Ranglijst();
    }
    public  void toonUitverkoop(){
        //TODO TOON UIOTVERKOPEN
    }
    public int getGebruikersID() {
        return gebruikersID;
    }

    public String getNaam() {
        return naam;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }
}
