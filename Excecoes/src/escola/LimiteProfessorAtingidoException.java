package escola;

public class LimiteProfessorAtingidoException extends RuntimeException {
	
	private String nomeProfessor;
	
	public LimiteProfessorAtingidoException(String message, String nomeProfessor) {
		super(message);
		this.nomeProfessor = nomeProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}
	

}
