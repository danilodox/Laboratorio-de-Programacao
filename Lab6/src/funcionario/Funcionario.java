package funcionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import filme.Filme;

public abstract class Funcionario {
	private String nome;
	private TipoDeFuncionario funcaoDoFuncionario;
	//private Set<Funcao> funcao;
	private Map<String, Filme> filmografia;

	public Funcionario(String nome,/* Set<Funcao> funcao,*/ TipoDeFuncionario tipoDeFuncionario) {
		this.nome = nome;
		//this.funcao = funcao;
		filmografia = new HashMap<>();
		this.funcaoDoFuncionario = tipoDeFuncionario;
	}

	public void getFilmografia() {
		//...
	}

	public String getNome() {
		return nome;
	}

	public TipoDeFuncionario getStatusDoFuncionario() {
		return funcaoDoFuncionario;
	}

	/*public Set<String> getFuncao() {
		Set<String> aux = new HashSet<>();

		for (Funcao funcao : this.funcao) {

			aux.add(funcao.toString());
		}
		return aux;
	}*/

}
