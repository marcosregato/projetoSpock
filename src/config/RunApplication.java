package config;

import org.apache.log4j.Logger;

import dao.ConstruirBd;

public class RunApplication {

	private static Logger logger = Logger.getLogger(RunApplication.class);

	public static void main(String[] asd) {

		Config config = new Config();
		logger.info("criando Estrutura de Pasta");
		config.criarEstruturaPasta();


		ConstruirBd db = new ConstruirBd();
		logger.info("criando banco de dados SpockDB");
		db.criarBanco();




	}

}
