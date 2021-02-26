package main;

import agiota.Agiota;

public class Main {

	public static void main(String[] args) {
		Agiota ag = new Agiota(500);
		ag.addCli("maria", 500);
		ag.addCli("josue", 60);
		ag.addCli("maria", 300); //fail
		
		ag.lend("maria", 300);
		ag.lend("josue", 50);
		ag.lend("maria", 100);
		
		System.out.println(ag);
		
		ag.lend("bruno", 30);//fail
	    ag.lend("maria", 60);//fail
	    ag.lend("josue", 30);//fail
	    
	    System.out.println(ag);
	    
	    ag.receive("maria", 1000);//fail
	    ag.receive("maria", 350);
	    ag.receive("josue", 1);
	    ag.receive("maria", 10);

	    System.out.println(ag); //check
	    
	    ag.kill("maria");

	    System.out.println(ag); //check



	}

}
