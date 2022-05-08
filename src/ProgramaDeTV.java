import java.util.ArrayList;

public class ProgramaDeTV {
	private long id;
	private String nome;
	private TipoDePrograma tipoPrograma;
	private ArrayList<DiasDaSemana> diasDaSemana;
	
	public ProgramaDeTV(String nome, TipoDePrograma tipoDePrograma, ArrayList<DiasDaSemana> diasDaSemanas) {
		this.id = System.currentTimeMillis();
		this.nome = nome;
		this.tipoPrograma = tipoDePrograma;
		this.diasDaSemana = diasDaSemanas;
	}
	
	public String toString() {
		return nome;
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public TipoDePrograma getTipoPrograma() {
		return tipoPrograma;
	}
	public ArrayList<DiasDaSemana> getDiasDaSemana() {
		return diasDaSemana;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipoPrograma(TipoDePrograma tipoPrograma) {
		this.tipoPrograma = tipoPrograma;
	}
	public void setDiasDaSemana(ArrayList<DiasDaSemana> diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}
	
	
}
