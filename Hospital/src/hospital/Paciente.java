package hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente implements IPaciente{
	
	private String id, diagnostico;
	private ArrayList<IMedico> medicos;
	
	public Paciente(String id, String diagnostico) {
		this.id = id;
		this.diagnostico = diagnostico;
		this.medicos = new ArrayList<IMedico>();
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void addMedico(IMedico medico) {
		this.medicos.add(medico);
	}

	@Override
	public void removerMedico(String idMedico) {
		for(IMedico medico: this.medicos) {
			if(medico.getId() == idMedico) {
				this.medicos.remove(medico);
				return;
			}
		}
	}

	@Override
	public List<IMedico> getMedicos() {
		return this.medicos;
	}

	@Override
	public String getDiagnostico() {		
		return this.diagnostico;
	}
	
	public String toString() {
		String listaMedicos = "[ ";
		for(IMedico medico: this.medicos) {
			listaMedicos += (medico.getId() + " ");
		}
		listaMedicos += "]";
		return "Pac: " + this.id + ":" +this.diagnostico + " Meds: " + listaMedicos;
	}

}
