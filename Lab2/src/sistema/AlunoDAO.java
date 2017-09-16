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
	public boolean inserir(Aluno aluno) throws Exception{
		if (caderneta.getAlunos().contains(aluno)) {
			throw new Exception("Aluno existente");
		}
		
		caderneta.getAlunos().add(aluno);
		return true;
		
	}
	
	//verifica se eh possivel remover o aluno X na caderneta
	public boolean remover(Aluno aluno) throws Exception{
		if (!caderneta.getAlunos().contains(aluno)) {
			throw new Exception("Aluno nao existe");
		}
		
		for (int i = 0; i < caderneta.getAlunos().size(); i++) {
			if (caderneta.getAlunos().get(i).getNome().equalsIgnoreCase(aluno.getNome())){
				caderneta.removerDaLista(i);
				return true;
			}
		}
		return false;
	}
	
	//Atualiza aluno na lista de alunos da caderneta
	public boolean atualizar(Aluno alunoAntigo, Aluno alunoNovo) throws Exception{
		if (!caderneta.getAlunos().contains(alunoAntigo)) {
			throw new Exception("Aluno nao existe");
		}
		
		for (int i = 0; i < caderneta.getAlunos().size(); i++) {
			if (caderneta.getAlunos().get(i).getNome().equalsIgnoreCase(alunoAntigo.getNome())){
				caderneta.getAlunos().get(i).setNome(alunoNovo.getNome());
				caderneta.getAlunos().get(i).setNota1(alunoNovo.getNota1());
				caderneta.getAlunos().get(i).setNota2(alunoNovo.getNota2());
				caderneta.getAlunos().get(i).setNotaFinal(alunoNovo.getNotaFinal());
				caderneta.getAlunos().get(i).setFrequencia(alunoNovo.getFrequencia());
				return true;
			}
		}
		return false;
	}
	
	//retorna a list de alunos da caderneta com seus respectivos enderecos de memoria
	public ArrayList<Aluno> listarAlunos(){
		return caderneta.getAlunos();
	}
	
	//retorna o endereco de memoria do aluno 
	public Aluno procuraAluno(String nomeAluno) throws Exception{
		
		
		
		for (Aluno dadosAluno : caderneta.getAlunos()) {
			
			if (dadosAluno.getNome().equalsIgnoreCase(nomeAluno)){
				return dadosAluno;
			}
			
		}
		throw new Exception("Aluno nao encontrado");
	}
	
}
