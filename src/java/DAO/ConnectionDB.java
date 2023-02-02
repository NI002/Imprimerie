package connection;

import java.sql.*;
import java.util.Vector;

public class ConnectionDB {
    String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    String DB_USERNAME="";
    String DB_PASSWORD="";

    public String getDB_USERNAME() {
        return DB_USERNAME;
    }

    public String getDB_PASSWORD() {
        return DB_PASSWORD;
    }

    public void setDB_USERNAME(String DB_USERNAME) {
        this.DB_USERNAME = DB_USERNAME;
    }

    public void setDB_PASSWORD(String DB_PASSWORD) {
        this.DB_PASSWORD = DB_PASSWORD;
    }

    public ConnectionDB() {
    }

    public ConnectionDB(String DB_USERNAME, String DB_PASSWORD) {
        this.setDB_USERNAME(DB_USERNAME);
        this.setDB_PASSWORD(DB_PASSWORD);
    }

    public Connection getOnConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = (Connection) DriverManager.getConnection(DB_URL, this.getDB_USERNAME(),
                    this.getDB_PASSWORD());
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}
