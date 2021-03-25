package hospital;

import java.util.ArrayList;
import java.util.List;

public class Medico implements IMedico{
	
	private String id, classe;
	private ArrayList<IPaciente> pacientes;
	
	public Medico(String id, String classe) {
		this.id = id;
		this.classe = classe;
		this.pacientes = new ArrayList<IPaciente>();
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void addPaciente(IPaciente paciente) {
		this.pacientes.add(paciente);
	}

	@Override
	public void removerPaciente(String idPaciente) {
		for(IPaciente paciente: this.pacientes) {
			if(paciente.getId() == idPaciente) {
				this.pacientes.remove(paciente);
				return;
			}
		}
	}

	@Override
	public List<IPaciente> getPacientes() {
		return this.pacientes;
	}

	@Override
	public String getClasse() {
		return this.classe;
	}
	
	public String toString() {
		String listaPacientes = "[ ";
		for(IPaciente paciente: this.pacientes) {
			listaPacientes += (paciente.getId() + " ");
		}
		listaPacientes += "]";
		return "Med: " + this.id + ":" + this.classe + " Pacs:" + listaPacientes ;
	}

}
