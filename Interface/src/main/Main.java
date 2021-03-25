package main;

import java.util.ArrayList;

import zoologico.Animal;
import zoologico.Ave;
import zoologico.Galinha;
import zoologico.Gato;
import zoologico.Mamifero;
import zoologico.Morcego;
import zoologico.Passaro;
import zoologico.Voador;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Animal> zoologico = new ArrayList<Animal>();
		zoologico.add(new Galinha());
		zoologico.add(new Morcego());
		zoologico.add(new Gato());
		
		ArrayList<Mamifero> mamadouro = new ArrayList<Mamifero>();
		mamadouro.add(new Morcego());
		mamadouro.add(new Gato());
		
		ArrayList<Voador> gaiola = new ArrayList<>();
		gaiola.add(new Morcego());
		gaiola.add(new Passaro());
		
		for(Voador voador: gaiola) {
			voador.voar();
		}

	}
	
}
