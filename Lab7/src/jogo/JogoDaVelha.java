package jogo;

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
	
	public String exibirTabuleiro(){
		return tabuleiro.toString();
	}

	//Marca o tabuleiro com as jogadas de cada jogador
	public boolean marcarJogadas(int linha, int coluna, String marcador){
		boolean marcouJog = false;
		if ((linha >= 1 && linha <= 3) && (coluna >= 1 && coluna <= 3)){
			if (tabuleiro.getPosicoes()[linha - 1][coluna - 1] == null){
				tabuleiro.marcarTabuleiro(linha, coluna, marcador);
				contadorDeJogadas++;
				return marcouJog = true;
			}
		}
		
		return marcouJog;
	}
	
	// Verifica se tem um vencedor
	public boolean verificarVencedorExistente(String jogador){
		return tabuleiro.verificarVencedor(jogador);
	}
}
