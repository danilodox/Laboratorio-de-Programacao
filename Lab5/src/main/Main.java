package main;

import Sistema.FigurasGeometricas;

public class Main {

	public static void main(String[] args) {

		FigurasGeometricas fig = new FigurasGeometricas(10, 5, 7, 25);

		System.out.println(fig.calculaPerimetro());
		System.out.println(fig.calculaArea());
		System.out.println(fig.calculaTodasAsAreas());
		System.out.println(fig.toString());

	}

}