package jogo;

import java.util.Random;

import tabuleiro.Tabuleiro;

public class JogoDaVelha {

	Tabuleiro tabuleiro;
	private int contadorDeJogadas;

	public JogoDaVelha() {
		this.tabuleiro = new Tabuleiro();
		this.contadorDeJogadas = 0;
	}

	public int getContadorDeJogadas() {
		return contadorDeJogadas;
	}

	public String exibirTabuleiro() {
		return tabuleiro.toString();
	}

	// Marca o tabuleiro com as jogadas de cada jogador
	public boolean marcarJogadas(int linha, int coluna, String marcador) {
		boolean marcouJog = false;

		marcouJog = validaPosicao(marcouJog, marcador, linha, coluna);

		return marcouJog;
	}

	public void gerarJogadasComputador() {
		boolean marcouJog = false;
		String marcador = "X";
		int linha = 0, coluna = 0;

		while (marcouJog == false) {
			linha = new Random().nextInt(3) + 1;
			coluna = new Random().nextInt(3) + 1;

			marcouJog = validaPosicao(marcouJog, marcador, linha, coluna);// verifca se eh possivel marcar na posicao
																			// escolhida no tabuleiro
		}
	}

	private boolean validaPosicao(boolean marcouJog, String marcador, int linha, int coluna) {
		if ((linha >= 1 && linha <= 3) && (coluna >= 1 && coluna <= 3)) {
			if (tabuleiro.getPosicoes()[linha - 1][coluna - 1] == null) {
				tabuleiro.marcarTabuleiro(linha, coluna, marcador);
				contadorDeJogadas++;
				marcouJog = true;
			}
		}
		return marcouJog;
	}

	// Verifica se tem um vencedor
	public boolean verificarVencedorExistente(String jogador, String marcador) {
		return tabuleiro.verificarVencedor(jogador, marcador);
	}
}

