package topic;

public class Pass {
	private String name;
	private int idade;
	
	public Pass(String name, int idade) {
		this.name = name;
		this.idade = idade;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String toString() {
		return this.name+":"+this.idade;
	}
	
}
