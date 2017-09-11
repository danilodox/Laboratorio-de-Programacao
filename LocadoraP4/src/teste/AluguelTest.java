package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;

import aluguel.Aluguel;
import fita.Fita;

public class AluguelTest {
	Fita fita1, fita2;
	Aluguel aluguel1, aluguel2;
	
	@Before
	public void criaAlguel() {
		fita1 = new Fita("Circle", "LANCAMENTO");
		aluguel1 = new Aluguel(fita1, 2);
		
		fita2 = new Fita("Guardioes da Galaxia Vol. 2", "NORMAL");
		aluguel2 = new Aluguel(fita2, 4);
	}
	
	
	@Test 
	public void testCalculaExtrato() {
		aluguel1.calculaExtrato("LANCAMENTO");
		assertEquals(2, aluguel1.getPontosDeAlugadorFrequenta());
		assertEquals(6, aluguel1.getValorTotal(), 0);
		
		
		aluguel2.calculaExtrato("NORMAL");
		assertEquals(1, aluguel2.getPontosDeAlugadorFrequenta());
		assertEquals(5, aluguel2.getValorTotal(), 0);
	}
	
	@Test (expected = java.lang.IllegalArgumentException.class)
	public void testCalculaExtratoFalse() {
		Aluguel aluguel3 = new Aluguel(new Fita("filme", "aaaaa"), 3);
		
	}

	@Test
	public void testToString() {
		assertEquals("	Circle\t0.0\n", aluguel1.toString());
		assertEquals("	Guardioes da Galaxia Vol. 2\t0.0\n", aluguel2.toString());
	}

	
	
	
	
}