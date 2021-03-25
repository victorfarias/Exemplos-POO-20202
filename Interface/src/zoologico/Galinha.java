package zoologico;

public class Galinha extends Ave {
	
	public Galinha() {
		super(400);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Co co co co");
	}
	
}
