package sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import filme.Filme;
import funcionario.Funcionario;

public class Sistema {
	private Map<String, Filme> mapaDeFilmes;

	public Sistema() {
		mapaDeFilmes = new HashMap<>();
	}

	// PERCORRE CADA FILME, PEGA OS FUNCIONARIOS ENVOLVIDOS NESSE FILME E ADICIONA
	// EM UMA LISTA DE FUNCIONARIOS EXTERNA E NO FINAL, RETORNA ESSA LISTA
	public ArrayList<Funcionario> getRecuperaListaFuncionarios() {
		ArrayList<Funcionario> mapaAux = new ArrayList<>();

		for (Filme filmes : mapaDeFilmes.values()) {
			mapaAux.addAll(filmes.getListaDeFuncionarios());
		}
		return mapaAux;

	}

	public void adicionaFuncionario() {

	}
	
}
