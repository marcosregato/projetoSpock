package config;

import java.io.File;

import org.apache.log4j.Logger;

import dao.UsuarioDao;

public class Config{

	static Logger logger = Logger.getLogger(UsuarioDao.class);


	private static String caminhoWindows = "c:\\sistemaspock\\db\\";
	private static String caminhoLinux = "/home/marcos/sistemaspock/db/";

	public void criarEstruturaPasta() {

		try {
			
			if(!new File(caminhoLinux).exists()) {
				logger.info("Criando diretorios");
				new File(caminhoLinux).mkdirs();
			}
			logger.info("estrutura de diretorios ja existe");
			

		} catch (Exception e) {
			logger.info(e.getMessage());
		}

	}

	/*
	 * Retorna o caminho do diretorio
	 * */

	public String getPathFile(){

		String nomeSO = System.getProperty("os.name");

		if(nomeSO.contains("Windows")){
			return caminhoWindows;	
		}else{
			return caminhoLinux;
		}
	}
	
	/*
	 * Validar se o arquivo spockDB.db foi criado
	 * 
	 * @return false
	 * */
	//TODO arrumar esse metodo
	public boolean validarArquivoDB() {
		File file1 = new File(caminhoLinux+"spock.db");
		System.out.println(file1.exists());
		boolean expression = true;
		if(file1.exists()) {
			expression =  false;
		}
		return expression;
		
	}
}














