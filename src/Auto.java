public class Auto {

    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        type = tp;
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prPd) {
        prijsPerDag = prPd;
    }

    @Override
    public String toString() {
        return type;
    }
}
