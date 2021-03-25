package hospital;

import java.util.List;

public interface IMedico {
	
	String getId();
	void addPaciente(IPaciente paciente);
	void removerPaciente(String idPaciente);
	List<IPaciente> getPacientes();
	String getClasse();
	
}
