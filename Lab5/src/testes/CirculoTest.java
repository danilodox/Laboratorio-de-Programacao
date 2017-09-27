package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import figurasGeometricas.Circulo;

public class CirculoTest {

	Circulo circulo1, circulo2, circulo3, circulo4, circulo5;
	
	@Before
	public void setUp() throws Exception {
		circulo1 = new Circulo(12);
		circulo2 = new Circulo(6);
		circulo4 = new Circulo(1);
	}
	
	@Test(expected = java.lang.Exception.class)
	public void testCalculaArea() throws Exception {
		assertEquals(75.3, 0, circulo1.calculaArea());
		assertEquals(37.6, 0, circulo2.calculaArea());
		assertEquals(6.2, 0, circulo4.calculaArea());
		
		circulo3 = new Circulo(0);
		circulo3.calculaArea();
		circulo5 = new Circulo(-2.4);
		circulo5.calculaArea();
		
	}

	@Test(expected = java.lang.Exception.class)
	public void testCalculaPerimetro() throws Exception{
		assertEquals(37.6, 0, circulo1.calculaPerimetro());
		assertEquals(18.8, 0, circulo2.calculaPerimetro());
		assertEquals(3.1, 0, circulo4.calculaPerimetro());
		
		circulo3 = new Circulo(0);
		circulo3.calculaPerimetro();
		circulo5 = new Circulo(-2.4);
		circulo5.calculaPerimetro();
	}

	@Test
	public void testToString() {
		assertEquals("O circulo criado tem raio de tamanho: 12.0", circulo1.toString());
		assertEquals("O circulo criado tem raio de tamanho: 6.0", circulo2.toString());
		assertEquals("O circulo criado tem raio de tamanho: 1.0", circulo4.toString());
	}
	
}
