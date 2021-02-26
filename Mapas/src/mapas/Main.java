package mapas;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// chave/valor - chave -> valor
		// "camila" -> "12345"
		// "joao" -> "67890"

		
		
		HashMap<String, String> agendaTelefonica = new HashMap<String, String>();
		agendaTelefonica.put("camila", "12345");
		agendaTelefonica.put("joao", "67890");
		
		System.out.println(agendaTelefonica.get("camila"));
		System.out.println(agendaTelefonica.get("joao"));
		System.out.println(agendaTelefonica.get("victor"));
		System.out.println(agendaTelefonica);
		
		System.out.println(agendaTelefonica.keySet());
		
		for(String k: agendaTelefonica.keySet()) {
			System.out.println(k);
			System.out.println(agendaTelefonica.get(k));
		}
		
		// Cadastro de funcionarios de uma empresa
		// "948.234.434-48" -> {nome:Victor, idade:15, funcao:"faz nada", descricao:""}
		HashMap<String, Funcionario> empresa = new HashMap<String, Funcionario>();
		empresa.put("948.234.434-48", new Funcionario("victor", 15));
		
		System.out.println(empresa);
		Funcionario victor = empresa.get("948.234.434-48");
		System.out.println(victor.getNome());		
	
	}

}
