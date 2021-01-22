package calculadora;


public class Calculadora {
	public int battery;
	public int maxBattery;
	public double display;
	
	public Calculadora(int maxBattery) {
		this.maxBattery = maxBattery;
		this.battery = 0;
		this.display = 0.0;
	}
	
	public void charge(int value) {
		this.battery = this.battery + value;
		if(this.battery > this.maxBattery) {
			this.battery = this.maxBattery;
		}
	}
	public void useBattery() {
		if(this.getBattery() > 0) {
			this.battery = this.battery - 1;	
		}	
	}
	public void soma(int a, int b) {
		if(this.getBattery() > 0) {
			this.display = a+b;
			this.useBattery();
		}else {
			System.out.println("fail: bateria insuficiente");			
		}				
	}
	public void div(int a, int b) {
		// Verificar se é divisão por zero
		if(b==0) {
			this.useBattery();
			System.out.println("fail: divisao por zero");			 
		}else if(this.getBattery()<=0) { // Verificar se bateria é menor que zero
			System.out.println("fail: bateria insuficiente");
		}else {
			this.display = (double)a/b;
			this.useBattery();
		}		
	}
	public void show() {
		System.out.println(this.toString());
	}
	public int getBattery() {
		return this.battery;		
	}
	public String toString() {
		return "display = " + this.display + ", battery = " + this.battery;
	}

}
