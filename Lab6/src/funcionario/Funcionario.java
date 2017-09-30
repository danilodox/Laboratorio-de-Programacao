package funcionario;

import java.util.HashSet;
import java.util.Set;

import filme.Filme;

public class Funcionario {
	private String nome;
	private TipoDeFuncionario statusDoFuncionario;
	private Set<Funcao> funcao;

	public Funcionario(String nome, Set<Funcao> funcao, TipoDeFuncionario tipoDeFuncionario) {
		this.nome = nome;
		this.funcao = funcao;
		this.statusDoFuncionario = tipoDeFuncionario;
	}

	public void getFilmografia() {
		//...
	}

	public String getNome() {
		return nome;
	}

	public TipoDeFuncionario getStatusDoFuncionario() {
		return statusDoFuncionario;
	}

	public Set<String> getFuncao() {
		Set<String> aux = new HashSet<>();

		for (Funcao funcao : this.funcao) {

			aux.add(funcao.toString());
		}
		return aux;
	}

}
