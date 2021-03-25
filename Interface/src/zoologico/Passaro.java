package zoologico;

public class Passaro extends Ave implements Voador, Inter{

	public Passaro() {
		super(200);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Piu piu");
		
	}

	@Override
	public void voar() {
		System.out.println("Passaro voando!!");
		
	}
	
}
