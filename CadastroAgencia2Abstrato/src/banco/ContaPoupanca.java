package banco;

public class ContaPoupanca extends Conta{

	protected float rendimento;
	
	public ContaPoupanca(int id, String idClient) {
		super(id, idClient);
		this.type = "CP";
		this.rendimento = 0.01f;
	}
	
	public void atualizacaoMensal() {
		this.saldo = this.saldo*(1+this.rendimento);
	}
	
}
