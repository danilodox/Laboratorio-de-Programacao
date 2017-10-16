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
	
	public Funcionario getAtor(String nomeAtor) {
		for (Funcionario funcionario : elenco) {
			if (funcionario.getNome().equals(nomeAtor)) {
				return funcionario;
			}
		}
		return null;
		
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
	
	public String mostrarElenco() {
		String elenco = "";
		for (Funcionario cadaAtor : this.elenco) {
			elenco += "" + cadaAtor.getNome() + ", ";
		}
		return elenco;
	}

	public Funcionario getCinegrafista() {
		return cinegrafista;
	}

	@Override
	public String toString() {
		return "Filme: " + nomeFilme + "\n ano: " + ano + "\n diretor: " + diretor.getNome() + "\n roteirista: " + roteirista.getNome()
				+ "\n elenco: " + mostrarElenco() + "\n cinegrafista: " + cinegrafista.getNome();
	}

	

}
