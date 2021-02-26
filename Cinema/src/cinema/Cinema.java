package cinema;

import java.util.ArrayList;

public class Cinema {

	private ArrayList<Cliente> clientes;
	
	public Cinema(int size) {
		this.clientes = new ArrayList<Cliente>();
		for(int i = 0; i<size; i++) {
			this.clientes.add(null);
		}
	}
	
	public boolean reservar(String id, String fone, int indice) {
		if(this.clientes.get(indice) != null) {
			System.out.println("fail: cadeira ja esta ocupada");
			return false;
		}
		for(int i=0; i<this.clientes.size(); i++) {
			Cliente cliente_i = this.clientes.get(i);
			if(cliente_i != null && cliente_i.id.equals(id)) {
				System.out.println("fail: cliente ja esta no cinema");
				return false;
			}
		}
		Cliente cliente = new Cliente(id, fone);
		this.clientes.set(indice, cliente);
		return true;
	}
	
	public boolean cancelar(String id) {
		for(int i=0; i<this.clientes.size(); i++) {
			Cliente cliente_i = this.clientes.get(i);
			if(cliente_i != null && cliente_i.id.equals(id)){
				this.clientes.set(i, null);
				return true;
			}
		}
		System.out.println("fail: cliente nao esta no cinema");
		return false;
	}
	
	public String toString() {
		String resultado = "[ ";
		for(int i=0; i<this.clientes.size(); i++) {
			Cliente cliente = this.clientes.get(i);
			if(cliente == null) {
				resultado += "- ";
			}else {				
				resultado += cliente.toString() + " ";
			}
		}
		resultado += "]";
		return resultado;
	}
	
}
