package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Map<Character, Set<String>> mapSet = new HashMap<>();

	static Set<String> aux = new HashSet<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String string = scan.nextLine();
		String[] arrayPalavra = string.split("");


		char primeiraLetra = arrayPalavra[0].charAt(0);
		;
		int j = 1;

		while (j < arrayPalavra.length) {
			char elemento = arrayPalavra[j].charAt(0);

			if (Character.isLetter(elemento)) {
				mapSet.put(primeiraLetra, aux);
				primeiraLetra = elemento;
				aux = new TreeSet<>();

			} else {
				aux.add(arrayPalavra[j]);
			}
			j++;
		}
		mapSet.put(primeiraLetra, aux);
		aux = new HashSet<>();

		System.out.println(mapSet.toString());
		exibeIU(mapSet);
		diferencaTotal(mapSet);
	}
	
	public static void exibeIU(Map<Character, Set<String>> map) {
		System.out.println("I");
		for (Object o : interseccao(map)) {
			System.out.println(o);
			}	
		System.out.println("U");
		for (Object o : uniao(map)) {
			System.out.println(o);
			}
	}

	public static void diferencaTotal(Map<Character, Set<String>> map) {
		
		int count = 1;
		for (Character c1 : map.keySet()) {
			for (Character c2 : map.keySet()) {
				if (!c1.equals(c2)) {
					System.out.println("D" + count);
					for (Object o : diferenca(map.get(c1), map.get(c2))) {System.out.println(o);}
					count++;
				}
			}
		}
	}
	
	public static Set uniao(Map<Character, Set<String>> map) {
		Set aux = new TreeSet<>();
		for (Set<String> conjunto : map.values()) {
			aux.addAll(conjunto);
		}

		return aux;
	}

	public static Set interseccao(Map<Character, Set<String>> map) {
		Set aux = new TreeSet<>();
		aux = uniao(map);
		for (Set<String> conjunto : map.values()) {
			aux.retainAll(conjunto);
		}

		return aux;
	}

	public static Set diferenca(Set setA, Set setB) {
		Set result = new TreeSet<>();	
		for (Object o : setA) {
			if (!setB.contains(o)) {result.add(o);}
		}				
		return result ;
	}
}
