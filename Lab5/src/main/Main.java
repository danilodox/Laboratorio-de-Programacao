package main;

import sistema.FigurasGeometricas;

public class Main {

	public static void main(String[] args) throws Exception {

		FigurasGeometricas fig1, fig2, fig3, fig4, fig5, fig6, fig7;
		
		//definindo os conjuntos de figuras
		fig1 = new FigurasGeometricas(10, 5, 7, 25);
		fig2 = new FigurasGeometricas(3, 6, 2, 1);
		fig3 = new FigurasGeometricas(1, 2, 3, 12);
		
		System.out.println("Figuras 1: ");
		//calculando perimetro das figuras 1 (fig1)
		System.out.println(fig1.calculaPerimetro("retangulo"));
		System.out.println(fig1.calculaPerimetro("quadrado"));
		System.out.println(fig1.calculaPerimetro("circulo"));
		
		//calculando area das figuras 1 (fig1)
		System.out.println(fig1.calculaArea("retangulo"));
		System.out.println(fig1.calculaArea("quadrado"));
		System.out.println(fig1.calculaArea("circulo"));
		System.out.println(fig1.calculaArea("todas"));
		
		//pegando informacoes sobre as figuras 1 (fig1)
		System.out.println(fig1.exibeInformacoeFiguras("retangulo"));
		System.out.println(fig1.exibeInformacoeFiguras("quadrado"));
		System.out.println(fig1.exibeInformacoeFiguras("circulo"));
		System.out.println(fig1.exibeInformacoeFiguras("todas"));
		
		System.out.println("\nFiguras 2: ");
		//calculando perimetro das figuras 2 (fig2)
		System.out.println(fig2.calculaPerimetro("retangulo"));
		System.out.println(fig2.calculaPerimetro("quadrado"));
		System.out.println(fig2.calculaPerimetro("circulo"));
				
		//calculando area das figuras 2 (fig2)
		System.out.println(fig2.calculaArea("retangulo"));
		System.out.println(fig2.calculaArea("quadrado"));
		System.out.println(fig2.calculaArea("circulo"));
		System.out.println(fig2.calculaArea("todas"));
		
		//pegando informacoes sobre as figuras 2 (fig2)
		System.out.println(fig2.exibeInformacoeFiguras("retangulo"));
		System.out.println(fig2.exibeInformacoeFiguras("quadrado"));
		System.out.println(fig2.exibeInformacoeFiguras("circulo"));
		System.out.println(fig2.exibeInformacoeFiguras("todas"));

		System.out.println("\nFiguras 3: ");
		//calculando perimetro das figuras 3 (fig3)
		System.out.println(fig3.calculaPerimetro("retangulo"));
		System.out.println(fig3.calculaPerimetro("quadrado"));
		System.out.println(fig3.calculaPerimetro("circulo"));

						
		//calculando area das figuras 3 (fig3)
		System.out.println(fig3.calculaArea("retangulo"));
		System.out.println(fig3.calculaArea("quadrado"));
		System.out.println(fig3.calculaArea("circulo"));
		System.out.println(fig3.calculaArea("todas"));
						
		//pegando informacoes sobre as figuras 3 (fig3)
		System.out.println(fig3.exibeInformacoeFiguras("retangulo"));
		System.out.println(fig3.exibeInformacoeFiguras("quadrado"));
		System.out.println(fig3.exibeInformacoeFiguras("circulo"));
		System.out.println(fig3.exibeInformacoeFiguras("todas"));
		
		
		//verificando Exceptions
		fig4 = new FigurasGeometricas(0, 5, 7, 25);
		fig5 = new FigurasGeometricas(1, 5, -7, 25);
		fig6 = new FigurasGeometricas(6, 6, 2, 1);
		fig7 = new FigurasGeometricas(1, 2, 3, -12);
		
	}
}