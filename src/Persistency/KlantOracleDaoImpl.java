package Persistency;

import Domain.Klant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KlantOracleDaoImpl extends OracleBaseDao implements KlantDao {
    public KlantOracleDaoImpl() throws SQLException {
        super();
    }

    @Override
    public Klant findByID(int ID) throws SQLException {
        String strQuery = "SELECT * FROM klant WHERE id = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(strQuery);
        pstmt.setInt(1, ID);
        ResultSet rs = pstmt.executeQuery();
        Klant k = new Klant();
        while (rs.next()) {
            k.setID(rs.getInt("id"));
            k.setNaam(rs.getString("naam"));
        }
        rs.close();
        pstmt.close();
        return k;
    }

    @Override
    public boolean insertKlant(Klant klant) throws SQLException{
        String strQuery = "INSERT INTO klant (id, naam) VALUES (?,?)";
        PreparedStatement pstmt = getConnection().prepareStatement(strQuery);
        pstmt.setInt(1, klant.getID());
        pstmt.setString(2, klant.getNaam());
        pstmt.execute();
        //eventueel nog een findById uitvoeren en controles doen, daarna return true/false
        return true;
    }

    @Override
    public boolean updateKlant(Klant klant) throws SQLException{
        String strQuery = "UPDATE klant set naam = ? WHERE id = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(strQuery);
        pstmt.setString(1, klant.getNaam());
        pstmt.setInt(2, klant.getID());
        pstmt.executeUpdate();
        Klant k = new Klant();
        pstmt.close();
        return true;
    }

    @Override
    public boolean deleteKlant(Klant klant) throws SQLException{
        String strQuery = "DELETE FROM klant WHERE id = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(strQuery);
        pstmt.setInt(1, klant.getID());
        pstmt.execute();
        return true;
    }
}
