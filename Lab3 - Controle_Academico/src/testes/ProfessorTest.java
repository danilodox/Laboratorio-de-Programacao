package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import disciplina.Disciplina;
import usuario.Professor;

public class ProfessorTest {
	Professor prof1, prof2;

	@Before
	public void setUp() throws Exception {
		prof1 = new Professor("Sabrina");
		prof2 = new Professor("Misael");

		prof1.addDisciplina("Programacao", "11:00", "13:00");
	}

	@Test
	public void addDisciplina() throws Exception {
		prof2.addDisciplina("OAC", "11:00", "13:00");
	}

	@Test(expected = java.lang.Exception.class)
	public void addDisciplinaFalse() throws Exception {
		prof1.addDisciplina("Programacao", "11:00", "13:00");
	}

	@Test
	public void testGetHorario() throws Exception {
		assertEquals("Programacao: 11:00 - 13:00\n", prof1.getHorario());
	}

	@Test(expected = java.lang.Exception.class)
	public void testGetHorarioFalse() throws Exception {
		assertEquals("Error", prof2.getHorario());
	}

	@Test
	public void testGetListaDisciplinas() throws Exception {
		assertEquals("Lista de disciplinas ministradas: \n" + "Programacao\n", prof1.getListaDisciplinas());
	}

	@Test(expected = java.lang.Exception.class)
	public void testGetListaDisciplinasFalse() throws Exception {
		assertEquals("Error", prof2.getListaDisciplinas());
	}

	@Test
	public void testContemDisciplina() {
		assertTrue(prof1.contemDisciplina("Programacao"));

		assertFalse(prof2.contemDisciplina("Calculo"));
		assertFalse(prof2.contemDisciplina("Programacao"));
	}
}
