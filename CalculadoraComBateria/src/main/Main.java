package main;

import calculadora.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora(5);
		System.out.println(calc);
		calc.charge(3);
		System.out.println(calc);
		calc.charge(1);
		System.out.println(calc);
		calc.charge(2);
		System.out.println(calc);
		
		calc = new Calculadora(4);
		calc.charge(2);
		System.out.println(calc);
		//display = 0.00, battery = 2
		calc.charge(3);
		System.out.println(calc);
		//display = 0.00, battery = 4
		
		calc = new Calculadora(2);
		calc.charge(2);
		calc.soma(4, 3);
		System.out.println(calc);
		//display = 7.00, battery = 1
		calc.soma(2, 3);
		System.out.println(calc);
		//display = 5.00, battery = 0
		calc.soma(-4, -1);
		//fail: bateria insuficiente
		calc.charge(1);
		System.out.println(calc);
		//display = 5.00, battery = 1
		calc.soma(-4, -2);
		System.out.println(calc);
		//display = -6.00, battery = 0
		
		calc = new Calculadora(3);
		calc.charge(3);
		calc.div(6, 3);
		calc.div(7, 0);
		//fail: divisao por zero
		System.out.println(calc);
		//display = 2.00, battery = 1
		calc.div(7, 2);
		calc.div(10, 2);
		//fail: bateria insuficiente
		System.out.println(calc);
		//display = 3.50, battery = 0
	}

}
