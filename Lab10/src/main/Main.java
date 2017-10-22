package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import sistema.Sistema;

public class Main {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();
		Scanner scan = new Scanner(System.in);
		 
	    System.out.printf("Informe o nome de arquivo texto:\n");
	    String nome = scan.nextLine();
	    scan.close();

		try {
		      FileReader arq = new FileReader(nome);
		      BufferedReader lerArq = new BufferedReader(arq);
		 
		      String linha = lerArq.readLine();
		      sistema.separarTexto(linha);
		      
		      int contador = 0;
		      
	    	  while (linha != null) {
	    		  contador++;
	    		  if (contador == 1){
	    			  linha = lerArq.readLine();
	    		  }
		    	  sistema.separarTexto(linha);
		    	  linha = lerArq.readLine();
		      }
	      arq.close();
		} catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
	    }
		
		if (sistema.verificarTags()){
			System.out.println("Correto");	
	    }else{
	  	  System.out.println("Incorreto");
	    }
	}
}
