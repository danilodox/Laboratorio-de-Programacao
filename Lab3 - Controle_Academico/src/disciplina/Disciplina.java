package disciplina;

public class Disciplina {
	private String disciplina;
	private String horarioInicio;
	private String horarioFim;

	public Disciplina(String disciplina, String horarioInicio, String horarioFim) {
		this.disciplina = disciplina;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;

	}

	public String getNomeDisciplina() {
		return disciplina;
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