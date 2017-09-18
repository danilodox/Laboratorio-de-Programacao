package disciplina;

import java.util.ArrayList;

import usuario.Aluno;

public class Disciplina {
	private String disciplina;
	private String horarioInicio;
	private String horarioFim;
	private ArrayList<Aluno> listaDeAlunos;

	
	public Disciplina(String disciplina, String horarioInicio, String horarioFim) {
		this.disciplina = disciplina;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		listaDeAlunos = new ArrayList<>();
	}

	public int getNumeroAlunosNaDisciplina() {
		return listaDeAlunos.size();
	}

	public String getAlunosNaDisciplina() throws Exception {
		String alunoEmString = "";

		if (listaDeAlunos.size() > 0) {

			alunoEmString += "Lista de alunos matriculados na disciplina: \n";

			for (int i = 0; i < listaDeAlunos.size(); i++) {
				alunoEmString += i + " - " + listaDeAlunos.get(i).getNome() + "\n";
			}
			return alunoEmString;
		}
		throw new Exception("Nenhum aluno matriculado no momento.");
	}

	public String getNomeDisciplina() {
		return disciplina;
	}

	public int getNumeroDeAlunos() {
		return this.listaDeAlunos.size();

	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public String getHorarioFim() {
		return horarioFim;
	}

	@Override
	public String toString() {
		return "Disciplina: " + getNomeDisciplina() + "\n" + "Horário: " + getHorarioInicio() + " - " + getHorarioFim();
	}

}