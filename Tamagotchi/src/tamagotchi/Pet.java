package tamagotchi;

public class Pet {
	
	private int enerygyMax, hungryMax, cleanMax, energy, hungry, clean, diamonds, age;
	private boolean alive;
	
	public Pet(int enerygyMax, int hungryMax, int cleanMax) {
		super();
		this.enerygyMax = enerygyMax;
		this.hungryMax = hungryMax;
		this.cleanMax = cleanMax;
		this.energy = enerygyMax;
		this.hungry = hungryMax;
		this.clean = cleanMax;
		this.diamonds = 0;
		this.age = 0;
		this.alive = true;
	}
	
	private void setEnergy(int energy) {
		if(energy <= 0) {
			this.energy = 0;
			this.alive = false;
			System.out.println("fail: pet morreu de fraqueza");
			return;
		}
		if(energy > this.getEnergyMax()) {
			this.energy = this.getEnergyMax();
			return;
		}
		this.energy = energy;
	}
	
	private void setHungry(int hungry) {
		if(hungry <= 0) {
			this.hungry = 0;
			this.alive = false;
			System.out.println("fail: pet morreu de fome");
			return;
		}
		if(hungry > this.getHungryMax()) {
			this.hungry = this.getHungryMax();
			return;
		}
		this.hungry = hungry;
	}
	
	private void setClean(int clean) {
		if(clean <= 0) {
			this.clean = 0;
			this.alive = false;
			System.out.println("fail: pet morreu de sujeira");
			return;
		}
		if(clean > this.getCleanMax()) {
			this.clean = this.getCleanMax();
			return;
		}
		this.clean = clean;
	}

	public int getEnergyMax() {
		return enerygyMax;
	}

	public int getHungryMax() {
		return hungryMax;
	}

	public int getCleanMax() {
		return cleanMax;
	}

	public int getEnergy() {
		return energy;
	}

	public int getHungry() {
		return hungry;
	}

	public int getClean() {
		return clean;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public int getAge() {
		return age;
	}

	public boolean isAlive() {
		return alive;
	}
	
	public void play() {
		if(this.isAlive() == false) {
			System.out.println("fail: pet esta morto");
			return;
		}
		this.setEnergy(this.getEnergy() - 2);
		this.setHungry(this.getHungry() - 1);
		this.setClean(this.getClean() - 3);
		this.diamonds = this.diamonds + 1;
		this.age = this.age + 1;
	}
	public void clean() {
		if(this.isAlive() == false) {
			System.out.println("fail: pet esta morto");
			return;
		}
		this.setEnergy(this.getEnergy()-3);
		this.setHungry(this.getHungry()-1);
		this.setClean(this.getCleanMax());
		this.age = this.age + 2;
	}
	public void eat() {
		if(this.isAlive() == false) {
			System.out.println("fail: pet esta morto");
			return;
		}
		this.setEnergy(this.getEnergy()-1);
		this.setHungry(this.getHungry()+4);
		this.setClean(this.getClean()-2);
		this.age = this.age + 1;
	}
	public void sleep() {
		if(this.isAlive() == false) {
			System.out.println("fail: pet esta morto");
			return;
		}
		if(this.getEnergyMax() - this.getEnergy() < 5) {
			System.out.println("fail: nao esta com sono");
			return;
		}
		this.age = this.age + (this.getEnergyMax()-this.getEnergy());
		this.setEnergy(this.getEnergyMax());
		this.setHungry(this.getHungry()-1);				
	}
	public String toString() {
		return "E:" + this.getEnergy() + "/" + this.getEnergyMax() + ", S:" + this.getHungry()+"/" + this.getHungryMax()+", L:"+this.getClean() + "/" + this.getCleanMax() + ", D:" + this.getDiamonds()+", I:" + this.getAge();
	}

}
