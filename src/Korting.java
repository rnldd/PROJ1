import java.util.ArrayList;

public class Korting {
    private String spelTitel;
    private double kortingPercentage;

    public Korting(String spelTitel, double kortingPercentage) {
        this.spelTitel = spelTitel;
        this.kortingPercentage = kortingPercentage;
    }

    public String getSpelTitel() {
        return spelTitel;
    }

    public double getKortingPercentage() {
        return kortingPercentage;
    }

    public void setSpelTitel(String spelTitel) {
        this.spelTitel = spelTitel;
    }

    public void setKortingPercentage(double kortingPercentage) {
        this.kortingPercentage = kortingPercentage;
    }
}
