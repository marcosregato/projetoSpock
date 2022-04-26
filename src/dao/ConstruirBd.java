package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

import config.Config;


public class ConstruirBd {


	static Logger logger = Logger.getLogger(UsuarioDao.class);

	Connection c = null;
	Statement stmt = null;
	private Config config = new Config();


	public void criarBanco() {

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:"+ config.configBD());
		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		logger.info("Opened database successfully");
	}

	public void criarEstruturaDoBanco() {

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:"+ config.configBD());
			logger.info("Opened database successfully");
			String sql = "create table usuario( " +
					"id int NOT NULL PRIMARY KEY," +
					"nome varchar(255)" +
					");" +

					"create table produto(" +
					"id int NOT NULL PRIMARY KEY," +
					"nome varchar(255)" +
					");" +

					"create table permissao(" +
					"id int NOT NULL PRIMARY KEY," +
					"id_usuario int," +
					"tipo varchar(200)," +
					"FOREIGN KEY (id_usuario) REFERENCES usuario(id)" +
					")";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();

		} catch (Exception e) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}
}
