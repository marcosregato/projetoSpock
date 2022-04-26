package business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidarDado{

	//TODO falta fazer a avalicao da data, a data nao deve ser maior que a data atual
	public boolean validarData(String valor){


		try {
			if(valor != null){
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
				Date dataFormatada = formato.parse(valor);
				return true;
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return false;
	}
}