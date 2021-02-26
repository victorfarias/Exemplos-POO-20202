package agiota;

public class Client {

	public String codename;
	public float limite, balance;
	
	public Client(String codename, float limite) {
		this.codename = codename;
		this.limite = limite;
		this.balance = 0;
	}
	
	public String toString() {
		return this.codename+":"+this.balance+"/"+this.limite;
	}
	
	
}
