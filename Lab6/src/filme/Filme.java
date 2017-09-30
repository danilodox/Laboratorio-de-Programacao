package filme;

import java.util.Set;

import funcionario.Funcionario;

public class Filme {

	private String nomeFilme;
	private int ano;
	private Funcionario diretor;
	private Funcionario roteirista;
	private Set<Funcionario> elenco;
	private Funcionario cinegrafista;

	public Filme(String nomeFilme, int ano, Funcionario diretor, Funcionario roteirista, Set<Funcionario> elenco,
			Funcionario cinegrafista) {
		super();
		this.nomeFilme = nomeFilme;
		this.ano = ano;
		this.diretor = diretor;
		this.roteirista = roteirista;
		this.elenco = elenco;
		this.cinegrafista = cinegrafista;

	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public int getAno() {
		return ano;
	}

	public Funcionario getDiretor() {
		return diretor;
	}

	public Funcionario getRoteirista() {
		return roteirista;
	}

	public Set<Funcionario> getElenco() {
		return elenco;
	}

	public Funcionario getCinegrafista() {
		return cinegrafista;
	}

	

}
