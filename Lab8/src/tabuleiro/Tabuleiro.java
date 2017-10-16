package tabuleiro;


public class Tabuleiro {

	private String[][] posicoes;

	public Tabuleiro() {
		this.posicoes = new String[3][3];
	}

	public String[][] getPosicoes() {
		return posicoes;
	}

	// Marca o tabuleiro com as jogadas dos jogadores
	public void marcarTabuleiro(int linha, int coluna, String marcador) {
		for (int i = 0; i < posicoes.length; i++) {
			for (int j = 0; j < posicoes.length; j++) {
				if ((i == linha - 1) && (j == coluna - 1)) {
					posicoes[i][j] = marcador;
				}
			}
		}

	}

	// Verifica se tem um vencedor a cada jogada
	public boolean verificarVencedor(String jogador, String marcador) {
		boolean resposta = false;
		if ((posicoes[0][0] == marcador && posicoes[0][1] == marcador && posicoes[0][2] == marcador)
				|| (posicoes[1][0] == marcador && posicoes[1][1] == marcador && posicoes[1][2] == marcador)
				|| (posicoes[2][0] == marcador && posicoes[2][1] == marcador && posicoes[2][2] == marcador)
				|| (posicoes[0][0] == marcador && posicoes[1][1] == marcador && posicoes[2][2] == marcador)
				|| (posicoes[0][2] == marcador && posicoes[1][1] == marcador && posicoes[2][0] == marcador)
				|| (posicoes[0][0] == marcador && posicoes[1][0] == marcador && posicoes[2][0] == marcador)
				|| (posicoes[0][1] == marcador && posicoes[1][1] == marcador && posicoes[2][1] == marcador)
				|| (posicoes[0][2] == marcador && posicoes[1][2] == marcador && posicoes[2][2] == marcador)) {
			if ((marcador.equalsIgnoreCase("X")
					&& ((jogador.equalsIgnoreCase("Jogador 1") || jogador.equalsIgnoreCase("Computador"))))) {
				resposta = true;
			}
			if ((marcador.equalsIgnoreCase("O") && (jogador.equalsIgnoreCase("Jogador 2")))) {
				resposta = true;
			}
		}
		return resposta;
	}

	
	@Override
	public String toString() {
		String tabuleiro = "";
		for (int i = 0; i < posicoes.length; i++) {
			for (int j = 0; j < posicoes.length; j++) {
				if (posicoes[i][j] == null) {
					tabuleiro += "|   |";
				} else {
					tabuleiro += "| " + posicoes[i][j] + " |";
				}
			}
			tabuleiro += "\n";
		}
		return tabuleiro;
	}
}
