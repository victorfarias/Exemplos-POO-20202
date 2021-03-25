package banco;

import java.util.ArrayList;

public class Agencia {

	protected ArrayList<Cliente> clientes;
	protected ArrayList<Conta> contas;
	private int idProximaConta;
	
	public Agencia() {
		this.contas = new ArrayList<Conta>();
		this.clientes = new ArrayList<Cliente>();
		this.idProximaConta = 0;
	}
	
	public void adicionarCliente(String id) {
		Conta conta1 = new ContaCorrente(this.idProximaConta, id);
		this.contas.add(conta1);
		this.idProximaConta++;
		
		Conta conta2 = new ContaPoupanca(this.idProximaConta, id);
		this.contas.add(conta2);
		this.idProximaConta++;
		
		this.clientes.add(new Cliente(id));
	}
	
	public Conta getConta(int id) {
		for(Conta conta: this.contas) {
			if(conta.getId()==id) {
				return conta;
			}
		}
		System.out.println("fail: conta nao encontrada");
		return null;
	}
	
	public ArrayList<Conta> getContas(){
		return this.contas;
	}
	
	public String toString() {
		String resultado = "";
		for(Conta conta: this.contas) {
			resultado += conta.toString() +"\n";
		}
		return resultado;
	}
	
	
}
