public class Klant {

    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    @Override
    public String toString() {
        return naam;
    }
}
