package main;

import parque.Moto;
import parque.Pessoa;

public class Main {

	public static void main(String[] args) {
//		//case subindo e buzinando
		Moto moto = new Moto();
//		System.out.println(moto);
		//potencia: 1, minutos: 0, pessoa: null
		moto.buzinar();
		//fail: moto vazia
		moto.in(new Pessoa("marcos", 4));
		System.out.println(moto);
		//potencia: 1, minutos: 0, pessoa: [marcos:4]
		moto.buzinar();
		//Pem
		moto.in(new Pessoa("marisa", 2));
		//fail: moto ocupada
		System.out.println(moto);
		//potencia: 1, minutos: 0, pessoa: [marcos:4]
		
		//case subindo e buzinando
		moto = new Moto(5);
		System.out.println(moto);
		//potencia: 5, minutos: 0, pessoa: null
		moto.in(new Pessoa("marcos", 4));
		System.out.println(moto);
		//potencia: 5, minutos: 0, pessoa: [marcos:4]
		moto.buzinar();
		//Peeeeem
		

		//case subindo e trocando
		moto = new Moto(7);
		moto.in(new Pessoa("heitor", 6));
		System.out.println(moto);
		//potencia: 7, minutos: 0, pessoa: [heitor:6]
		Pessoa heitor = moto.out();
		System.out.println(heitor);
		//[heitor:6]
		moto.out();
		//fail: moto vazia
		moto.in(new Pessoa("suzana", 8));
		System.out.println(moto);
		//potencia: 7, minutos: 0, pessoa: [suzana:8]
		
		//case passeando
		moto = new Moto(7);
		moto.in(new Pessoa("suzana", 8));
		moto.drive(10);
		//fail: tempo zerado
		moto.buy(40);
		System.out.println(moto);
		//potencia: 7, minutos: 40, pessoa: [suzana:8]
		moto.drive(20);
		System.out.println(moto);
		//potencia: 7, minutos: 20, pessoa: [suzana:8]

		//case nem grande nem pequeno
		moto = new Moto(7);
		moto.buy(20);
		moto.in(new Pessoa("andreina", 23));
		moto.drive(15);
		//fail: muito grande para andar de moto
		System.out.println(moto);
		//potencia: 7, minutos: 20, pessoa: [andreina:23]
		

		//case acabou o tempo
		moto = new Moto(7);
		moto.buy(20);
		moto.in(new Pessoa("andreina", 6));
		moto.drive(15);
		System.out.println(moto);
		//potencia: 7, minutos: 5, pessoa: [andreina:6]
		moto.drive(10);
		//fail: andou 5 min e acabou o tempo
	}
}
