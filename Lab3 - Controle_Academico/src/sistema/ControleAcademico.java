package sistema;

import java.util.HashMap;
import java.util.Map;

import usuario.Aluno;
import usuario.Professor;
import usuario.Usuario;

public class ControleAcademico {
	private Map<String, Usuario> mapaDeUsuarios;

	public ControleAcademico() {
		super();
		this.mapaDeUsuarios = new HashMap<>();
	}

	public int getNumeroAlunosNaDisciplina(String nomeDisciplina) throws Exception {
		int numeroDeAlunos = 0;

		for (Usuario aluno : mapaDeUsuarios.values()) {
			if (aluno instanceof Aluno) {
				
				if (aluno.contemDisciplina(nomeDisciplina)) {
					numeroDeAlunos++;					
				}
			}
		}
		return numeroDeAlunos;

	}

	public String getAlunosNaDisciplina(String nomeDisciplina) throws Exception {
		String alunoNaDisciplina = "";
		for (Usuario aluno : mapaDeUsuarios.values()) {
			if (aluno instanceof Aluno) {
				
				if (aluno.contemDisciplina(nomeDisciplina)) {
					alunoNaDisciplina += aluno.toString();
				}
			}
		}
		return alunoNaDisciplina;

	}

	public void addProfessor(Professor professor) {
		mapaDeUsuarios.put(professor.getNome(), professor);
	}

	public void addAluno(Aluno aluno) {
		mapaDeUsuarios.put(aluno.getNome(), aluno);
	}

}
