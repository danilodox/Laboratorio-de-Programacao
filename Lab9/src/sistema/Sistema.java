package sistema;

import estrutura.Pilha;

public class Sistema {

	private Pilha pilha;

	public Sistema(String conteudo) {
		pilha = new Pilha();
		separarTexto(conteudo);
	}

	// separa o texto fornecido em palavras
	public void separarTexto(String conteudo) {
		String[] arrayPalavras = conteudo.split(" ");
		for (String p : arrayPalavras) {
			adicionarPalavraPilha(p);
		}
	}

	private void adicionarPalavraPilha(String palavra) {
		pilha.empilhar(palavra);
	}

	/*public void removerPalavraTopoPilha() {
		pilha.desempilhar();
	}

	public boolean verificarPilhaVazia() {
		return pilha.vazia();
	}

	public int verificarTamanhoDaPilha() {
		return pilha.tamanho();
	}

	public String verificarTopoPilha() {
		return pilha.exibeUltimoValor();
	}*/

	// verifica se as tags estao corretas
	public boolean verificarTags() {
		String palavra = "";
		boolean resposta = false;
		int contador = 0;

		// verifica se a tag <body> estah correta
		if ((pilha.getTexto().get(0).equalsIgnoreCase("<body>"))
				&& (pilha.getTexto().get(pilha.getPosicaoPilha()).equalsIgnoreCase("</body>"))) {
			
			// inicia a iteracao para o corpo do texto
			for (String p : pilha.getTexto()) {
				palavra = "";
				
				// exclui a verificacao de <body> q jah foi feita
				if (!(p.equalsIgnoreCase("<body>")) && !(p.equalsIgnoreCase("</body>"))) {
					// verificando se as tags de inicializacao possuem tags de encerramento
					if (p.startsWith("<")) {
						// monta a palavra sem o "<"
						for (int i = 1; i < p.length(); i++) {
							palavra += p.charAt(i);
						}
						// procura o encerramento da tag com "</"
						for (String p1 : pilha.getTexto()) {
							if (p1.equalsIgnoreCase("</" + palavra)) {
								resposta = true;
							} // encerra a verificacao se nao encontrou a tag de encerramento e os elementos
								// da pilha jah foram percorridos
							if (resposta == false && contador == pilha.getTexto().size()) {
								return resposta;
							}
						}

					} // verificando se as tags de encerramento possuem tags de inicializacao
					if (p.startsWith("</")) {
						// monta a palavra sem o "</"
						for (int i = 2; i < p.length(); i++) {
							palavra += p.charAt(i);
						}
						// procura a inicializacao da tag com "<"
						for (String p1 : pilha.getTexto()) {
							if (p1.equalsIgnoreCase("<" + palavra)) {
								resposta = true;
							} // encerra a verificacao se nao encontrou a tag de inicializacao e os elementos
								// da pilha jah foram percorridos
							if (resposta == false && contador == pilha.getTexto().size()) {
								return resposta;
							}
						}
					}
				}
			}
		} else {
			return resposta;
		}

		return resposta;
	}

}