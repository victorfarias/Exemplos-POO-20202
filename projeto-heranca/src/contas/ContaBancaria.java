package contas;

public class ContaBancaria{
	
	private double saldo;
	private String numero;
	private String titular;
	
	public ContaBancaria(double saldo, String numero, String titular) {
		if(saldo > 0) {
			this.saldo = saldo;
		}else {
			this.saldo = 0;
		}
		this.numero = numero;
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public boolean sacar(double valor) {
		System.out.println("Sacar da contaBancaria");
		if(valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}

}
