package config;

public class Config{

	public String configBD(){
		
		String nomeSO = System.getProperty("os.name");
		
		if(nomeSO.contains("Windows")){
			return "c:sistemaspock\\db\\spockdb.db";	
		}else{
			return "/home/sistemaspock/db/spockdb.db";
		}
	}
}
