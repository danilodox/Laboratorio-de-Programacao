package main;

import java.util.Scanner;

import sistema.Sistema;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		Sistema validator = new Sistema();
		
		if (validator.validaTag(texto)) {
			System.out.println("VALIDO!");
			
		} else {
			System.out.println("NAO VALIDO!");
			
		}
		
		sc.close();

	}

}
