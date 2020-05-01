package Domain;

public class AutoHuur implements Contract {
    private int ID;
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public double totaalPrijs(){
        if (gehuurdeAuto == null || huurder == null)
            return 0;
        else
            return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1-huurder.getKorting()/100);
    }


    @Override
    public String toString() {
        String result = "\n";
        try {
            result += "autotype: " + gehuurdeAuto.toString() + " met prijs per dag: " +
                    gehuurdeAuto.getPrijsPerDag() + "\n";
        }catch (NullPointerException e){
            result += "er is geen auto bekend \n";
        }
        try {
            result += "op naam van: " + huurder.toString() +
                    " (korting: " + huurder.getKorting() + ")\n";
        }catch(NullPointerException e){
            result += "er is geen huurder bekend \n";
        }
        result += "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs() + "\n";
        result += "\n";
        return result;
    }
}
