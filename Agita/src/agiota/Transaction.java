package agiota;

public class Transaction {

	public int id;
	public String codename;
	public float value;
	
	public Transaction(int id, String codename, float value) {
		super();
		this.id = id;
		this.codename = codename;
		this.value = value;
	}
	
	public String toString() {
		return 	"id:"+ this.id + " " +this.codename + ":" + this.value;
	}
	
}
