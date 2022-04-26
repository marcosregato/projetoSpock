package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import model.ProdutoModel;

public class ProdutoDao{
	
	static Logger logger = Logger.getLogger(ProdutoDao.class);

	Statement stmt = null;
	ConnectionSQLite connection = new ConnectionSQLite();

	public void salvarProduto(){
		
		try {
			stmt = (Statement) connection.createConnection();
			String query ="";
			stmt.executeUpdate(query);

			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}


	public void editarProduto(int id){
		try {
			stmt = (Statement) connection.createConnection();
			
			String query ="";

			stmt.executeUpdate(query);
			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}


	public void updateProduto(int id){
		try {
			
			stmt = (Statement) connection.createConnection();
			
			String query ="";

			ResultSet rs = stmt.executeQuery( query );
			connection.createConnection().commit();

			rs.close();
			stmt.close();
			connection.createConnection().close();
		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}


	public List<ProdutoModel> listarProduto(){
		try{
			
			stmt = (Statement) connection.createConnection();
			
			String query ="";

			ResultSet rs = stmt.executeQuery( query );
			ArrayList<ProdutoModel> listProduto = new ArrayList<>();
			ProdutoModel produto = new ProdutoModel();
			while(rs.next()) {
				
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
			}
			
			listProduto.add(produto);
			rs.close();
			stmt.close();
			connection.createConnection().close();
			
			return listProduto;

		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		
		return null;

	}


	public void excluirProduto(){
		try{
			
			stmt = (Statement) connection.createConnection();
			
			String query ="";

			stmt.executeUpdate(query);
			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();
		} catch ( Exception e ) {
			logger.info( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}

} 
