import java.util.ArrayList;

public class CentralDeInformacoes {
	private ArrayList<ProgramaDeTV> todosOsProgramas;
	
	public boolean adicionarPrograma(ProgramaDeTV novoProgramaDeTV) {
		boolean existe = false;
		for (ProgramaDeTV programaDeTV: todosOsProgramas) {
			if (programaDeTV.getId() == novoProgramaDeTV.getId()) existe = true;
		}
		if (!existe) {
			todosOsProgramas.add(novoProgramaDeTV);
			return true;
		}
		return false;
	}
	
	public ArrayList<ProgramaDeTV> getTodosOsProgramas() {
		return todosOsProgramas;
	}
	public void setTodosOsProgramas(ArrayList<ProgramaDeTV> todosOsProgramas) {
		this.todosOsProgramas = todosOsProgramas;
	}
	
	public ProgramaDeTV recuperarProgramaDeTVpeloId(long id) {
		for (ProgramaDeTV programaDeTV: todosOsProgramas) {
			if (programaDeTV.getId() == id) {
				return programaDeTV;
			}
		}
		return null;
	}
}
