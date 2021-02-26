package cinema;

public class Cliente {
	public String id, fone;
	
	public Cliente(String id, String fone) {
		this.id = id;
		this.fone = fone;
	}
	
	public String toString() {
		return this.id + ":" +this.fone;		
	}
}
