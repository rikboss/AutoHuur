package Persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLBaseDao {
    //private static final String DB_DRIV = "een mysql driver";
    private static final String DB_URL = "een mysql connection string";
    private static final String DB_USER = "autohuur";
    private static final String DB_PASS = "autohuur";
    private static Connection connection;

    public MySQLBaseDao() throws SQLException {
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
