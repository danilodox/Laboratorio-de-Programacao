package main;

import java.util.Scanner;

import jogo.JogoDaVelha;

public class Main {
	private static Scanner scan = new Scanner(System.in);

	private static int linha = 0;
	private static int coluna = 0;
	private static boolean resposta = false;
	private static String campeao = "Nenhum";
	private static JogoDaVelha jogo = new JogoDaVelha();

	public static void main(String[] args) {
		System.out.println(jogo.exibirTabuleiro());

		while (resposta == false) {

			// Jogadas do Jogador 1 que sejam validas
			resposta = verificaJogadaValida(resposta, linha, coluna, jogo,
					"Jogador 1 (X) - Digite a linha e a coluna do tabuleiro que deseja marcar: ", "X");
			System.out.println(jogo.exibirTabuleiro());

			if (verificaJogadorVenceu(jogo, "Jogador 1") == true) { // Verificando se Jogador 1 venceu
				break;
			}

			// Jogadas do Jogador 2 que sejam validas
			resposta = verificaJogadaValida(resposta, linha, coluna, jogo,
					"Jogador 2 (O) - Digite a linha e a coluna do tabuleiro que deseja marcar: ", "O");

			System.out.println(jogo.exibirTabuleiro());

			if (verificaJogadorVenceu(jogo, "Jogador 2") == true) { // Verificando se Jogador 2 venceu
				break;
			}
		} // fim do while

		// Saida para o caso de ninguem ganhar
		if (campeao.equalsIgnoreCase("Nenhum")) {
			System.out.println("Ninguem venceu a partida.");
		}
		scan.close();
	}

	private static boolean verificaJogadorVenceu(JogoDaVelha jogo, String jogador) {

		if (jogo.getContadorDeJogadas() >= 5) {
			if (jogo.verificarVencedorExistente(jogador)) {
				campeao = jogador;
				System.out.println("O vencedor da partida eh o " + campeao + ". Parabens!");
				resposta = true;
			}
		}
		if (jogo.getContadorDeJogadas() >= 9) { // Condicao de parada: nivel maximo de jogadas
			resposta = true;
		}
		return resposta;

	}

	private static boolean verificaJogadaValida(boolean resposta, int linha, int coluna, JogoDaVelha jogo,
			String message, String marcacao) {
		// marcacao se eh "X" ou "O"
		do {
			resposta = false;
			System.out.println(message);
			linha = scan.nextInt();
			coluna = scan.nextInt();

			if (jogo.marcarJogadas(linha, coluna, marcacao) == false) {
				System.err.println("Jogada invalida");
				resposta = true;
			}

		} while (resposta);
		return resposta;
	}

}
