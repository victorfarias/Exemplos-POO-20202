package parque;

public class Moto {
	public int potencia;
	public int tempo;
	public Pessoa pess;
	
	public Moto() {
		this.potencia = 1;
		this.tempo = 0;
		this.pess = null;
	}
	
	public Moto(int potencia) {
		this.potencia = potencia;
		this.tempo = 0;
		this.pess = null;
	}
	
	public void buy(int valor) {
		this.tempo = this.tempo + valor;
	}
	
	public void in(Pessoa p) {
		if(this.pess != null) {
			System.out.println("fail: moto ocupada");
		}else {
			this.pess = p;
		}		
	}
	
	public Pessoa out() {
		// verificar se moto está vazia
		if(this.pess ==null) {
			System.out.println("fail: moto vazia");
			return null;
		}else {
			Pessoa p = this.pess;
			this.pess = null;
			return p;	
		}		
	}
	
	public String buzinar() {
		// verificar se tem ninguém na moto
		if(this.pess == null) {
			System.out.println("fail: moto vazia");
			return null;
		}else {
			String resultado = "P";
			for(int i=0; i < this.potencia; i++) {
				resultado = resultado + "e";
			}
			resultado = resultado + "m";
			System.out.println(resultado);
			return resultado;	
		}		
	}
	
	public void drive(int tempo) {
		//verificar se tem tempo
		if(this.tempo <= 0) {
			System.out.println("fail: tempo zerado");
		}else if(this.tempo < tempo){
			System.out.println("fail: andou " + (this.tempo) + " min e acabou o tempo");
			this.tempo = 0;
		}else if(this.pess.idade > 10) {
			System.out.println("fail: muito grande para andar de moto");
		}else {
			this.tempo = this.tempo - tempo;
		}
	}
	public String toString() {
		return "potencia: " + this.potencia + ", minutos: "+ this.tempo + ", pessoa: "+ this.pess;
	}
}
