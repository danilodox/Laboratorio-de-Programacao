package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import manipuladordearquivos.ManipuladorArquivo;

public class Main {

	public static void main(String[] args) throws IOException {

		// encontra o dicionario e salva na String dicionario
		String urlDicionario = "java.txt";
		String dicionario = ManipuladorArquivo.importaTexto(urlDicionario);

		// encontra a palavra para buscar no dicionario e salva na String busca
		String urlBusca = "texto2.txt";
		String busca = ManipuladorArquivo.importaTexto(urlBusca);
		
		ArrayList<String> listText = new ArrayList<>();
		listText = meuSplit(dicionario);

		System.out.println(binarySearch(listText, busca.substring(0, busca.length() - 2)));// mostra se a palavra a ser buscada foi encontrada ou nao
	}

	// Metodo para quebrar uma string em espacos e retirar os caracteres especiais
	private static ArrayList<String> meuSplit(String texto) {
		char letra;

		String[] ArrayPalavras = texto.split(" ");
		ArrayList<String> aux = new ArrayList<>();

		for (String p : ArrayPalavras) {
			String palavra = "";
			for (int j = 0; j < p.length(); j++) {
				letra = p.charAt(j);

				if (Character.isLetter(letra)) {
					palavra += letra;
				}
			}
			if (!(aux.contains(palavra.toLowerCase()))) {
				aux.add(palavra.toLowerCase());
			}

		}
		// ordena em ordem alfabetica o arrayList
		Collections.sort(aux);
		// retorna o arrayList pronto
		return aux;
	}

	// Metodo para fazer uma busca binaria, achar uma string em um arrayList, se
	// achar retorna a palavra encontrada, se nao, retorna "inexistente"
	private static String binarySearch(ArrayList<String> list, String palavra) {
		System.out.println(list);// mostra o dicionario ordenado e separado
		
		int inicio = 0, fim = list.size() - 1, meio = (inicio + fim) / 2;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			
			if (palavra.equals(list.get(meio))) {
				return (String) list.get(meio);

			} else if (palavra.compareTo((String) list.get(meio)) > 0) {
				inicio = meio + 1;

			} else if (palavra.compareTo((String) list.get(meio)) < 0) {
				fim = meio - 1;

			}
		}
		return "inexistente";
	}

}
