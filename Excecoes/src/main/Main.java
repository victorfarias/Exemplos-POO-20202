package main;

import escola.Escola;
import escola.LimiteProfessorAtingidoException;
import escola.Professor;

public class Main {

	public static void main(String[] args) {
		Escola escola = new Escola();
		try {
//			C�digo a ser executado que lan�a exce��o
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
			System.out.println("a��o: mandar para e-mail alertando sobre limite de professores");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("a��o: pedir para o usu�rio inserir novamente os dados");
		}finally {
			System.out.println("Caiu no finally do segundo try");
		}
		
		try {
			escola.adicionarProfessor(new Professor("12334556771", "Jo�o"));
			escola.adicionarProfessor(new Professor("12334556772", "Maria"));
			escola.adicionarProfessor(new Professor("12334556773", "Bruna"));
			escola.adicionarProfessor(new Professor("12334556774", "Larissa"));
			escola.adicionarProfessor(new Professor("12334556775", "Joana"));
			escola.adicionarProfessor(new Professor("12334556776", "Jorge"));
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println("Pedir para usu�rio inserir os dados");
		}catch(LimiteProfessorAtingidoException e) {
			System.out.println(e.getMessage());
			System.out.println("Mandar e-mail para dire��o");
//			escola.mandarEmailDirecao();
		}finally {
			System.out.println("Caiu no finally do terceiro try");
//			finalizar conex�es
//			fechar arquivos
		}
		
		System.out.println(escola);			

	}

}
