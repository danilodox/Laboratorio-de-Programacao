package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sistema.ControleAcademico;
import usuario.Aluno;

public class ControleAcademicoTest {
	Aluno aluno1, aluno2, aluno3;
	ControleAcademico controle;
	@Before
	public void setUp() throws Exception {
		controle = new ControleAcademico();
		
		aluno1 = new Aluno("Aline");
		aluno2 = new Aluno("Marcelo");
		aluno3 = new Aluno("Maria");
		
		aluno1.addDisciplinaAluno("OAC", "7:00", "9:00");
		aluno1.addDisciplinaAluno("Programacao", "9:00", "11:00");
		aluno1.addDisciplinaAluno("Calculo", "7:00", "9:00");
		
		aluno2.addDisciplinaAluno("OAC", "7:00", "9:00");
		aluno2.addDisciplinaAluno("Programacao", "9:00", "11:00");
		
		aluno3.addDisciplinaAluno("OAC", "7:00", "9:00");
		
		controle.addAluno(aluno1);
		controle.addAluno(aluno2);
		controle.addAluno(aluno3);
	}

	@Test
	public void testGetNumeroAlunosNaDisciplina() throws Exception {
		assertEquals(3, controle.getNumeroAlunosNaDisciplina("OAC"));
		assertEquals(1, controle.getNumeroAlunosNaDisciplina("Calculo"));
		assertEquals(2, controle.getNumeroAlunosNaDisciplina("Programacao"));
	}
	

	@Test
	public void testGetAlunosNaDisciplina() throws Exception {
		System.out.println(controle.getAlunosNaDisciplina("OAC"));
		assertEquals("Nome: Aline\n"
				+ 	 "Nome: Marcelo\n"
				+    "Nome: Maria\n", controle.getAlunosNaDisciplina("OAC"));
	}
	

}
