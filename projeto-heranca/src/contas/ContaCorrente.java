package contas;

public class ContaCorrente extends ContaBancaria{
	
	private double taxaManutencao;
	
	public ContaCorrente(double saldo, String numero, String titular, double taxaManutencao) {
		super(saldo, numero, titular);
		
		if (taxaManutencao >= 0) {
			this.taxaManutencao = taxaManutencao;
		}else {
			this.taxaManutencao = 0;
		}
	}

	public double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean sacar(double valor) {
		System.out.println("Sacar da contaCorrente");
		if(valor > 0 && valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			// Cobrança pela operação de saque na conta corrente
			this.setSaldo(this.getSaldo() - 1);
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Conta Corrente \nNome do titular: "+this.getTitular()+"\n"+
				"Número da conta: "+this.getNumero()+"\n"+
				"Saldo da conta: R$"+this.getSaldo()+"\n"+
				"Taxa de manutenção: "+this.taxaManutencao;
				
	}
	
}
