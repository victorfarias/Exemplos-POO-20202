package lapiseiraGrafite;

public class Lapiseira {

	public float calibre;
	public Grafite grafite;
	
	public Lapiseira(float calibre) {
		this.calibre = calibre;
		this.grafite = null;
	}
	
	public boolean inserir(Grafite grafite) {
		if(grafite.calibre != this.calibre) {
			System.out.println("fail: calibre incompatível");
			return false;
		}
		if(this.grafite != null) {
			System.out.println("fail: ja existe grafite");
			return false;
		}
		this.grafite = grafite;
		return true;
	}
	
	public Grafite remover() {
		Grafite aux = this.grafite;
		this.grafite = null;
		return aux;
	}
	
	public void write(int folhas) {
		// Verificando se há grafite		
		if(this.grafite == null) {
			System.out.println("warning: grafite acabou");
			return;
		}
		int desgasteTotal = folhas * this.grafite.desgastePorFolha();
		// Verificando se dá a conta certa
		if(this.grafite.tamanho == desgasteTotal ) {
			this.grafite = null;
			System.out.println("warning: grafite acabou");
			return;			
		}
		// Verificando se tem menos grafite que o necessario
		if(this.grafite.tamanho < desgasteTotal) {
			int folhasCompletas = this.grafite.tamanho / this.grafite.desgastePorFolha();
			this.grafite = null;
			
			System.out.println("fail: folhas escritas completas: " + folhasCompletas);
			System.out.println("warning: grafite acabou");
			return;
			
		}		
		this.grafite.tamanho =this.grafite.tamanho - desgasteTotal; 
		
	}
	
	public String toString() {
		return "calibre: " + this.calibre + ", grafite: " + this.grafite;
	}
	
	
}
