package zoologico;

public class Morcego extends Mamifero implements Voador {
	
	public Morcego() {
		super(2);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("ti ti ti ti");		
	}

	@Override
	public void voar() {
		System.out.println("Morcego voando!");
		
	}
	
}
