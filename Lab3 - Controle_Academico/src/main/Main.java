package main;

import disciplina.Disciplina;
import sistema.ControleAcademico;
import usuario.Aluno;
import usuario.Professor;

public class Main {

	public static void main(String[] args) throws Exception {
		ControleAcademico controle = new ControleAcademico();
		Aluno aluno1 = new Aluno("Marcelo");
		Aluno aluno2 = new Aluno("Juliana");
		Aluno aluno3 = new Aluno("Aline");
		
		aluno1.addDisciplinaAluno("Calculo", "7:00", "9:00");
		aluno1.addDisciplinaAluno("OAC", "7:00", "9:00");
		aluno1.addDisciplinaAluno("Programacao", "11:00", "13:00");
		aluno2.addDisciplinaAluno("OAC", "9:00", "11:00");
		aluno3.addDisciplinaAluno("Calculo", "13:00", "15:00");
		
		
		Professor prof = new Professor("Joao");
		
		controle.addAluno(aluno1);
		controle.addAluno(aluno2);
		controle.addAluno(aluno3);
		
		controle.addProfessor(prof);
		
		System.out.println(controle.getAlunosNaDisciplina("OAC"));
		System.out.println(controle.getAlunosNaDisciplina("Calculo"));
		System.out.println(controle.getAlunosNaDisciplina("Programcao"));
		
		System.out.println(controle.getNumeroAlunosNaDisciplina("OAC"));
		System.out.println(controle.getNumeroAlunosNaDisciplina("Calculo"));
		System.out.println(controle.getNumeroAlunosNaDisciplina("Programacao"));
		

	}

}
