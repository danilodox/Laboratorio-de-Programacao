package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import figurasGeometricas.Quadrado;

public class QuadradoTest {

	Quadrado quadrado1, quadrado2, quadrado3, quadrado4, quadrado5;
	
	@Before
	public void setUp() throws Exception {
		quadrado1 = new Quadrado(12);
		quadrado3 = new Quadrado(1);
		quadrado4 = new Quadrado(6);
		
	}

	@Test(expected = java.lang.Exception.class)
	public void testCalculaArea() throws Exception {
		assertEquals(144.0, 0, quadrado1.calculaArea());
		assertEquals(1.0, 0, quadrado3.calculaArea());
		assertEquals(36.0, 0, quadrado4.calculaArea());
		
		quadrado2 = new Quadrado(0);
		quadrado2.calculaArea();
		quadrado5 = new Quadrado(-5.2);
		quadrado5.calculaArea();
	}

	@Test(expected = java.lang.Exception.class)
	public void testCalculaPerimetro() throws Exception{
		assertEquals(48.0, 0, quadrado1.calculaPerimetro());
		assertEquals(4.0, 0, quadrado3.calculaPerimetro());
		assertEquals(24.0, 0, quadrado4.calculaPerimetro());
		
		quadrado2 = new Quadrado(0);
		quadrado2.calculaPerimetro();
		quadrado5 = new Quadrado(-5.2);
		quadrado5.calculaPerimetro();
	}

	@Test
	public void testToString() {
		assertEquals("O quadrado criado tem lados de tamanho: 12.0", quadrado1.toString());
		assertEquals("O quadrado criado tem lados de tamanho: 1.0", quadrado3.toString());
		assertEquals("O quadrado criado tem lados de tamanho: 6.0", quadrado4.toString());

	}

}
