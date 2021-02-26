package contato;

import java.util.ArrayList;

public class Contato {
	
	private String name;
	private ArrayList<Fone> fones;
	
	public Contato(String name) {
		this.name = name;
		this.fones = new ArrayList<Fone>();
	}
	
	public void addFone(String label, String number) {
		if(Fone.validate(number)==false) {
			System.out.println("fail: fone invalido");
			return;
		}
		fones.add(new Fone(label, number));
	}
	
	public void rmFone(int index) {
		if(index < 0 && index >= this.fones.size()) {
			System.out.println("Index não existe!");
			return;
		}
		this.fones.remove(index);
	}
	
	public String toString() {
		String resultado = this.name + " ";
		for(int i=0; i<fones.size(); i++) {
			resultado = resultado + "["+i+":"+fones.get(i).getLabel()+":"+fones.get(i).getNumber()+"] ";  
		}
		return resultado;
	}
	
		
}
