package banco;

public class ContaCorrente extends Conta{
	
	protected float tarifaMensal;
	
	public ContaCorrente(int id, String idClient) {
		super(id, idClient);
		this.type = "CC";
		this.tarifaMensal = 20;
	}
	
	public void atualizacaoMensal() {
		this.saldo -= tarifaMensal;
	}
	
}
