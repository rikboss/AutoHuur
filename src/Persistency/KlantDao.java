package Persistency;

import Domain.Klant;

import java.sql.SQLException;

public interface KlantDao {
    Klant findByID (int ID) throws SQLException;
    boolean insertKlant (Klant klant) throws SQLException;
    boolean updateKlant (Klant klant) throws SQLException;
    boolean deleteKlant (Klant klant) throws SQLException;
}
