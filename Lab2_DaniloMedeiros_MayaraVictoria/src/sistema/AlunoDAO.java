package sistema;

import java.util.ArrayList;

import aluno.Aluno;
import caderneta.Caderneta;

public class AlunoDAO {

	Caderneta caderneta;
	Aluno aluno;
	
	public AlunoDAO() {
		this.caderneta = new Caderneta();
		this.aluno = new Aluno();
	}

	public Caderneta getCaderneta() {
		return caderneta;
	}
	
	public Aluno getAluno(){
		return aluno;
	}

	//verifica se eh possivel adiciona o aluno X na caderneta
	public void inserir(Aluno aluno){
		boolean tem = false;
		for (Aluno alunoDados : caderneta.getAlunos()) {
			if (alunoDados.getNome().equalsIgnoreCase(aluno.getNome())){
				tem = true;
			}
		}
		if (!tem){
			caderneta.inserirNaLista(aluno);
		}
	}
	
	//verifica se eh possivel remover o aluno X na caderneta
	public void remover(Aluno aluno){
		for (int i = 0; i < caderneta.getAlunos().size(); i++) {
			if (caderneta.getAlunos().get(i).getNome().equalsIgnoreCase(aluno.getNome())){
				caderneta.removerDaLista(i);
			}
		}
	}
	
	//Atualiza aluno na lista de alunos da caderneta
	public void atualizar(Aluno alunoAntigo, Aluno alunoNovo){
		for (int i = 0; i < caderneta.getAlunos().size(); i++) {
			if (caderneta.getAlunos().get(i).getNome().equalsIgnoreCase(alunoAntigo.getNome())){
				caderneta.getAlunos().get(i).setNome(alunoNovo.getNome());
				caderneta.getAlunos().get(i).setNota1(alunoNovo.getNota1());
				caderneta.getAlunos().get(i).setNota2(alunoNovo.getNota2());
				caderneta.getAlunos().get(i).setNotaFinal(alunoNovo.getNotaFinal());
				caderneta.getAlunos().get(i).setFrequencia(alunoNovo.getFrequencia());
			}
		}
	}
	
	//retorna a list de alunos da caderneta com seus respectivos enderecos de memoria
	public ArrayList<Aluno> listarAlunos(){
		return caderneta.getAlunos();
	}
	
	//retorna o endereco de memoria do aluno 
	public Aluno procuraAluno(String nomeAluno){
		for (Aluno dadosAluno : caderneta.getAlunos()) {
			if (dadosAluno.getNome().equalsIgnoreCase(nomeAluno)){
				return dadosAluno;
			}
		}
		return null;
	}
	
}
