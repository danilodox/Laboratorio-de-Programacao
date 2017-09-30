package filme;

import java.util.ArrayList;
import java.util.Set;

import funcionario.Ator;
import funcionario.Camera;
import funcionario.Cinegrafista;
import funcionario.Diretor;
import funcionario.Funcionario;
import funcionario.Roteirista;

public class Filme {
	private String nomeFilme;
	private int ano;
	private Diretor diretor;
	private Roteirista roteirista;
	private Set<Ator> elenco;
	private Cinegrafista cinegrafista;
	private Camera cameraMan;
	private ArrayList<Funcionario> listaDeFuncionarios;

	public Filme(String nomeFilme, int ano, Diretor diretor, Roteirista roteirista, Set<Ator> elenco,
			Cinegrafista cinegrafista, Camera cameraMan) {
		super();
		this.nomeFilme = nomeFilme;
		this.ano = ano;
		this.diretor = diretor;
		this.roteirista = roteirista;
		this.elenco = elenco;
		this.cinegrafista = cinegrafista;
		this.cameraMan = cameraMan;
		listaDeFuncionarios = new ArrayList<>();

	}

	public void adicionaFuncionario(Funcionario funcionario) {
		if (funcionario.getStatusDoFuncionario() instanceof Diretor) {
			// adiciona diretor...

		} else if (funcionario.getStatusDoFuncionario() instanceof Ator) {
			// adiciona ator...

		} else if (funcionario.getStatusDoFuncionario() instanceof Camera) {
			// adiciona camera...

		} else if (funcionario.getStatusDoFuncionario() instanceof Cinegrafista) {
			// adiciona cinegrafista...

		} else if (funcionario.getStatusDoFuncionario() instanceof Roteirista) {
			// adiciona roteirista...
		}

	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public int getAno() {
		return ano;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public Roteirista getRoteirista() {
		return roteirista;
	}

	public Set<Ator> getElenco() {
		return elenco;
	}

	public Cinegrafista getCinegrafista() {
		return cinegrafista;
	}

	public Camera getCameraMan() {
		return cameraMan;
	}

	public ArrayList<Funcionario> getListaDeFuncionarios() {
		return listaDeFuncionarios;
	}

}
