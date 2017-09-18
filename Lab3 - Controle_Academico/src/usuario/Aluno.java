package usuario;

import java.util.HashMap;
import java.util.Map;

import disciplina.Disciplina;

public class Aluno extends Usuario {
	Map<String, Disciplina> mapaDeDisciplinaDoAluno;
	
	public Aluno(String nome) {
		super(nome);
		mapaDeDisciplinaDoAluno = new HashMap<>();

	}

	public void addDisciplinaAluno(String disciplina, String horarioInicio, String horarioFim) {
		Disciplina disc = new Disciplina(disciplina, horarioInicio, horarioFim);
		mapaDeDisciplinaDoAluno.put(disc.getNomeDisciplina(), disc);
	}

	
	
	public void getDisciplinasAluno() {

	}

	public void gethorarioAluno() {

	}

}
