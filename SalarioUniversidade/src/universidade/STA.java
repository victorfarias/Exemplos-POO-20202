package universidade;

public class STA extends Funcionario {

	private int nivel;
	
	public STA(String nome, int nivel) {
		super(nome, 1);
		this.nivel = nivel;
	}
	
	@Override
	public double calcSalario() {		
		return 3000 + 300*this.nivel + this.qtd_diarias*100 + this.bonus;
	}
	
	public String toString() {
		return "sta:"+this.nome+":"+this.nivel+":"+this.calcSalario();
	}
	
}
