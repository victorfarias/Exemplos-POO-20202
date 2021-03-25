package universidade;

public class Professor extends Funcionario{
	
	private String classe;
	
	public Professor(String nome, String classe) {
		super(nome, 2);
		this.classe = classe;
	}


	@Override
	public double calcSalario() {
		double salario = 0.0;
		if(this.classe=="A") {
			salario = 3000.0;			
		}else if(this.classe=="B") {
			salario = 5000.0;
		}else if(this.classe=="C") {
			salario = 7000.0;
		}else if(this.classe=="D") {
			salario = 9000.0;
		}else if(this.classe=="E") {
			salario = 11000.0;
		}else {
			System.out.println("Classe não existe!");
			return 0;
		}		
		return salario + this.qtd_diarias*100 + this.bonus;		
	}
	
	public String toString() {
		return "prof:"+this.nome+":"+this.classe+":"+this.calcSalario();
	}
	

}
