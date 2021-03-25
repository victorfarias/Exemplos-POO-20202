package main;

import universidade.Professor;
import universidade.STA;
import universidade.Terceirizado;
import universidade.Universidade;

public class Main {

	public static void main(String[] args) {
		Universidade universidade = new Universidade();
		
		Professor david = new Professor("David", "C");
		universidade.addFuncionario(david);
		universidade.addFuncionario(new Professor("Elvis", "D"));
		STA gilmario = new STA("Gilmario", 3);
		universidade.addFuncionario(gilmario);
		Terceirizado helder = new Terceirizado("Helder", 40, true);
		universidade.addFuncionario(helder);
		System.out.println(universidade);
		
		universidade.removerFuncionario("Elvis");
		System.out.println(universidade);
		
		david.adicionarDiaria();
		david.adicionarDiaria();
		david.adicionarDiaria();
		// fail: limite de diarias atingido

		System.out.println(david);
		// Prof david classe C
		// salario 7200

		gilmario.adicionarDiaria();
		gilmario.adicionarDiaria();
		// fail: limite de diarias atingido
		System.out.println(gilmario);
		// Sta gilmario nivel 3
		// salario 4000

		helder.adicionarDiaria();
		// fail: terc nao pode receber diaria
		
		universidade.distribuirBonus(600.0f);
		System.out.println(gilmario);
		// Sta gilmario nivel 3
		// salario 4200

		universidade.distribuirBonus(300.0f);
		System.out.println(gilmario);
		// Sta gilmario nivel 3
		// salario 4100

	}

}
