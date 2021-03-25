package universidade;

import java.util.ArrayList;

public class Universidade {

	private ArrayList<Funcionario> funcionarios;
	
	public Universidade() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(String nome) {
		for(Funcionario funcionario: this.funcionarios) {
			if(funcionario.nome == nome) {
				this.funcionarios.remove(funcionario);
				return;
			}
		}
	}
	
	public void distribuirBonus(float valor) {
		double bonusDistribuido = valor/this.funcionarios.size();
		for(Funcionario funcionario: this.funcionarios) {
			funcionario.setBonus(bonusDistribuido);
		}
	}
	
	public String toString() {
		String resultado = "";
		for(Funcionario funcionario: this.funcionarios) {
			resultado += funcionario + "\n";
		}
		return resultado;
	}
	
}
