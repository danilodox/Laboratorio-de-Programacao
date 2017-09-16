package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aluno.Aluno;
import sistema.AlunoDAO;

public class CadernetaTest {

	AlunoDAO aluno = new AlunoDAO();
	Aluno aluno1, aluno2, aluno3, aluno4, aluno5, aluno6;
	
	@Before
	public void setUp() throws Exception {
		aluno1 = new Aluno ("Maria", 70, 70, 0, 80);
		aluno2 = new Aluno ("Joao", 50, 50, 40, 85);
		aluno3 = new Aluno ("Cesar", 70, 75, 0, 60);
		aluno4 = new Aluno ("Pedro", 85, 20, 50, 75);
		aluno5 = new Aluno ("Marcela", 69, 69, 50, 75);
		aluno6 = new Aluno ("Felipe", 70, 80, 0, 90);
		
		aluno.inserir(aluno1);
		aluno.inserir(aluno2);
		aluno.inserir(aluno3);
		aluno.inserir(aluno4);
		aluno.inserir(aluno5);
		
	}
	
	@Test
	public void testVerificaAprovacao() throws Exception {
		
		
		assertEquals(true, aluno.getCaderneta().verificaAprovacao("Maria"));
		assertEquals(false, aluno.getCaderneta().verificaAprovacao("Joao"));
		assertEquals(false, aluno.getCaderneta().verificaAprovacao("Cesar"));
		assertEquals(true, aluno.getCaderneta().verificaAprovacao("Pedro"));
		assertEquals(true, aluno.getCaderneta().verificaAprovacao("Marcela"));
		
		assertFalse(aluno.getCaderneta().verificaAprovacao("farinhaLactea"));
		assertFalse(aluno.getCaderneta().verificaAprovacao("Felipe"));
	
	}

}
