package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import sistema.Sistema;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		
		/*
		boolean assertBody = true;
		int countBody = 0;
		for (int i = 0; i < texto.length() - 7; i++) {
			if ( texto.substring(i, i + 6).equals("<body>")) {
				countBody++;
			} else if (texto.substring(i, i + 7).equals("</body>")) {
				countBody--;
			}
			
			if (countBody < 0) { 
				assertBody = false;
			}
		}
		
		if (countBody > 0) {
			assertBody = false;
		}
		
		if (assertBody) {
			System.out.println("Correto");
		} else {
			System.out.println("Incorreto");
		}
		
		*/
		
		/*
		List<String> textoAux = new LinkedList<String>();
		
		String texto = "";
		texto = scan.nextLine();
		boolean sinal = true;
		int contadorParenteses = 0;
		int contadorMaiorMenor = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			if (texto.charAt(i) == '(') {
				contadorParenteses++;
			}
			if (texto.charAt(i) == '<') {
				contadorMaiorMenor++;
			}
			if (texto.charAt(i) == ')') {
				contadorParenteses--;
			}
			if (texto.charAt(i) == '>') {
				contadorMaiorMenor--;
				texto.substring(i, i + 4);
			}
			
			if (contadorMaiorMenor <= -1 || contadorParenteses <= -1 ) {
				sinal = false;
			}
			
		}
		
		
		if (sinal == false) {
			System.out.println("Incorreto");
		}else {
			System.out.println("Correto"); 
		}
		*/
		
		
		Sistema sistema = new
		Sistema(texto);
		
		if (sistema.verificarTags()) { System.out.println("Correto"); } else {
		System.out.println("Incorreto"); }
		
		

	}

}
