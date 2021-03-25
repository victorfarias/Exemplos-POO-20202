package universidade;

public class Terceirizado extends Funcionario {
	
	private int horas_trab;
	private boolean insalubre;
	
	public Terceirizado(String nome, int horas_trab, boolean insalubre) {
		super(nome, 0);
		this.horas_trab = horas_trab;
		this.insalubre = insalubre;
	}

	@Override
	public double calcSalario() {
		double extraInsalubre = 0;
		if(this.insalubre == true) {
			extraInsalubre = 500;
		}
		return 4*this.horas_trab + extraInsalubre + this.bonus;
	}	
	
	public String toString() {
		String resposta ="";
		if(this.insalubre==true) {
			resposta = "sim";
		}else {
			resposta = "nao";
		}
		return "ter:"+this.nome+":"+this.horas_trab+":"+resposta+":"+this.calcSalario();
	}
	
	public void adicionarDiaria() {
		System.out.println("fail: terc nao pode receber diaria");
	}
	
}
