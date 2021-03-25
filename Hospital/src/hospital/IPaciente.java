package hospital;

import java.util.List;

public interface IPaciente {

	String getId();
	void addMedico(IMedico medico);
	void removerMedico(String idMedico);
	List<IMedico> getMedicos();
	String getDiagnostico();
		
}
