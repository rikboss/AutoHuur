package Domain;

public class Klant {



    private int ID;



    private String naam;
    private double kortingsPercentage;

    public Klant() {
    }

    public Klant(String nm){
        naam = nm;
    }

    public Klant(int ID,String naam){
        this.ID = ID;
        this.naam = naam;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
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
