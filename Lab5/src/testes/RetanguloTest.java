package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import figurasGeometricas.Retangulo;

public class RetanguloTest {

	Retangulo retangulo1, retangulo2, retangulo3, retangulo4, retangulo5;
	@Before
	public void setUp() throws Exception {
		retangulo1 = new Retangulo(2, 1);
		retangulo3 = new Retangulo(2, 13);
		retangulo4 = new Retangulo(21, 30);
		
	}

	@Test(expected = java.lang.Exception.class)
	public void testCalculaArea() throws Exception{
		assertEquals(2.0, 0, retangulo1.calculaArea());
		assertEquals(26.0, 0, retangulo3.calculaArea());
		assertEquals(630.0, 0, retangulo4.calculaArea());
		
		retangulo2 = new Retangulo(0, 0);
		retangulo2.calculaArea();
		retangulo5 = new Retangulo(-4, -2);
		retangulo5.calculaArea();
	}

	@Test(expected = java.lang.Exception.class)
	public void testCalculaPerimetro() throws Exception {
		assertEquals(6.0, 0, retangulo1.calculaPerimetro());
		assertEquals(30.0, 0, retangulo3.calculaPerimetro());
		assertEquals(102.0, 0, retangulo4.calculaPerimetro());
		
		retangulo2 = new Retangulo(0, 0);
		retangulo2.calculaPerimetro();
		retangulo5 = new Retangulo(-4, -2);
		retangulo5.calculaPerimetro();
	}

	@Test
	public void testToString() {
		assertEquals("O retangulo criado tem altura de tamanho: 2.0 e largura de: 1.0", retangulo1.toString());
		assertEquals("O retangulo criado tem altura de tamanho: 2.0 e largura de: 13.0", retangulo3.toString());
		assertEquals("O retangulo criado tem altura de tamanho: 21.0 e largura de: 30.0", retangulo4.toString());

	}

}
