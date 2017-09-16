package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aluno.Aluno;
import sistema.AlunoDAO;

public class AlunoDAOTest {
	AlunoDAO alunoDAO;
	Aluno aluno1, aluno2, aluno3, aluno4;
	
	@Before
	public void criarAluno() {
		alunoDAO = new AlunoDAO();
		
		
		aluno1 = new Aluno("Maria", 70, 70, 0, 80);
		aluno2 = new Aluno("Joao", 50, 50, 40, 85);
		aluno3 = new Aluno("Cesar", 70, 75, 0, 60);
		aluno4 = new Aluno("Pedro", 85, 20, 50, 75);
		
		
	}
	
	@Test
	public void testInserirTrue() throws Exception {
		alunoDAO.inserir(aluno1);
		alunoDAO.inserir(aluno2);
		
		assertTrue(alunoDAO.getCaderneta().getAlunos().contains(aluno1));
		assertTrue(alunoDAO.getCaderneta().getAlunos().contains(aluno2));
		assertTrue(alunoDAO.inserir(aluno3));
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testInserirFalse() throws Exception {
		
		alunoDAO.inserir(aluno1);
		assertFalse("Aluno existente", alunoDAO.inserir(aluno1));
		assertFalse(alunoDAO.getCaderneta().getAlunos().contains(aluno2));

	}

	@Test
	public void testRemoverTrue() {
		assertFalse(alunoDAO.remover(aluno1));
		
	}
	
	
	
/*
	@Test
	public void testAtualizar() {
		fail("Not yet implemented");
	}

	@Test
	public void testListarAlunos() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcuraAluno() {
		fail("Not yet implemented");
	}
*/
}