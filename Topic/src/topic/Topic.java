package topic;

import java.util.ArrayList;

public class Topic {

	public ArrayList<Pass> cadeiras;
	public int qtdPref;
	
	public Topic(int lotacao, int qtdPref) {
		this.cadeiras = new ArrayList<Pass>();
		for(int i=0; i<lotacao; i++) {
			this.cadeiras.add(null);
		}
		this.qtdPref = qtdPref;
	}
	
	public boolean subir(Pass pass) {
		for(int i=0; i<this.cadeiras.size(); i++) {
			Pass pass1 = this.cadeiras.get(i);
			if(pass1 != null && pass1.getName().equals(pass.getName())) {
				System.out.println("fail: pass ja esta na topic");
				return false;
			}
		}
		
		if(pass.getIdade() >= 65) {
			for(int i=0; i<this.cadeiras.size(); i++) {
				if(this.cadeiras.get(i) == null) {
					this.cadeiras.set(i, pass);
					return true;
				}
			}
		}else {
			for(int i=this.qtdPref; i<this.cadeiras.size(); i++) {
				if(this.cadeiras.get(i) == null) {
					this.cadeiras.set(i, pass);
					return true;
				}
			}
			for(int i=0; i<this.qtdPref; i++) {
				if(this.cadeiras.get(i) == null) {
					this.cadeiras.set(i, pass);
					return true;
				}
			}
		}
		System.out.println("fail: topic lotada");
		return false;
	}
	
	public Pass descer(String name) {
		for(int i=0; i<this.cadeiras.size(); i++) {
			Pass pass = this.cadeiras.get(i);
			if(pass != null && pass.getName() == name) {
				this.cadeiras.set(i, null);
				return pass;
			}
		}
		System.out.println("fail: pass nao esta na topic");
		return null;
	}
	
	public String toString() {
		String resultado = "[ ";
		for(int i=0; i<this.cadeiras.size(); i++) {
			if(i < this.qtdPref) {
				resultado += "@";			
			}else {
				resultado += "=";
			}
			if(this.cadeiras.get(i) == null) {
				resultado += " ";
			}else {
				resultado += (this.cadeiras.get(i) + " ");
			}								
		}
		resultado += "]";
		return resultado;
	}
	
}
