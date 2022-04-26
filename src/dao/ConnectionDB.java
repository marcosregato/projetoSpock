package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB{


	String driverClassName = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/student";
	String dbUser = "root";
	String dbPwd = "root";

	private static ConnectionDB connectionDB = null;

	private ConnectionDB() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		return conn;
	}

	public static ConnectionDB getInstance() {
		if (connectionDB == null) {
			connectionDB = new ConnectionDB();
		}
		return connectionDB;
	}
}
