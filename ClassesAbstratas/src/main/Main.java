package main;

import java.util.ArrayList;

import animal.Animal;
import animal.Cachorro;
import animal.Gato;
import animal.Pato;

public class Main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerBarulho();
		
		Gato gato = new Gato();
		gato.fazerBarulho();
		
		ArrayList<Animal> animais = new ArrayList<Animal>();
		animais.add(new Cachorro());
		animais.add(new Cachorro());
		animais.add(new Pato());
		animais.add(new Gato());
	
		
		for(Animal animal: animais) {
			animal.fazerBarulho();
		}
	}

}
