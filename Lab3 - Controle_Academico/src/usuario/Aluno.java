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



	@Override
	public String getHorario() throws Exception {
String horarioAluno = "";
		
		if (mapaDeDisciplinaDoAluno.size() > 0) {
			for (Disciplina disciplina : mapaDeDisciplinaDoAluno.values()) {
				horarioAluno += disciplina.getNomeDisciplina() + ": \n";
				horarioAluno += disciplina.getHorarioInicio() + " - " + disciplina.getHorarioFim() + "\n";
			}
			return horarioAluno;
		}
		 throw new Exception("Aluno nao tem nenhuma disciplina cadastrada no momento. Sem horario no momento!! ");
	}

	@Override
	public String getDisciplinas() throws Exception {
String listaDisciplinas = "";
		
		if (mapaDeDisciplinaDoAluno.size() > 0) {
			
			listaDisciplinas += "Lista de disciplinas cadastradas: \n";
			
			for (Disciplina disciplina : mapaDeDisciplinaDoAluno.values()) {
				
				listaDisciplinas += disciplina.toString() + "\n";
				
			}
			return listaDisciplinas;
		}
		 throw new Exception("Nenhuma disciplina cadastrada no momento");
	}
	
	

}
