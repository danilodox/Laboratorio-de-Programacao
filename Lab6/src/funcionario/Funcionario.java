package funcionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import filme.Filme;

public class Funcionario {
	private String nome;
	private TipoDeFuncionario statusDoFuncionario;
	private Set<Funcao> funcao;
	//private Map<String, Filme> mapaDeFilmes;

	public Funcionario(String nome, Set<Funcao> funcao, TipoDeFuncionario tipoDeFuncionario) {
		this.nome = nome;
		this.funcao = funcao;
		this.statusDoFuncionario = tipoDeFuncionario;
		//mapaDeFilmes = new HashMap<>();
	}
	
	public void adicionaFilme(Filme filme) {
		
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
