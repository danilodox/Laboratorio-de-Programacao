package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import aluno.Aluno;
import caderneta.Caderneta;
import sistema.AlunoDAO;

public class AlunoDAOTest {
	AlunoDAO alunoDAO;
	Caderneta caderneta;
	Aluno aluno1, aluno2, aluno3, aluno4;
	
	public void criarAluno() {
		alunoDAO = new AlunoDAO();
		
		caderneta = new Caderneta();
		
		aluno1 = new Aluno("Maria", 70, 70, 0, 80);
		aluno2 = new Aluno("Joao", 50, 50, 40, 85);
		aluno3 = new Aluno("Cesar", 70, 75, 0, 60);
		aluno4 = new Aluno("Pedro", 85, 20, 50, 75);
		
		
	}
	
	@Test
	public void testInserirTrue() {
		alunoDAO.inserir(aluno1);
		assertTrue(caderneta.getAlunos().contains(aluno1));
	}
	
	@Test
	public void testInserirFalse() {
		assertFalse(caderneta.getAlunos().contains(aluno2));
	}
/*
	@Test
	public void testRemover() {
		fail("Not yet implemented");
	}

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
