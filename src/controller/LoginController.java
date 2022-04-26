package controller;

import dao.UsuarioDao;

public class LoginController{

	private UsuarioDao dao;
	
	public void login(String user, String pass){
		if(user != null & pass != null){
			dao.buscarUsuario(user,pass);
		}else{
			// exibir mensagem na tela 
		}	
	}

}
