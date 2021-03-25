package main;

import escola.Escola;
import escola.LimiteProfessorAtingidoException;
import escola.Professor;

public class Main {

	public static void main(String[] args) {
		Escola escola = new Escola();
		try {
//			Código a ser executado que lança exceção
			escola.adicionarProfessor(new Professor("12334556778", "Victor"));
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Caiu no finally!");
		}
		
		try {
			escola.adicionarProfessor(new Professor("12334556778", "Victor"));			
		}catch(LimiteProfessorAtingidoException e) {
			System.out.println(e.getMessage());			
			System.out.println("ação: mandar para e-mail alertando sobre limite de professores");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("ação: pedir para o usuário inserir novamente os dados");
		}finally {
			System.out.println("Caiu no finally do segundo try");
		}
		
		try {
			escola.adicionarProfessor(new Professor("12334556771", "João"));
			escola.adicionarProfessor(new Professor("12334556772", "Maria"));
			escola.adicionarProfessor(new Professor("12334556773", "Bruna"));
			escola.adicionarProfessor(new Professor("12334556774", "Larissa"));
			escola.adicionarProfessor(new Professor("12334556775", "Joana"));
			escola.adicionarProfessor(new Professor("12334556776", "Jorge"));
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Pedir para usuário inserir os dados");
		}catch(LimiteProfessorAtingidoException e) {
			System.out.println(e.getMessage());
			System.out.println("Mandar e-mail para direção");
//			escola.mandarEmailDirecao();
		}finally {
			System.out.println("Caiu no finally do terceiro try");
//			finalizar conexões
//			fechar arquivos
		}
		
		System.out.println(escola);			

	}

}
