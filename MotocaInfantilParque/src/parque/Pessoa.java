package parque;

public class Pessoa {
	public String nome;
	public int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String toString() {
		return "["+	this.nome +":"+this.idade+"]";		
	}
}
