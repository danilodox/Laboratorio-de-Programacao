package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sistema.ControleAcademico;
import usuario.Aluno;

public class ControleAcademicoTest {
	ControleAcademico controle;
	
	@Before
	public void setUp() throws Exception {
		controle = new ControleAcademico();
		
		controle.criaAluno("Aline");
		controle.criaAluno("Marcelo");
		controle.criaAluno("Maria");
		controle.criaAluno("Gustavo");
		controle.criaAluno("Igor");
		
		
		controle.addDisciplina("Aline", "Programacao", "9:00", "11:00");
		controle.addDisciplina("Marcelo", "Programacao", "9:00", "11:00");
		controle.addDisciplina("Maria", "Programacao", "9:00", "11:00");
		controle.addDisciplina("Gustavo", "Programacao", "9:00", "11:00");
		controle.addDisciplina("Igor", "Programacao", "9:00", "11:00");
		
		controle.addDisciplina("Gustavo", "OAC", "9:00", "11:00");
		controle.addDisciplina("Igor", "OAC", "9:00", "11:00");
		
		controle.criaProf("Sabrina");
		controle.addDisciplina("Sabrina", "Laboratorio", "9:00", "11:00");
	}

	@Test
	public void testGetNumeroAlunosNaDisciplina() throws Exception {
		assertEquals("Total de matriculados na disciplina de OAC: 2 alunos\n", controle.getNumeroAlunosNaDisciplina("OAC"));
		assertEquals("Total de matriculados na disciplina de Calculo: 0 alunos\n", controle.getNumeroAlunosNaDisciplina("Calculo"));
		assertEquals("Total de matriculados na disciplina de Programacao: 5 alunos\n", controle.getNumeroAlunosNaDisciplina("Programacao"));
	}
	

	@Test
	public void testGetAlunosNaDisciplina() throws Exception {
		assertEquals("Alunos na disciplina de OAC\n\n"
				   + "Nome: Igor ------ Matricula: 2277281\n"
				   + "Nome: Gustavo ------ Matricula: 2047620235\n", controle.getAlunosNaDisciplina("OAC"));
	}
	
	@Test
	public void testAddDisciplina() throws Exception {
		assertTrue(controle.addDisciplina("Aline", "OAC", "7:00", "9:00"));
		
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testAddDisciplinaFalse() throws Exception {
		assertFalse("Kaique nao existe", controle.addDisciplina("Kaique", "OAC", "9:00", "11:00"));
		assertFalse("Disciplina ja cadastrada", controle.addDisciplina("Aline", "Programacao", "9:00", "11:00"));
		assertFalse("Disciplina ja contem professor!", controle.addDisciplina("Sabrina", "Laboratorio", "9:00", "11:00"));
		
	}
	
	@Test
	public void getProfNaDisciplina() {
		assertEquals("Disciplina: Laboratorio, ministrada por Professor(a): Sabrina\n", controle.getProfNaDisciplina("Laboratorio"));
	}
	
		

}
