package zoologico;

public class Gato extends Mamifero {
	
	public Gato() {
		super(4);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Miau");
		
	}
	
}
