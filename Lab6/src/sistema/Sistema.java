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

	// PASSA POR PARAMETRO O NOME DO FILME, O ANO E O NOME DE CADA FUNCIONARIO
	// ATRAVEZ DO NOME DE CADA FUNCIONARIO, PROCURA NO MAPA DE FUNCIONARIO E
	// ADICIONA UM FILME A CADA UM
	public void criarFilme(String nomeFilme, int ano, String nomeDiretor, String nomeRoteirista, String nomeDosAtores,
			String nomeCinegrafista) {

		Filme filme = new Filme(nomeFilme, ano, mapaDeFuncionarios.get(nomeDiretor),
				mapaDeFuncionarios.get(nomeRoteirista), setAtor(nomeDosAtores),
				mapaDeFuncionarios.get(nomeCinegrafista));
		mapaDeFilmes.put(nomeFilme, filme);

		this.mapaDeFuncionarios.get(nomeDiretor).addFilme(filme);
		this.mapaDeFuncionarios.get(nomeRoteirista).addFilme(filme);
		this.mapaDeFuncionarios.get(nomeCinegrafista).addFilme(filme);

		// COMO É UM CONJUNTO DE ATORES, ENTAO PERCORRE O CONJUNTO E ADICIONA O FILME
		// PARA CADA UM PELO NOME DE CADA UM DELES, SEPARADO POR ESPAÇO
		setAdicionarCadaAtor(nomeDosAtores, filme);

	}

	// SEPARA A STRING (NOME DOS ATORES) POR ESPAÇO USANDO SPLIT E ADICIONA TUDO EM
	// UM ARRAY, PERCORRE ESSE ARRAY E ADICIONA CADA ATOR PARA O MAPA DE
	// FUNCIONARIOS
	private Set<Funcionario> setAtor(String nomeDosAtores) {
		String[] cadaAtor = nomeDosAtores.split(" ");
		Set<Funcionario> listaAtores = new HashSet<>();
		Ator atorReferencia = new Ator();
		for (String ator : cadaAtor) {
			if (mapaDeFuncionarios.get(ator).hasFuncao(atorReferencia)) {
				listaAtores.add(mapaDeFuncionarios.get(ator));
			}
		}
		return listaAtores;
	}

	// METODO USADO PARA SEPARAR CADA ATOR DA STRING NOME DOS ATORES, E ADICIONAR O
	// FILME NO MAPA DE FILMOGRAFIA DE CADA UM DELES
	private void setAdicionarCadaAtor(String nomeDosAtores, Filme filme) {
		String[] cadaAtor = nomeDosAtores.split(" ");
		for (String ator : cadaAtor) {
			mapaDeFuncionarios.get(ator).addFilme(filme);

		}
	}

	// CRIA FUNCIONARIO ATRAVEZ DO NOME E DA FUNCAO OU FUNCOES
	// PARECIDO COM O Q SE FAZ COM O CONJUNTO DE NOMES DE ATORES
	public void criaFuncionario(String nome, String funcoesEmString) {
		Set<Funcao> funcoes = setFuncoes(funcoesEmString);
		this.mapaDeFuncionarios.put(nome, new Funcionario(nome, funcoes));
	}

	// FUNCOES É UMA STRING, EX: ATOR DIRETOR
	// USANDO SPLIT, SEPARA ATOR EM UMA STRING E DIRETOR EM OUTRA STRING
	// ADICIONA CADA UMA DESSAS STRING AO ARRAY CRIADO
	// PERCORRE O ARRAY E CRIA O FUNCIONARIO A PARTIR DA FUNCAO FORNECIDA
	private Set<Funcao> setFuncoes(String funcoes) {
		Set<Funcao> setDeFuncoes = new HashSet<>();
		String[] cadaFuncao = funcoes.split(" ");
		for (String funcao : cadaFuncao) {
			setDeFuncoes.add(criaFuncao(funcao));
		}
		return setDeFuncoes;
	}

	// A PARTIR DO NOME DA FUNCAO, CRIA A FUNCAO
	private Funcao criaFuncao(String s) {
		Funcao funcao;
		switch (s.toLowerCase()) {
		case ("diretor"):
			funcao = new Diretor();
			break;

		case ("ator"):
			funcao = new Ator();
			break;

		case ("cinegrafista"):
			funcao = new Cinegrafista();
			break;

		case ("roteirista"):
			funcao = new Roteirista();
			break;

		default:
			throw new RuntimeException("funcao incorreto!");
		}
		return funcao;
	}

	public String getFilmografia(String nomeFuncionario) throws Exception {
		String filmeEmString = "";

		if (this.mapaDeFuncionarios.get(nomeFuncionario).hasFilme()) {
			filmeEmString += "===> Filmografia <===\n";
			for (Filme cadaFilme : mapaDeFuncionarios.get(nomeFuncionario).getFilmografia().values()) {
				filmeEmString += cadaFilme.toString();
			}

		} else {
			filmeEmString += ("Funcionario nao participou de nenhum filme");
		}

		return filmeEmString;

	}

	public Map<String, Funcionario> getMapaDeFuncionarios() {
		return mapaDeFuncionarios;
	}
	
	public String getFilmografiaPorFuncao(String nomeFuncionario, String nomeFuncao) {
		return this.mapaDeFuncionarios.get(nomeFuncionario).getFilmografiaPorFuncao(nomeFuncao);
	}
}
