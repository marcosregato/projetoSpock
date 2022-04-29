package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import config.Config;

public class ConnectionSQLite{
	
	static Logger logger = Logger.getLogger(ConnectionSQLite.class);
    private Config config = new Config();
    
    public Connection createConnection() {
        String dbUrl = "jdbc:sqlite:"+ config.getPathFile();
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(dbUrl);
            logger.info("Opened database sucessfully");
        } catch (ClassNotFoundException | SQLException e) {
        	logger.info(e.getClass().getName() + " " + e.getMessage());
            System.exit(0);
        }

        return con;
    }
}
