package teste;

import org.junit.Assert;
import org.junit.Test;

import business.ValidarDado;
import config.Config;
import dao.ConstruirBd;

public class TestBD {
	
	//@Test
	public void testValidarCampoTxt() {
		ValidarDado dado = new ValidarDado();
		Assert.assertTrue(dado.validarCampoTxtVazio("asd"));
	}
	
	//@Test
	public void testValidarCampoNumb() {
		ValidarDado dado = new ValidarDado();
		Assert.assertTrue(dado.validarCampoTxtNumb(1));
	}
	
	//@Test
	public void testvalidarArquivoDB() {
		Config config = new Config();
		Assert.assertTrue(config.validarArquivoDB());
	}
	@Test
	public void testcriarEstruturaDoBanco() {
		ConstruirBd db = new ConstruirBd();
		db.criarEstruturaDoBanco();
	}
}