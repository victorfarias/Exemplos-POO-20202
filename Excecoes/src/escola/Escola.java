package escola;

import java.util.HashMap;

public class Escola {
	
	private int maxProfessores;
	private HashMap<String, Professor> professores;
	
	public Escola() {
		this.professores = new HashMap<String, Professor>();
		this.maxProfessores = 5;
	}
	
	public void adicionarProfessor(Professor professor){
		
		if(this.professores.containsKey(professor.getCpf())) {			
			throw new IllegalArgumentException("CPF duplicado");
//			código para de executar aqui
//			Ele acaba antes de retornar qualquer coisa
//			RuntimeException é uma exceção unchecked
//			Expection é checked
		}
		
		if(this.professores.size() >= this.maxProfessores) {
			throw new LimiteProfessorAtingidoException("Limite atingido", professor.getNome());
		}
		
		this.professores.put(professor.getCpf(), professor);		
	}
	
	public String toString() {
		String resultado = "";
		for(Professor professor: this.professores.values()) {
			resultado += (professor + "\n");
		}
		return resultado;
	}
	
}
