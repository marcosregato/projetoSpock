package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import model.UserModel;

public class UsuarioDao{
	
	private final static Logger logger = Logger.getLogger(UsuarioDao.class.getName());
	
	Statement stmt = null;
	ConnectionSQLite connection = new ConnectionSQLite();

	public void salvarUsuario(){

		try {
			stmt = (Statement) connection.createConnection();
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

		try{
			String query ="";

			ResultSet rs = stmt.executeQuery( query );
			ArrayList<UserModel> listUsuario = new ArrayList<>();
			UserModel usuario = new UserModel();
			while(rs.next()) {
				
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
			}
			
			listUsuario.add(usuario);
			rs.close();
			stmt.close();
			connection.createConnection().close();
			
			return listUsuario;

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		
		return null;
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
		
		return false;
	}
} 
