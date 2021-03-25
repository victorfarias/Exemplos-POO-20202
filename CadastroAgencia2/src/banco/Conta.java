package banco;

public class Conta {
	
	protected int id;
	protected float saldo;
	protected String idCliente;
	protected String type;
	
	public int getId() {
		return id;
	}

	public float getSaldo() {
		return saldo;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public String getType() {
		return type;
	}

	public Conta(int id, String idCliente) {
		this.id = id;
		this.idCliente = idCliente;
		this.saldo = 0;
	}
	
	public void sacar(float value) {
		if(value > this.saldo) {
			System.out.println("fail: saldo insuficiente");
			return;
		}
		this.saldo -= value;
	}
	
	public void depositar(float value) {
		this.saldo += value;
	}
	
	public void transferir(Conta other, float value) {
		if(value > this.saldo) {
			System.out.println("fail: saldo insuficiente");
			return;
		}
		this.saldo -= value;
		other.depositar(value);
	}
	
	public void atualizacaoMensal() {
		
	}
	
	public String toString() {
		return this.id+":"+this.idCliente+":"+this.saldo+":"+this.type;
	}

}
