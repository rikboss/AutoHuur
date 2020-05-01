package Persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleBaseDao {
    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    private static final String DB_USER = "autohuur";
    private static final String DB_PASS = "autohuur";
    private static Connection connection;

    public OracleBaseDao() throws SQLException {
        // Leg de connectie met de database
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    protected static Connection getConnection() {
        return connection;
    }

    public static void closeConnection() throws SQLException{
        connection.close();
    }
}
