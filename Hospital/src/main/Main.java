package main;

import hospital.Hospital;
import hospital.Medico;
import hospital.Paciente;

public class Main {

	public static void main(String args[]) {
		Hospital hospital = new Hospital();
		hospital.adicionarPaciente(new Paciente("fred", "fratura"));
		hospital.adicionarPaciente(new Paciente("alvis", "avc"));
		hospital.adicionarPaciente(new Paciente("goku", "hemorragia"));
		hospital.adicionarPaciente(new Paciente("silva", "paciente"));
		
		hospital.adicionarMedico(new Medico("bisturi", "cirurgia"));
		hospital.adicionarMedico(new Medico("snif", "alergologia"));
		hospital.adicionarMedico(new Medico("facada", "cirurgia"));		
		
		System.out.println(hospital);		
		
		hospital.vincular("bisturi", "fred");
		hospital.vincular("bisturi", "alvis");
		hospital.vincular("bisturi", "goku");
		
		hospital.vincular("snif", "silva");
		hospital.vincular("snif", "alvis");
		
		hospital.vincular("facada", "goku");
		
		System.out.println(hospital);
		
		hospital.removerPaciente("goku");
		hospital.removerMedico("bisturi");
		System.out.println(hospital);
		
	}
	
}
