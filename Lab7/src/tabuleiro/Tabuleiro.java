package tabuleiro;

public class Tabuleiro {
	
	private String[][] posicoes;
	
	public Tabuleiro() {
		this.posicoes = new String[3][3];		
	}
	
	public String[][] getPosicoes() {
		return posicoes;
	}
	
	//Marca o tabuleiro com as jogadas dos jogadores
	public void marcarTabuleiro(int linha, int coluna, String marcador){
		for (int i = 0; i < posicoes.length; i++){
			for (int j = 0; j < posicoes.length; j++){
				if ((i == linha - 1) && (j == coluna - 1)){
					posicoes[i][j] = marcador;
				}
			}
		}
		
	}
	
	// Verifica se tem um vencedor a cada jogada
	public boolean verificarVencedor(String jogador){
		boolean resposta = false;
		if (jogador.equalsIgnoreCase("Jogador 1")){
			if ((posicoes[0][0] == "X" && posicoes[0][1] == "X" && posicoes[0][2] == "X") 
				|| (posicoes[1][0] == "X" && posicoes[1][1] == "X" && posicoes[1][2] == "X")
				|| (posicoes[2][0] == "X" && posicoes[2][1] == "X" && posicoes[2][2] == "X")
				|| (posicoes[0][0] == "X" && posicoes[1][1] == "X" && posicoes[2][2] == "X")
				|| (posicoes[0][2] == "X" && posicoes[1][1] == "X" && posicoes[2][0] == "X")
				|| (posicoes[0][0] == "X" && posicoes[1][0] == "X" && posicoes[2][0] == "X")
				|| (posicoes[0][1] == "X" && posicoes[1][1] == "X" && posicoes[2][1] == "X")
				|| (posicoes[0][2] == "X" && posicoes[1][2] == "X" && posicoes[2][2] == "X")){
				resposta = true;
			}
			
				
		}else{
			if ((posicoes[0][0] == "O" && posicoes[0][1] == "O" && posicoes[0][2] == "O") 
				|| (posicoes[1][0] == "O" && posicoes[1][1] == "O" && posicoes[1][2] == "O")
				|| (posicoes[2][0] == "O" && posicoes[2][1] == "O" && posicoes[2][2] == "O")
				|| (posicoes[0][0] == "O" && posicoes[1][1] == "O" && posicoes[2][2] == "O")
				|| (posicoes[0][2] == "O" && posicoes[1][1] == "O" && posicoes[2][0] == "O")
				|| (posicoes[0][0] == "O" && posicoes[1][0] == "O" && posicoes[2][0] == "O")
				|| (posicoes[0][1] == "O" && posicoes[1][1] == "O" && posicoes[2][1] == "O")
				|| (posicoes[0][2] == "O" && posicoes[1][2] == "O" && posicoes[2][2] == "O")){
				resposta = true;
			}
		}
			
		return resposta;
	}

	@Override
	public String toString() {
		String tabuleiro = "";
		for (int i = 0; i < posicoes.length; i++){
			for (int j = 0; j < posicoes.length; j++){
				if (posicoes[i][j] == null){
					tabuleiro += "|   |";
				}else{
					tabuleiro += "| " + posicoes[i][j] + " |";
				}
			}
			tabuleiro += "\n";
		}
		return tabuleiro;		
	}
	
}
