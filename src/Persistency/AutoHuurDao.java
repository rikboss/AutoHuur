package Persistency;

import Domain.AutoHuur;
import Domain.Klant;

import java.sql.SQLException;
import java.util.List;

public interface AutoHuurDao {
    AutoHuur findByID (int ID) throws SQLException;
    List<AutoHuur> findByKlant (Klant klant) throws SQLException;
}
