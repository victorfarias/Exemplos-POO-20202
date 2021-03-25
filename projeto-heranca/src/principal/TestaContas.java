package principal;

import java.util.ArrayList;

import contas.ContaBancaria;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import contas.ContaSalario;

public class TestaContas {
	
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(150, "123", "Fulano", 0.01);
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaCorrente.getNumero());
		System.out.println(contaCorrente.depositar(20));
		System.out.println(contaCorrente.getSaldo());	
		System.out.println(contaCorrente.sacar(20));
		System.out.println(contaCorrente.getSaldo());
		ContaSalario contaSalario = new ContaSalario(200, "147", "Fulano 2", "Empresa A");
		
		System.out.println(contaCorrente);
		
		ContaBancaria contaCorrente1 = new ContaCorrente(100, "453", "Victor", 0.05);
		System.out.println(contaCorrente1.getSaldo());
		System.out.println(contaCorrente1.sacar(20));
		
		// Não posso usar atributos ou chamar métodos exclusivamento do filho
//		System.out.println(contaCorrente1.depositar());
		
		// Não pode
//		ContaCorrente contaBancaria1 = new ContaBancaria(100, "23423", "Joao");
		
		ArrayList<ContaBancaria> listaDeContas = new ArrayList<ContaBancaria>();
		listaDeContas.add(new ContaCorrente(200, "234324534", "Maria", 0.02));
		listaDeContas.add(new ContaPoupanca(300, "343298", "Joana", 0.05));
		listaDeContas.add(new ContaSalario(400, "2312423", "Jorge", "UFC"));
		
		for(ContaBancaria conta: listaDeContas) {
			System.out.println(conta.getSaldo());
			System.out.println(conta.sacar(20));
			System.out.println(conta.getSaldo());
		}
		
	}

}


