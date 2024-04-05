class Review extends Game{
    public int reviewID;
    private double beoordelingGameplay;
    private double beoordelingGraphics;
    private double BeoordelingStoryline;
    private double beoordelingGemiddeld;
    private String beschrijving;

    public berekenGemiddelde(double beoordelingGameplay, double beoordelingGraphics, double beoordelingStoryline){
        this.beoordelingGemiddeld = (beoordelingGameplay + beoordelingGraphics + beoordelingStoryline)/3;
    }

    public addGemiddelde(){
        //voeg gemiddelde toe
    }

    public addBeoordeling(){
        //voeg beoordeling toe
    }

    //geschreven door?? private String klantID
    // (get klant id )
}
