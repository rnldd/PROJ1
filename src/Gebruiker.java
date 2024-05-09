abstract class Gebruiker {
    private int gebruikersID;
    private String naam;

    public Gebruiker(int gebruikersID) {
        this.gebruikersID = gebruikersID;
    }

    public Gebruiker(String naam){
        this.naam = naam;
    }

    public static void toonRanglijst(){
        //TODO SHOW DE RANG LIJST l:DDDD ;OLLKOLOLOL
    }
    public static void toonUitverkoop(){
        //TODO TOON UIOTVERKOPEN
    }
    public String getNaam() {
        return naam;
    }

    public int getGebruikersID() {
        return gebruikersID;
    }
}
