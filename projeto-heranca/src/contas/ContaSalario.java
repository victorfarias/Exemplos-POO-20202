package contas;

public class ContaSalario extends ContaBancaria{

	private String empresa;
	
	public ContaSalario(double saldo, String numero, String titular, String empresa) {
		super(saldo, numero, titular);
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
