package funcionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import filme.Filme;

public class Funcionario {
	private String nome;
	private Set<Funcao> funcoes;
	private Map<String, Filme> filmografia;

	public Funcionario(String nome, Set<Funcao> funcoes) {
		this.nome = nome;
		this.funcoes = funcoes;
		this.filmografia = new HashMap<>();
	}

	public boolean hasFuncao(Funcao funcao) {
		for (Funcao f : funcoes) {
			if (f.getClass() == funcao.getClass()) {
				return true;
			}
		}
		return false;
	}

	public void addFilme(Filme filme) {
		this.filmografia.put(filme.getNomeFilme(), filme);
	}

	public String getFilmografiaPorFuncao(String funcaoEspecifica) {
		String filmografia = "";

		switch (funcaoEspecifica.toLowerCase()) {

		case ("diretor"):

			filmografia += getFilmePorFuncao("Diretor");
			break;

		case ("ator"):
			filmografia += getFilmePorFuncao("Ator");
			break;

		case ("cinegrafista"):

			filmografia += getFilmePorFuncao("Cinegrafista");
			break;

		case ("roteirista"):

			filmografia += getFilmePorFuncao("Roteirista");
			break;

		default:
			throw new RuntimeException("na hora de pegar filmografia por funcao deu erro, funcao incorreta");
		}
		return filmografia;

	}

	private String getFilmePorFuncao(String tipoFuncao) {
		String filmografia = "";

		if (tipoFuncao.toLowerCase().equals("diretor")) {
			for (Filme cadaFilme : this.filmografia.values()) {
				if (cadaFilme.getDiretor().getNome().equals(nome)) {
					filmografia = "Filmografia como " + tipoFuncao + "\n";
					filmografia += cadaFilme.toString();
				}
			}
		} else if (tipoFuncao.toLowerCase().equals("ator")) {
			for (Filme cadaFilme : this.filmografia.values()) {
				if (cadaFilme.getAtor(this.nome).nome.equals(nome)) {
					filmografia = "Filmografia como " + tipoFuncao + "\n";
					filmografia += cadaFilme.toString();
				}
			}
		} else if (tipoFuncao.toLowerCase().equals("roteirista")) {
			for (Filme cadaFilme : this.filmografia.values()) {
				if (cadaFilme.getRoteirista().getNome().equals(nome)) {
					filmografia = "Filmografia como " + tipoFuncao + "\n";
					filmografia += cadaFilme.toString();
				}
			}
		} else if (tipoFuncao.toLowerCase().equals("cinegrafista")) {
			for (Filme cadaFilme : this.filmografia.values()) {
				if (cadaFilme.getCinegrafista().getNome().equals(nome)) {
					filmografia = "Filmografia como " + tipoFuncao + "\n";
					filmografia += cadaFilme.toString();
				}
			}
		}
		return filmografia;
	}

	public boolean hasFilme() {
		if (this.filmografia.isEmpty()) {
			return false;
		}
		return true;
	}

	public String getNome() {
		return nome;
	}

	public Map<String, Filme> getFilmografia() {
		return filmografia;
	}

}
