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

	public String getNumeroAlunosNaDisciplina(String nomeDisciplina) throws Exception {
		int numeroDeAlunos = 0;
		String alunoEmString = "";

		for (Usuario aluno : mapaDeUsuarios.values()) {
			if (aluno instanceof Aluno) {

				if (aluno.contemDisciplina(nomeDisciplina)) {
					numeroDeAlunos++;
				}
			}
		}
		return alunoEmString += "Total de matriculados na disciplina de " + nomeDisciplina + ": " + numeroDeAlunos
				+ " alunos\n";

	}

	public String getAlunosNaDisciplina(String nomeDisciplina) throws Exception {
		String alunoNaDisciplina = "";

		alunoNaDisciplina += "Alunos na disciplina de " + nomeDisciplina + "\n\n";
		for (Usuario aluno : mapaDeUsuarios.values()) {
			if (aluno instanceof Aluno) {

				if (aluno.contemDisciplina(nomeDisciplina)) {
					alunoNaDisciplina += aluno.toString();
				}
			}
		}
		return alunoNaDisciplina;

	}

	public void criaProf(String nome) {
			Professor prof = new Professor(nome);
			mapaDeUsuarios.put(prof.getNome(), prof);
	}

	public void criaAluno(String nome) {
			Aluno aluno = new Aluno(nome);
			mapaDeUsuarios.put(aluno.getNome(), aluno);
	}

	public boolean addDisciplina(String nome, String disciplina, String horarioInicio, String horarioFim)
			throws Exception {

		if (verificaUsuarioTrue(nome)) { // VERIFICA SE EXISTE O USUARIO

			if (verificaTipoObjeto(nome)) { // SE FOR PROFESSOR...
				if (mapaDeUsuarios.get(nome).contemDisciplina(disciplina)) {

					throw new Exception("Disciplina ja contem professor!");
				}
				mapaDeUsuarios.get(nome).addDisciplina(disciplina, horarioInicio, horarioFim);// SE NAO, O PROF PODE
				return true;
			} else { // CASO SEJA ALUNO, ADICIONA DISCIPLINA AO ALUNO
				mapaDeUsuarios.get(nome).addDisciplina(disciplina, horarioInicio, horarioFim); // ALUNO ADD
				return true;
			}
		}
		return false;

	}

	
	private boolean verificaUsuarioTrue(String nome) throws Exception {
		if (mapaDeUsuarios.containsKey(nome)) {
			return true;
		} else {
			return false;
		}
	}

	private boolean verificaTipoObjeto(String nome) {
		for (Usuario usuarios : mapaDeUsuarios.values()) {
			if (usuarios instanceof Professor) {
				return true;
			}
		}
		return false;
	}

	public String getMatricula(String nome) {
		return mapaDeUsuarios.get(nome).getMatricula();
	}

	public String getProfNaDisciplina(String nomeDisciplina) {
		String profEmString = "";
		for (Usuario professor : mapaDeUsuarios.values()) {
			if (professor instanceof Professor) {
				if (professor.contemDisciplina(nomeDisciplina)) {
					profEmString += "Disciplina: " + nomeDisciplina + ", ministrada por " + "Professor(a): "
							+ professor.getNome() + "\n";
				}
			}
		}
		return profEmString;

	}

}