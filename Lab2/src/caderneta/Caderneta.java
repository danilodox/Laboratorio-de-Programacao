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
	
	
	//verifica se o aluno estah aprovado ou nao
	public boolean verificaAprovacao(String nomeAluno){
		
		
		for (Aluno dadosAluno : getAlunos()) {
			if (dadosAluno.getNome().equalsIgnoreCase(nomeAluno)){
				return calculaAprovacao(dadosAluno);
			}
		}
		return false;
	}
	
	//calcula se o aluno estah aprovado ou nao a partir de notas e frequencia
	private boolean calculaAprovacao(Aluno aluno){
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
