package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.ProdutoModel;

public class ProdutoDao{

	Statement stmt = null;
	ConnectionSQLite connection = new ConnectionSQLite();
	stmt = connection.createConnection();


	public void salvarProduto(){

		try {
			String query ="";
			stmt.executeUpdate(query);

			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}


	public void editarProduto(int id){
		try {
			String query ="";

			stmt.executeUpdate(query);
			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}


	public void updateProduto(int id){
		try {
			String query ="";

			ResultSet rs = stmt.executeQuery( query );
			connection.createConnection().commit();

			rs.close();
			stmt.close();
			connection.createConnection().close();
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}


	public List<ProdutoModel> listarProduto(){
		try{
			String query ="";

			ResultSet rs = stmt.executeQuery( query );
			List listProduto = new ArrayList();
			ProdutoModel produto = new ProdutoModel();
			while(rs.next()) {
				
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
			}
			
			listProduto.add(produto);
			return listProduto;
			
			rs.close();
			stmt.close();
			connection.createConnection().close();

		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}

	}


	public void excluirProduto(){
		try{
			String query ="";

			stmt.executeUpdate(query);
			connection.createConnection().commit();
			
			stmt.close();
			connection.createConnection().close();
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}

} 
