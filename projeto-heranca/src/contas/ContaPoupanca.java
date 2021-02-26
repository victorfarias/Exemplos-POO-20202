package contas;

public class ContaPoupanca extends ContaBancaria{
	
	private double taxaRendimento;
	
	public ContaPoupanca(double saldo, String numero, String titular, double taxaRendimento) {
		super(saldo, numero, titular);
		
		if(taxaRendimento > 0) {
			this.taxaRendimento = taxaRendimento;
		}else {
			this.taxaRendimento = 0;
		}
	}
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public boolean depositar(double valor) {
		if(valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
			return true;
		}else {
			return false;
		}
	}
	
	public void aplicarRendimentos() {
		this.setSaldo(this.getSaldo() + (this.getSaldo() * this.taxaRendimento));
	}
}
