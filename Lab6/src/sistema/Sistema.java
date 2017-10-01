package sistema;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import filme.Filme;
import funcionario.Ator;
import funcionario.Cinegrafista;
import funcionario.Diretor;
import funcionario.Funcao;
import funcionario.Funcionario;
import funcionario.Roteirista;

public class Sistema {
	private Map<String, Filme> mapaDeFilmes;
	private Map<String, Funcionario> mapaDeFuncionarios;

	public Sistema() {
		mapaDeFilmes = new HashMap<>();
		mapaDeFuncionarios = new HashMap<>();
	}
	
	
	
	public void criarFilme(String nomeFilme, int ano, String nomeDiretor, String nomeRoteirista, String nomeDosAtores,
			String nomeCinegrafista) {

		Filme filme = new Filme(nomeFilme, ano, mapaDeFuncionarios.get(nomeDiretor),
				mapaDeFuncionarios.get(nomeRoteirista), setAtor(nomeDosAtores),
				mapaDeFuncionarios.get(nomeCinegrafista));
		mapaDeFilmes.put(nomeFilme, filme);
	}


	public void criaFuncionario(String nome, Set<String> funcao) throws Exception {
		for (String funcoes : funcao) {// PERCORRE A LISTA DE FUNCOES
			Funcionario funcionario = criaTipoDeFuncionario(nome, funcoes);// CRIA UM FUNIONARIO PARA CADA TIPO DE
																			// FUNCAO, MAS COM A MESMA CHAVE DO MAP
			this.mapaDeFuncionarios.put(nome, funcionario);// ADICIONA CADA FUNCIONARIO AO MAP

		}
	}
	
	private Set<Funcionario> setAtor(String nomeDosAtores) {
		String[] cadaAtor = nomeDosAtores.split(" ");
		Set<Funcionario> listaAtores = new HashSet<>();
		for (String ator : cadaAtor) {
			if (mapaDeFuncionarios.get(ator).getFuncaoDoFuncionario() instanceof Ator) {
				listaAtores.add(mapaDeFuncionarios.get(ator));
				
			}
		}
		return listaAtores;
	}

	private Funcionario criaTipoDeFuncionario(String nome, String funcao) throws Exception {
		switch (funcao.toLowerCase()) {

		case ("diretor"):
			Funcao diretor = new Diretor();
			return new Funcionario(nome, diretor);

		case ("ator"):
			Funcao ator = new Ator();
			return new Funcionario(nome, ator);

		case ("cinegrafista"):
			Funcao cinegrafista = new Cinegrafista();
			return new Funcionario(nome, cinegrafista);

		case ("Roteirista"):
			Funcao roteirista = new Roteirista();
			return new Funcionario(nome, roteirista);

		default:
			throw new Exception("funcao incorreto!");
		}

	}


	public Map<String, Funcionario> getMapaDeFuncionarios() {
		return mapaDeFuncionarios;
	}

}
