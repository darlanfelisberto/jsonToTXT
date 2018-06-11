package jsonToTXT;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {

		
		try {
			List<Linha> l = null;
			l = JSONFlattener.parseJson("arquivos\\PAINEL_DE_COTAS_01.json",ColunasJson.PAINEL_COTAS_01);
			System.out.println(JSONFlattener.dataBaseFormat(l));
//			l = JSONFlattener.parseJson("C:\\Users\\darlan\\eclipse-workspace\\jsonToTXT\\arquivos\\PAINEL_DE_COTAS_02.json",ColunasJson.PAINEL_COTAS_02);
			l = JSONFlattener.parseJson("arquivos\\PAINEL_DE_COTAS_03.json",ColunasJson.PAINEL_COTAS_03);
			System.out.println(JSONFlattener.dataBaseFormat(l));
//			JSONFlattener.parseJson("C:\\Users\\darlan\\eclipse-workspace\\jsonToTXT\\arquivos\\PAINEL_DE_COTAS_05.json",ColunasJson.PAINEL_COTAS_04);
//			new JsonToTexto("arquivos/PAINEL_DE_COTAS_01.json", ColunasJson.PAINEL_COTAS_01);//.incia();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
