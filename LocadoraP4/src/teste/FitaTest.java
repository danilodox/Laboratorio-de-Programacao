package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fita.Fita;

public class FitaTest {
	Fita fita1, fita2;
	
	
	@Before
	public void criaFita() {
		fita1 = new Fita("Era do gelo", "INFANTIL");
		fita2 = new Fita("Circle", "LANCAMENTO");
	}
	
	@Test
	public void testGetTitulo() {
		assertEquals("Era do gelo", fita1.getTitulo());
		assertEquals("Circle", fita2.getTitulo());
	}

	@Test
	public void testGetTipoDeFita() {
		assertEquals("INFANTIL", fita1.getTipoDeFita());
		assertEquals("LANCAMENTO", fita2.getTipoDeFita());
	}

	@Test
	public void testToString() {
		assertEquals("\tEra do gelo", fita1.toString());
		assertEquals("\tCircle", fita2.toString());
	}

}
