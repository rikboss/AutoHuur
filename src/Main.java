import Domain.Auto;
import Domain.AutoHuur;
import Domain.Klant;
import Persistency.AutoHuurDao;
import Persistency.AutoHuurOracleDaoImpl;
import Persistency.KlantDao;
import Persistency.KlantOracleDaoImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        //Test persistence klant
        KlantDao dao = new KlantOracleDaoImpl(); //je kunt hier ook kiezen voor de mysql versie zodra die af is
        Klant k = dao.findByID(1);
        System.out.println("Record 1 = " + k);

        Klant knew = new Klant(2,"Henk");
        dao.insertKlant(knew);
        Klant k2 = dao.findByID(2);
        System.out.println("Nieuwe klant = " + k2);

        //Test persistence autohuur
        AutoHuurDao adao = new AutoHuurOracleDaoImpl();
        AutoHuur a = adao.findByID(1);
        System.out.println("Autohuur record 1 = " + a);

//        AutoHuur ah1 = new AutoHuur();
//// Print "Eerste autohuur: " + ah1.toString()
//
//        Klant k = new Klant("Mijnheer de Vries");
//        k.setKorting(10.0);
//        ah1.setHuurder(k);
//// Print: "Eerste autohuur: " + ah1.toString()
//        System.out.println("Eerste autohuur: " + ah1.toString());
//
//        Auto a1 = new Auto("Peugeot 207", 50);
//        ah1.setGehuurdeAuto(a1);
//        ah1.setAantalDagen(4);
//        System.out.println("Eerste autohuur: " + ah1.toString());
//
//// Print "Eerste autohuur:" + ah1.toString()
//
//        AutoHuur ah2 = new AutoHuur( );
//        Auto a2 = new Auto("Ferrari", 3500);
//        ah2.setGehuurdeAuto(a2);
//        ah2.setHuurder(k);
//        ah2.setAantalDagen(1);
//        System.out.println("Tweede autohuur: " + ah2.toString());
//
//// Print "Tweede autohuur: " + ah2.toString()
//
//// Print "Gehuurd: " + ah1.getGehuurdeAuto()
//// Print "Gehuurd: " + ah2.getGehuurdeAuto()
//        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
//        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
//

    }
}
