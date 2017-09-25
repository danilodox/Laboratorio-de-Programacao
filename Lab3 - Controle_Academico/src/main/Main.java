package main;

import sistema.ControleAcademico;

public class Main {

	public static void main(String[] args) throws Exception {
		ControleAcademico controle = new ControleAcademico();
		
		System.out.println("===== Sistema de Controle Academico UEPB - lab04 =====\n");
		
		
		controle.criaAluno("Pedro");
		controle.criaAluno("Joao");
		controle.criaAluno("Marcela");
		controle.criaAluno("Gustavo");
		controle.criaAluno("Elica");
		controle.criaAluno("Renato");
		controle.criaAluno("Alice");
		controle.criaAluno("Aline");
		
		controle.criaProf("Sabrina");
		controle.criaProf("Danilo");
		
		
		controle.addDisciplina("Sabrina", "Laboratorio", "7:00", "9:00");
		controle.addDisciplina("Danilo", "Programacao", "7:00", "9:00");
		
		
		controle.addDisciplina("Aline", "Programacao", "7:00", "9:00");
		controle.addDisciplina("Alice", "Programacao", "7:00", "10:00");
		controle.addDisciplina("Renato", "Programacao", "7:00", "10:00");
		controle.addDisciplina("Elica", "Programacao", "7:00", "10:00");
		controle.addDisciplina("Gustavo", "Programacao", "7:00", "10:00");
		controle.addDisciplina("Marcela", "Programacao", "7:00", "10:00");
		
		controle.addDisciplina("Pedro", "Laboratorio", "9:00", "11:00");
		controle.addDisciplina("Joao", "Laboratorio", "9:00", "11:00");
		controle.addDisciplina("Marcela", "Laboratorio", "9:00", "11:00");
		controle.addDisciplina("Gustavo", "Laboratorio", "9:00", "11:00");
		
		
		System.out.println(controle.getAlunosNaDisciplina("Programacao"));
		System.out.println(controle.getProfNaDisciplina("Programacao"));
		System.out.println(controle.getNumeroAlunosNaDisciplina("Programacao"));
		System.out.println("============================================================================");
		System.out.println("============================================================================\n");
		
		System.out.println(controle.getAlunosNaDisciplina("Laboratorio"));
		System.out.println(controle.getProfNaDisciplina("Laboratorio"));
		System.out.println(controle.getNumeroAlunosNaDisciplina("Laboratorio"));

	}

}
