package usuario;

import java.util.HashMap;
import java.util.Map;

import disciplina.Disciplina;

public class Professor extends Usuario {
	Map<String, Disciplina> mapaDeDisciplina;

	public Professor(String nome) {
		super(nome);
		this.mapaDeDisciplina = new HashMap<>();
		// TODO Auto-generated constructor stub
	}

	public void addDisciplina(String disciplina, String horarioInicio, String horarioFim) {
		Disciplina disc = new Disciplina(disciplina, horarioInicio, horarioFim);
		mapaDeDisciplina.put(disc.getNomeDisciplina(), disc);
	}

	@Override
	public String getHorario() throws Exception {
		String horarioProf = "";

		if (mapaDeDisciplina.size() > 0) {
			for (Disciplina disciplina : mapaDeDisciplina.values()) {

				horarioProf += disciplina.getNomeDisciplina() + ": \n";
				horarioProf += disciplina.getHorarioInicio() + " - " + disciplina.getHorarioFim() + "\n";

			}
			return horarioProf;
		}
		throw new Exception("Professor nao tem nenhuma disciplina cadastrada no momento. Sem horario no momento!! ");
	}

	@Override
	public String getListaDisciplinas() throws Exception {
		String listaDisciplinas = "";

		if (mapaDeDisciplina.size() > 0) {

			listaDisciplinas += "Lista de disciplinas ministradas: \n";

			for (Disciplina disciplina : mapaDeDisciplina.values()) {

				listaDisciplinas += disciplina.toString() + "\n";

			}
			return listaDisciplinas;
		}
		throw new Exception("Nenhuma disciplina cadastrada no momento");
	}

	@Override
	public boolean contemDisciplina(String nomeDisciplina) {
		// TODO Auto-generated method stub
		return false;
	}

}
