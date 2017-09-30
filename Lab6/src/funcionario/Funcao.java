package funcionario;

public enum Funcao {
	ATOR("ator"), DIRETOR("diretor"), CAMERA("camera"), CINEGRAFISTA("cinegrafista"), ROTEIRISTA("roteirista");
	
	private final String funcao;
	
	Funcao(String funcao){
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}
	
	
}
