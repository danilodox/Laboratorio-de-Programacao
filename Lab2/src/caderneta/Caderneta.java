package caderneta;

import java.util.ArrayList;

import aluno.Aluno;

public class Caderneta {

	ArrayList<Aluno> alunos;
	
		
	public Caderneta() {
		this.alunos = new ArrayList<>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	
	//a classe que tem a lista é quem adiciona elementos
		public void inserirNaLista(Aluno aluno){
			alunos.add(aluno);
		}
		
	//a classe que tem a lista é quem remove elementos
	public void removerDaLista(int i){
		alunos.remove(i);
	}

	//verifica se o aluno estah aprovado ou nao
	public boolean verificaAprovacao(String nomeAluno){
		for (Aluno dadosAluno : getAlunos()) {
			if (dadosAluno.getNome().equalsIgnoreCase(nomeAluno)){
				calculaAprovacao(dadosAluno);
			}
		}
		return false;
	}
	
	//calcula se o aluno estah aprovado ou nao a partir de notas e frequencia
	public boolean calculaAprovacao(Aluno aluno){
		if (aluno.getFrequencia() >= 75){
			if (aluno.getMedia() < 30){
				return false;
			}else if (aluno.getMedia() >= 70){
				return true;
			}else if (aluno.getNotaFinal() >= 50){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}	
	}
	
}
