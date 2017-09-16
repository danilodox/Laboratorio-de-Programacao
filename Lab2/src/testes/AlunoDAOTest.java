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
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testInserirFalse() throws Exception {
		
		alunoDAO.inserir(aluno1);
		assertFalse("Aluno existente", alunoDAO.inserir(aluno1));
		assertFalse(alunoDAO.getCaderneta().getAlunos().contains(aluno2));
		assertFalse(alunoDAO.getCaderneta().getAlunos().contains(aluno3));

	}

	@Test
	public void testRemoverTrue() throws Exception {
		alunoDAO.inserir(aluno2);
		assertTrue(alunoDAO.remover(aluno2));
		
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testRemoverFalse() throws Exception {
		
		assertFalse(alunoDAO.remover(aluno1));
		
	}
	
	
	@Test
	public void testAtualizarTrue() throws Exception {
		alunoDAO.inserir(aluno1);
		
		assertTrue(alunoDAO.atualizar(aluno1, aluno2));
		
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testAtualizarFalse() throws Exception {
		
		assertFalse(alunoDAO.atualizar(aluno2, aluno3));
	}
	
	

	@Test
	public void testListarAlunos() {
		assertEquals(0, alunoDAO.getCaderneta().getAlunos().size());

	}

	@Test
	public void testProcuraAluno() throws Exception {
		alunoDAO.inserir(aluno2);
		assertEquals(this.aluno2, alunoDAO.procuraAluno("Joao"));
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testProcuraAlunoFalse() throws Exception {
		
		assertEquals(this.aluno2, alunoDAO.procuraAluno("FarinhaLactea"));
	}
	
	
	

}