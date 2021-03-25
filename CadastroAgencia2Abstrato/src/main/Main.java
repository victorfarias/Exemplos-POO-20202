package main;

import banco.Agencia;
import banco.Conta;

public class Main {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		agencia.adicionarCliente("Almir");
		agencia.adicionarCliente("Julia");
		agencia.adicionarCliente("Maria");
		System.out.println(agencia);

		agencia.getConta(0).depositar(100);
		agencia.getConta(1).depositar(200);
		agencia.getConta(2).depositar(50);
		agencia.getConta(3).depositar(300);

		agencia.getConta(3).sacar(50);
		agencia.getConta(0).sacar(70);
		agencia.getConta(1).sacar(300);
		// fail: saldo insuficiente

		System.out.println(agencia);

		Conta conta1 = agencia.getConta(3);
		Conta conta2 = agencia.getConta(5);
		if(conta1 != null && conta2 != null) {
		    conta1.transferir(conta2, 200);
		}

		conta1 = agencia.getConta(0);
		conta2 = agencia.getConta(4);
		if(conta1 != null && conta2 != null) {
		    conta1.transferir(conta2, 25);
		}

		conta1 = agencia.getConta(9);
		// fail: conta nao encontrada
		conta2 = agencia.getConta(1);
		if(conta1 != null && conta2 != null) {
		    conta1.transferir(conta2, 30);
		}

		conta1 = agencia.getConta(2);
		conta2 = agencia.getConta(8);
		// fail: conta nao encontrada
		if(conta1 != null && conta2 != null) {
		    conta1.transferir(conta2, 10);
		}

		System.out.println(agencia);

		for(Conta conta: agencia.getContas()) {
		    conta.atualizacaoMensal();
		}
		System.out.println(agencia);
		
		
		
		
		Universidade universidade = new Universidade();
		
		Professor david = new Professor("David", "C")
		universidade.addFuncionario(david);
		universidade.addFuncionario(new Professor("Elvis", "D"));
		STA gilmario = new STA("Gilmario", 3);
		universidade.addFuncionario(gilmario);
		Terceirizado helder = new Terceirizado("Helder", 40, true);
		universidade.addFuncionario(helder);
		System.out.println(universidade);
		
		universidade.removerFuncionario("Elvis");
		System.out.println(universidade);
		
		david.addDiaria();
		david.addDiaria();
		david.addDiaria();
		// fail: limite de diarias atingido

		System.out.println(david);
		// Prof david classe C
		// salario 7200

		gilmario.addDiaria();
		gilmario.addDiaria();
		// fail: limite de diarias atingido
		System.out.println(gilmario);
		// Sta gilmario nivel 3
		// salario 4000
		
		helder.addDiaria();
		// fail: terc nao pode receber diaria

		universidade.distribuirBonus(600.0f);
		System.out.println(gilmario);
		// Sta gilmario nivel 3
		// salario 4200
		
		
		universidade.distribuirBonus(300.0f);
		System.out.println(gilmario);		
		// Sta gilmario nivel 3
		// salario 4300	

	}

}
