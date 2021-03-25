package banco;

import java.util.ArrayList;

public class Cliente {

	protected String id;
	protected ArrayList<Conta> contas;
	
	public Cliente(String id) {
		this.id = id;
		this.contas = new ArrayList<Conta>();
	}
}
