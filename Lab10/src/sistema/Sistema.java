package sistema;

import java.util.ArrayList;
import java.util.Stack;

public class Sistema {

	private Stack<String> pilha;
	private ArrayList<String> tagsDeEncerramento;
	private ArrayList<String> arrayTextoCompleto;

	public Sistema() {
		pilha = new Stack<String>();
		tagsDeEncerramento = new ArrayList<>();
		arrayTextoCompleto = new ArrayList<>();
	}

	// verifica se as tags estao corretas
	public boolean verificarTags() {
		String palavra = "";
		boolean resposta = false;

		construindoPossiveisTags(arrayTextoCompleto);

		if (pilha.empty()) {
			return resposta;
		} else {
			// forma palavra e comeca a comparar
			while (!pilha.empty()) {
				String p = pilha.peek();
				palavra = "</";
				for (int i = 1; i < p.length(); i++) {
					palavra += p.charAt(i);
				}
				if (!compararTagInicioFim(palavra)) {
					return resposta = false;
				} else {
					resposta = true;
				}
			}
		}

		return resposta;
	}

	// pega cada elemento do arrayTextoCompleto e vai construindo as possiveis tags
	private void construindoPossiveisTags(ArrayList<String> arrayTexto) {
		String tag = "";
		int contador = 0;
		boolean resposta = true;
		for (int i = 0; i < arrayTexto.size(); i++) {
			tag = "";
			if (arrayTexto.get(i).equalsIgnoreCase("<")) {
				tag += arrayTexto.get(i);
				contador = i;
				resposta = true;
				while (resposta) {
					contador++;
					if (!arrayTexto.get(contador).equalsIgnoreCase(">")) {
						tag += arrayTexto.get(contador);
					} else {
						tag += arrayTexto.get(contador);
						resposta = false;
					}
				}
				adicionaNaPilha(tag);
			}
		}

	}

	// separa o texto fornecido no array
	public void separarTexto(String conteudo) {
		String[] arrayPalavras = conteudo.split("");
		for (String p : arrayPalavras) {
			arrayTextoCompleto.add(p);
		}
	}

	// adiciona as tags de abertura na pilha e as tags de encerramento no array
	private void adicionaNaPilha(String tag) {
		if (tag.startsWith("</") && (!tag.contains(">>") && !tag.contains("</<") && !tag.contains("<//"))) {
			tagsDeEncerramento.add(tag);
		} else if (tag.startsWith("<") && (!tag.contains("<<") && !tag.contains(">>") && !tag.contains("<//"))) {
			pilha.push(tag);
		}
	}

	// compara os elementos da pilha (inicio) com os do array(fim)
	private boolean compararTagInicioFim(String palavra) {
		boolean resposta = false;
		int indice = -1;
		for (int i = 0; i < tagsDeEncerramento.size(); i++) {
			if (tagsDeEncerramento.get(i).equalsIgnoreCase(palavra)) {
				indice = i;
				pilha.pop();
				return true;
			}
		}
		if (indice != -1) {
			tagsDeEncerramento.remove(indice);
		}

		return resposta;
	}

}
