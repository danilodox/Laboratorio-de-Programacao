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

	public int getNumeroAlunosNaDisciplina(String nomeAluno, String nomeDisciplina) {
		int numeroDeAlunos = 0;

		for (int i = 0; i < mapaDeUsuarios.size(); i++) {

			if (this.mapaDeUsuarios.get(nomeAluno).contemDisciplina(nomeDisciplina)) {
				numeroDeAlunos++;
			}
		}
		return numeroDeAlunos;

	}

	public String getAlunosNaDisciplina() throws Exception {
		String alunoEmString = "Lista de alunos matriculados na disciplina: \n";
		int contaAlunos = 0;
		for (Usuario user : mapaDeUsuarios.values()) {
			if (user instanceof Aluno) {
				contaAlunos++;
				alunoEmString += user.getNome() + "\n";
			}
		}
		if (contaAlunos == 0) {
			throw new Exception("Nenhum aluno matriculado no momento.");
		}
		return alunoEmString;
	}

	public void addProfessor(String nome) {
		Professor prof = new Professor(nome);
		mapaDeUsuarios.put(prof.getNome(), prof);
	}

	public void addAluno(String nomeAluno) {
		Aluno aluno = new Aluno(nomeAluno);
		mapaDeUsuarios.put(aluno.getNome(), aluno);
	}

}
