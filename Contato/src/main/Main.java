package main;

import contato.Contato;

public class Main {

	public static void main(String[] args) {
		
		Contato contato = new Contato("david");
		System.out.println(contato);
		contato.addFone("oi", "88");
		contato.addFone("tim", "99");
		contato.addFone("tim", "88");
		contato.addFone("vivo", "83");
		System.out.println(contato);
		
		contato.rmFone(2);
		System.out.println(contato);
		contato.rmFone(0);
		System.out.println(contato);
		
		contato.addFone("tim", "9a9");
		contato.addFone("tim", "(85)99.99");
		System.out.println(contato);

	}

}
