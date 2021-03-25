package hospital;

import java.util.HashMap;

public class Hospital {
	
	private HashMap<String, IPaciente> pacientes;
	private HashMap<String, IMedico> medicos;
	
	public Hospital() {
		this.pacientes = new HashMap<String, IPaciente>();
		this.medicos = new HashMap<String, IMedico>();		
	}
	
	public void removerPaciente(String id) {
		for(IMedico medico: this.medicos.values()) {
			medico.removerPaciente(id);
		}
		this.pacientes.remove(id);
	}
	
	public void removerMedico(String id) {
		for(IPaciente paciente: this.pacientes.values()) {
			paciente.removerMedico(id);
		}
		this.medicos.remove(id);
	}
	
	public void adicionarPaciente(IPaciente paciente) {
		this.pacientes.put(paciente.getId(), paciente);
	}
	
	public void adicionarMedico(IMedico medico) {
		this.medicos.put(medico.getId(), medico);
	}
	
	public void vincular(String nomeMedico, String nomePaciente) {
		IMedico medico = this.medicos.get(nomeMedico);
		IPaciente paciente = this.pacientes.get(nomePaciente);
		
		if(medico == null) {
			System.out.println("Medico nao existe");
			return;
		}
		
		if(paciente == null) {
			System.out.println("Paciente nao existe");
			return;
		}
		
		for(IMedico medico_: paciente.getMedicos()) {
			if(medico_.getClasse() == medico.getClasse()) {
				System.out.println("fail: ja existe outro medico da especialidade cirurgia");
				return;
			}
		}
		
		for(IPaciente paciente_ : medico.getPacientes()) {
			if(paciente_.getId() == paciente.getId()) {
				System.out.println("fail: Já existe paciente com esse id");	
			}			
		}
		
		paciente.addMedico(medico);
		medico.addPaciente(paciente);
	}
	
	public String toString() {
		String resultado = "";
		for(IPaciente paciente: this.pacientes.values()) {
			resultado += (paciente + "\n");
		}
		for(IMedico medico: this.medicos.values()) {
			resultado += (medico + "\n");
		}
		return resultado;
	}

}
