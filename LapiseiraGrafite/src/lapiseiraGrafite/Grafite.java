package lapiseiraGrafite;

public class Grafite {
	public float calibre;
	public String dureza;
	public int tamanho;
	
	public Grafite(float calibre, String dureza, int tamanho){
		this.calibre = calibre;
		this.dureza = dureza;
		this.tamanho = tamanho;
	}
	
	public int desgastePorFolha() {
		if(this.dureza.equals("HB")) {
			return 1;
		}else if(this.dureza.equals("2B")) {
			return 2;
		}else if(this.dureza.equals("4B")) {
			return 4;
		}else if(this.dureza.equals("6B")) {
			return 6;
		}
		return 0;	
	}
	public String toString() {
		return "["+this.calibre+":"+this.dureza+":"+this.tamanho+"]";
	}
}
