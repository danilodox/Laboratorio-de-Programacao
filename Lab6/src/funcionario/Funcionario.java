package funcionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import filme.Filme;

public class Funcionario {
	private String nome;
	private Funcao funcaoDoFuncionario;
	private Map<String, Filme> filmografia;

	public Funcionario(String nome, Funcao tipoDeFuncionario) {
		this.nome = nome;
		filmografia = new HashMap<>();
		this.funcaoDoFuncionario = tipoDeFuncionario;
	}

	public void getFilmografia() {
		//...
	}

	public String getNome() {
		return nome;
	}

	public Funcao getFuncaoDoFuncionario() {
		return funcaoDoFuncionario;
	}


	
	
	

}
