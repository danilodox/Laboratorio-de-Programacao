package filme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import funcionario.Ator;
import funcionario.Camera;
import funcionario.Cinegrafista;
import funcionario.Diretor;
import funcionario.Funcionario;
import funcionario.Roteirista;

//Se nao der certo a Classe Filme ter os objetos das classes dos funcionario enquanto os funcionarios tiverem uma lista de Filmes...
//... entao, cria uma lista de filmes em outra classe externa, e passa essa lista para os funcionario 
// Ou... cria uma lista de Funcionarios em uma classe por fora e passa pra a classe filme, e a classe filme adiciona os funcionarios ao filme!!

public class Filme {
	private String nomeFilme;
	private int ano;
	private Diretor diretor;
	private Roteirista roteirista;
	private Set<Ator> elenco;
	private Cinegrafista cinegrafista;
	private Camera cameraMan;
	private Map<String, Funcionario> mapaDeFuncionarios;
	
	public Filme(String nomeFilme, int ano, Diretor diretor, Roteirista roteirista, Set<Ator> elenco, Cinegrafista cinegrafista,
			Camera cameraMan) {
		super();
		this.nomeFilme = nomeFilme;
		this.ano = ano;
		this.diretor = diretor;
		this.roteirista = roteirista;
		this.elenco = elenco;
		this.cinegrafista = cinegrafista;
		this.cameraMan = cameraMan;
		mapaDeFuncionarios = new HashMap<>();
		
	}
	
	public void adicionaFuncionario(Funcionario funcionario) {
		if (funcionario.getStatusDoFuncionario() instanceof Diretor) {
			//adiciona diretor...
			
		}else if (funcionario.getStatusDoFuncionario() instanceof Ator) {
			//adiciona ator...
			
		}else if (funcionario.getStatusDoFuncionario() instanceof Camera) {
			//adiciona camera...
			
		}else if (funcionario.getStatusDoFuncionario() instanceof Cinegrafista) {
			//adiciona cinegrafista...
			
		}else if (funcionario.getStatusDoFuncionario() instanceof Roteirista) {
			//adiciona roteirista...
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
	
	
	
	

	
}
