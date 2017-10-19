package estrutura;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	private List<String> texto;
	private int posicaoPilha;

	public Pilha() {
		this.texto = new LinkedList<String>();
		this.posicaoPilha = -1;
	}

	public List<String> getTexto() {
		return texto;
	}

	public void setTexto(List<String> texto) {
		this.texto = texto;
	}

	public int getPosicaoPilha() {
		return posicaoPilha;
	}

	public void setPosicaoPilha(int posicaoPilha) {
		this.posicaoPilha = posicaoPilha;
	}

	// adiciona elemento na pilha
	public void empilhar(String palavra) {
		// push
		this.texto.add(++posicaoPilha, palavra);
	}

	// remove elemento do topo da pilha
	public String desempilhar() {
		// pop
		if (vazia()) {
			return null;
		}
		this.texto.remove(posicaoPilha);
		return this.texto.get(posicaoPilha--);
	}

	// verifica se a pilha estah vazia
	public boolean vazia() {
		// isEmpty
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	// retorna o tamanho da pilha
	public int tamanho() {
		// is
		if (this.vazia()) {
			return 0;
		}
		return this.posicaoPilha + 1;
	}

	// retorna o ultimo valor que foi adicionado na pilha
	public String exibeUltimoValor() {
		// top
		if (this.vazia()) {
			return null;
		}
		return this.texto.get(posicaoPilha);
	}

}
