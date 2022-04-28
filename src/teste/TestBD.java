package teste;

import org.junit.Assert;
import org.junit.Test;

import business.ValidarDado;

public class TestBD {
	
	@Test
	public void testValidarCampoTxt() {
		ValidarDado dado = new ValidarDado();
		Assert.assertTrue(dado.validarCampoTxtVazio("asd"));
	}
	
	@Test
	public void testValidarCampoNumb() {
		ValidarDado dado = new ValidarDado();
		Assert.assertTrue(dado.validarCampoTxtNumb(1));
	}
}