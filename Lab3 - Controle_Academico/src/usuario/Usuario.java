package usuario;


public abstract class Usuario {
	private String nome;
	private String matricula;
	
	public Usuario (String nome) {
		this.nome = nome;
		this.matricula = GerarMatricula();
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void addDisciplina(String disciplina, String horarioInicio, String horarioFim) throws Exception {
		
	}
	
	public abstract String getHorario() throws Exception;
	
	public abstract String getListaDisciplinas() throws Exception;
	
	public abstract boolean contemDisciplina(String nomeDisciplina);

	@Override
	public String toString() {
		return "Nome: " + nome + " ------ Matricula: " + matricula + "\n";
	}
	
	public String GerarMatricula() {
		String result = "";
		result += Integer.toString(nome.hashCode());
		return result;
		
		
	}

	
	
}
