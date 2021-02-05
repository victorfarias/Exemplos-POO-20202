package main;

import cinema.Cinema;

public class Main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema(0);
//	    System.out.println(cinema);
	    
//	    cinema = new Cinema(5);
//	    System.out.println(cinema);
	    
	    cinema = new Cinema(4);
	    System.out.println(cinema);
	    
	    cinema.reservar("davi", "3232", 0);
	    cinema.reservar("joao", "3131", 3);
	    System.out.println(cinema);
	    cinema.reservar("rute", "3030", 0);
	    // fail: cadeira ja esta ocupada
	    cinema.reservar("davi", "3234", 2);
	    // fail: cliente ja esta no cinema
	    
	    cinema.cancelar("davi");
	    System.out.println(cinema);
	    // [ - - - joao:3131 ]
	    cinema.cancelar("rita");
	    // fail: cliente nao esta no cinema
	    System.out.println(cinema);
	    // [ - - - joao:3131 ]

	}

}
