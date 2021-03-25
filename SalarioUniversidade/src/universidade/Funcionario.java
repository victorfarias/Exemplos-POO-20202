package universidade;

public abstract class Funcionario {
	
	protected String nome;
	protected int max_diarias, qtd_diarias;
	protected double bonus;
	
	public Funcionario(String nome, int max_diarias) {
		this.nome = nome;
		this.max_diarias = max_diarias;
		this.qtd_diarias = 0;
		this.bonus = 0;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void adicionarDiaria() {
		if(this.qtd_diarias >= this.max_diarias) {
			System.out.println("fail: limite de diarias atingido");
			return;
		}
		this.qtd_diarias ++;
	}
	
	public abstract double calcSalario();

}
