package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sistema.FigurasGeometricas;

public class FigurasGeometricasTest {

	FigurasGeometricas fig1, fig2, fig3, fig4, fig5;
	
	@Before
	public void setUp() throws Exception {
		fig1 = new FigurasGeometricas(10, 5, 7, 25);
		fig2 = new FigurasGeometricas(1, 2, 1, 1.5);
	}

	@Test(expected = java.lang.Exception.class)
	public void testCalculaArea() throws Exception {
		assertEquals("A Area deste retangulo eh: 50.0", fig1.calculaArea("retangulo"));
		assertEquals("A Area deste quadrado eh: 49.0", fig1.calculaArea("quadrado"));
		assertEquals("A Area deste circulo eh: 157.0", fig1.calculaArea("circulo"));
		assertEquals("Todas as areas sao: 50.0, 49.0 e 157.0 retangulo, quadrado e circulo, respectivamente\n", fig1.calculaArea("todas"));
		
		assertEquals("A Area deste retangulo eh: 50.0", fig1.calculaArea("ReTAngulo"));
		assertEquals("A Area deste quadrado eh: 49.0", fig1.calculaArea("quADRado"));
		assertEquals("A Area deste circulo eh: 157.0", fig1.calculaArea("CIRCULO"));
		assertEquals("Todas as areas sao: 50.0, 49.0 e 157.0 retangulo, quadrado e circulo, respectivamente\n", fig1.calculaArea("ToDaS"));
	
		assertEquals("A Area deste retangulo eh: 2.0", fig2.calculaArea("retangulo"));
		assertEquals("A Area deste quadrado eh: 1.0", fig2.calculaArea("quadrado"));
		assertEquals("A Area deste circulo eh: 9.42", fig2.calculaArea("circulo"));
		assertEquals("Todas as areas sao: 2.0, 1.0 e 9.42 retangulo, quadrado e circulo, respectivamente\n", fig2.calculaArea("todas"));
		
		fig1.exibeInformacoeFiguras("rervangulote");
		fig3 = new FigurasGeometricas(0, 1, 34, 12);
		fig3.calculaArea("retangulo");
		fig4 = new FigurasGeometricas(2, 2, 3, 1.4);
		fig4.calculaArea("retangulo");
		fig5 = new FigurasGeometricas(-2, 4, -6, 1);
		fig5.calculaArea("retangulo");
		fig5.calculaArea("quadrado");
		
	}

	@Test(expected = java.lang.Exception.class)
	public void testCalculaPerimetro() throws Exception{
		assertEquals("O perimetro do retangulo eh: 30.0", fig1.calculaPerimetro("retangulo"));
		assertEquals("O perimetro do quadrado eh: 28.0", fig1.calculaPerimetro("quadrado"));
		assertEquals("O perimetro do circulo eh: 78.5", fig1.calculaPerimetro("circulo"));
		
		assertEquals("O perimetro do retangulo eh: 30.0", fig1.calculaPerimetro("ReTAngulo"));
		assertEquals("O perimetro do quadrado eh: 28.0", fig1.calculaPerimetro("quADRado"));
		assertEquals("O perimetro do circulo eh: 78.5", fig1.calculaPerimetro("CIRCULO"));
		
		assertEquals("O perimetro do retangulo eh: 6.0", fig2.calculaPerimetro("retangulo"));
		assertEquals("O perimetro do quadrado eh: 4.0", fig2.calculaPerimetro("quadrado"));
		assertEquals("O perimetro do circulo eh: 4.71", fig2.calculaPerimetro("circulo"));
		
		
		fig1.calculaPerimetro("todas");
		fig1.exibeInformacoeFiguras("rervangulote");
		fig2.calculaPerimetro("todas");
		fig3 = new FigurasGeometricas(0, 1, 34, 12);
		fig3.calculaPerimetro("retangulo");
		fig4 = new FigurasGeometricas(2, 2, 3, 1.4);
		fig4.calculaPerimetro("retangulo");
		fig5 = new FigurasGeometricas(-2, 4, -6, 1);
		fig5.calculaPerimetro("retangulo");
		fig5.calculaPerimetro("quadrado");
	}

	@Test(expected = java.lang.Exception.class)
	public void testExibeInformacoeFiguras() throws Exception{
		assertEquals("O retangulo criado tem altura de tamanho: 10.0 e largura de: 5.0", fig1.exibeInformacoeFiguras("retangulo"));
		assertEquals("O quadrado criado tem lados de tamanho: 7.0", fig1.exibeInformacoeFiguras("quadrado"));
		assertEquals("O circulo criado tem raio de tamanho: 25.0", fig1.exibeInformacoeFiguras("circulo"));
		assertEquals("O retangulo criado tem altura de tamanho: 10.0 e largura de: 5.0" + "\n" + "O quadrado criado tem lados de tamanho: 7.0" + "\n" + "O circulo criado tem raio de tamanho: 25.0", fig1.exibeInformacoeFiguras("todas"));
		
		assertEquals("O retangulo criado tem altura de tamanho: 10.0 e largura de: 5.0", fig1.exibeInformacoeFiguras("ReTAngulo"));
		assertEquals("O quadrado criado tem lados de tamanho: 7.0", fig1.exibeInformacoeFiguras("quADRado"));
		assertEquals("O circulo criado tem raio de tamanho: 25.0", fig1.exibeInformacoeFiguras("CIRCULO"));
		assertEquals("O retangulo criado tem altura de tamanho: 10.0 e largura de: 5.0" + "\n" + "O quadrado criado tem lados de tamanho: 7.0" + "\n" + "O circulo criado tem raio de tamanho: 25.0", fig1.exibeInformacoeFiguras("ToDaS"));
		
		assertEquals("O retangulo criado tem altura de tamanho: 1.0 e largura de: 2.0", fig2.exibeInformacoeFiguras("retangulo"));
		assertEquals("O quadrado criado tem lados de tamanho: 1.0", fig2.exibeInformacoeFiguras("quadrado"));
		assertEquals("O circulo criado tem raio de tamanho: 1.5", fig2.exibeInformacoeFiguras("circulo"));
		assertEquals("O retangulo criado tem altura de tamanho: 1.0 e largura de: 2.0" + "\n" + "O quadrado criado tem lados de tamanho: 1.0" + "\n" + "O circulo criado tem raio de tamanho: 1.5", fig2.exibeInformacoeFiguras("todas"));
		
		fig1.exibeInformacoeFiguras("rervangulote");
		fig3 = new FigurasGeometricas(0, 1, 34, 12);
		fig3.exibeInformacoeFiguras("retangulo");
		fig4 = new FigurasGeometricas(2, 2, 3, 1.4);
		fig4.exibeInformacoeFiguras("retangulo");
		fig5 = new FigurasGeometricas(-2, 4, -6, 1);
		fig5.exibeInformacoeFiguras("retangulo");
		fig5.exibeInformacoeFiguras("quadrado");
		
	}

	@Test
	public void testToString() {
		assertEquals("O retangulo criado tem altura de tamanho: 1.0 e largura de: 2.0" + "\n" + "O quadrado criado tem lados de tamanho: 1.0" + "\n" + "O circulo criado tem raio de tamanho: 1.5", fig2.toString());
		assertEquals("O retangulo criado tem altura de tamanho: 10.0 e largura de: 5.0" + "\n" + "O quadrado criado tem lados de tamanho: 7.0" + "\n" + "O circulo criado tem raio de tamanho: 25.0", fig1.toString());
	}

}
