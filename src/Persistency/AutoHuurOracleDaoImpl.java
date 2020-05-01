package Persistency;

import Domain.AutoHuur;
import Domain.Klant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutoHuurOracleDaoImpl extends OracleBaseDao implements AutoHuurDao{
    public AutoHuurOracleDaoImpl() throws SQLException {
        super();
    }

    @Override
    public AutoHuur findByID(int ID) throws SQLException{
        String strQuery = "SELECT * FROM autohuur WHERE id = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(strQuery);
        pstmt.setInt(1, ID);
        ResultSet rs = pstmt.executeQuery();
        AutoHuur ah = new AutoHuur();
        KlantDao kdao = new KlantOracleDaoImpl();
        while (rs.next()) {
            ah.setID(rs.getInt("id"));
            ah.setAantalDagen(rs.getInt("dagen"));
            ah.setHuurder(kdao.findByID(rs.getInt("klant")));
        }
        rs.close();
        pstmt.close();
        return ah;
    }

    @Override
    public List<AutoHuur> findByKlant(Klant klant) throws SQLException {
        String strQuery = "SELECT * FROM autohuur WHERE klant = ?";
        PreparedStatement pstmt = getConnection().prepareStatement(strQuery);
        pstmt.setInt(1, klant.getID());
        ResultSet rs = pstmt.executeQuery();
        List<AutoHuur> huurList = new ArrayList<AutoHuur>();
        KlantDao kdao = new KlantOracleDaoImpl();
        while (rs.next()) {
            AutoHuur ah = new AutoHuur();
            ah.setID(rs.getInt("id"));
            ah.setAantalDagen(rs.getInt("dagen"));
            ah.setHuurder(kdao.findByID(rs.getInt("klant")));
            huurList.add(ah);
        }
        rs.close();
        pstmt.close();
        return huurList;
    }
}
