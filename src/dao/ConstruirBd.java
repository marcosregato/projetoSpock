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
			System.out.println(config.getPathFile());
			
			c = DriverManager.getConnection("jdbc:sqlite:"+ config.getPathFile()+"spockDB.db");
		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		logger.info("Opened database successfully");
	}

	public void criarEstruturaDoBanco() {

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:"+ config.getPathFile()+"spockDB.db");
			logger.info("Opened database successfully");
			
			String sql = "CREATE table usuario( "
					+ "id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,\n"
					+ "	nome varchar(255)\n"
					+ ");\n"
					+ "CREATE table produto(\n"
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,\n"
					+ "	nome varchar(255),\n"
					+ "	tipo varchar(200)\n"
					+ ");\n"
					+ "CREATE table permissao(\n"
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,\n"
					+ "	id_usuario INTEGER,\n"
					+ "	tipo varchar(200),\n"
					+ "	FOREIGN KEY (id_usuario) REFERENCES usuario(id)\n"
					+ ");\n"
					+ "CREATE table preco(\n"
					+ "\n"
					+ "	id INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,\n"
					+ "	id_produto INTEGER NOT NULL,\n"
					+ "	valor varchar(200),\n"
					+ "	FOREIGN KEY (id_produto) REFERENCES produto(id)\n"
					+ ")";
			
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();

		} catch (Exception e) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}
}