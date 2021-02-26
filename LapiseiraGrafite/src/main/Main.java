package main;

import lapiseiraGrafite.Grafite;
import lapiseiraGrafite.Lapiseira;

public class Main {

	public static void main(String[] args) {
		//case inserindo grafites
		Lapiseira lapiseira = new Lapiseira(0.5f);
		System.out.println(lapiseira);
		//calibre: 0.5, grafite: null
		lapiseira.inserir(new Grafite(0.7f, "2B", 50));
		//fail: calibre incompatível
		lapiseira.inserir(new Grafite(0.5f, "2B", 50));
		System.out.println(lapiseira);
		//calibre: 0.5, grafite: [0.5:2B:50]
		

		//case inserindo e removendo
		lapiseira = new Lapiseira(0.3f);
		lapiseira.inserir(new Grafite(0.3f, "2B", 50));
		System.out.println(lapiseira);
		//calibre: 0.3, grafite: [0.3:2B:50]
		lapiseira.inserir(new Grafite(0.3f, "4B", 70));
		//fail: ja existe grafite
		System.out.println(lapiseira);
		//calibre: 0.3, grafite: [0.3:2B:50]
		lapiseira.remover();
		lapiseira.inserir(new Grafite(0.3f, "4B", 70));
		System.out.println(lapiseira);
		//calibre: 0.3, grafite: [0.3:4B:70]
		
		//case escrevendo 1
		lapiseira = new Lapiseira(0.9f);
		lapiseira.inserir(new Grafite(0.9f, "4B", 4));
		lapiseira.write(1);
		//warning: grafite acabou
		System.out.println(lapiseira);
		//calibre: 0.9, grafite: null
		lapiseira.inserir(new Grafite(0.9f, "4B", 30));
		lapiseira.write(6);
		System.out.println(lapiseira);
		//calibre: 0.9, grafite: [0.9:4B:6]
		lapiseira.write(3);
		//fail: folhas escritas completas: 1
		//warning: grafite acabou
		System.out.println(lapiseira);
		//calibre: 0.9, grafite: null
	}

}
