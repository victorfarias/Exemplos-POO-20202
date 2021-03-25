package escola;

public class Professor {
	
	private String nome, cpf;

	public Professor(String cpf, String nome) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return this.nome+":"+this.cpf;
	}

}
