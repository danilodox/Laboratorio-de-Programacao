package usuario;


public abstract class Usuario {
	private String nome;
	
	
	public Usuario (String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract String getHorario() throws Exception;
	
	public abstract String getDisciplinas() throws Exception;
}
