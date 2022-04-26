package dao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import model.UserModel;

public class UsuarioDao{
	
	static Logger logger = Logger.getLogger(UsuarioDao.class);
	
	Statement stmt = null;
	ConnectionSQLite connection = new ConnectionSQLite();
	stmt = connection.createConnection();

	public void salvarUsuario(){

		try {
			String query ="";
			stmt.executeUpdate(query);

			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}
	}
	
	
	public void editarUsuario(int id){

		try {
			String query ="";
			stmt.executeUpdate(query);

			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}
	}
	
	
	public void updateUsuario(int id){

		try {
			String query ="";
			stmt.executeUpdate(query);

			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}
	}
	
	
	public List<UserModel> listarUsuario(){

		try {
			String query ="";
			stmt.executeUpdate(query);

			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}
	}
	
	
	public void excluirUsuario(){

		try {
			String query ="";
			stmt.executeUpdate(query);

			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}
	}
	
	public boolean buscarUsuario(String user, String pass){

		try {
			String query ="";
			stmt.executeUpdate(query);

			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
		}
	}
} 
