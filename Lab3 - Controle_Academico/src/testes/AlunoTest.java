package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import usuario.Aluno;

public class AlunoTest {
	Aluno aluno1, aluno2;
	
	
	@Before
	public void setUp() throws Exception {
		aluno1 = new Aluno("Marcelo");
		aluno2 = new Aluno("Maria");
		
		
		aluno1.addDisciplinaAluno("Calculo", "7:00", "10:00");
		aluno1.addDisciplinaAluno("Programacao", "11:00", "13:00");
	}
	
	
	@Test
	public void addDisciplina() throws Exception {
		aluno2.addDisciplinaAluno("OAC", "11:00", "13:00");
	}

	@Test(expected = java.lang.Exception.class)
	public void addDisciplinaFalse() throws Exception {
		aluno1.addDisciplinaAluno("Programacao", "11:00", "13:00");
	}

	@Test
	public void testGetHorario() throws Exception {
		assertEquals("Calculo: 7:00 - 10:00\n"
				+ "Programacao: 11:00 - 13:00\n", aluno1.getHorario());
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testGetHorarioFalse() throws Exception {
		assertEquals("Error", aluno2.getHorario());
	}
	
	@Test
	public void testGetListaDisciplinas() throws Exception {
		assertEquals("Lista de disciplinas cadastradas: \nCalculo\n"
				+ "Programacao\n", aluno1.getListaDisciplinas());
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testGetListaDisciplinasFalse() throws Exception {
		assertEquals("Error", aluno2.getListaDisciplinas());
	}

  
	
	@Test
	public void testContemDisciplina() {
		assertTrue(aluno1.contemDisciplina("Calculo"));
		assertTrue(aluno1.contemDisciplina("Programacao"));
		
		assertFalse(aluno2.contemDisciplina("Calculo"));
		assertFalse(aluno2.contemDisciplina("Programacao"));
	}


}
