package aluguel;

import fita.Fita;

public class Aluguel {
	private Fita fita;
	private int diasAlugada;
	private int pontosDeAlugadorFrequenta;
	private double valorCorrente = 0.0;
	private double valorTotal = 0.0;

	public Aluguel(Fita fita, int diasAlugados) {
		
		this.fita = fita;
		this.diasAlugada = diasAlugados;

	}

	public Fita getFita() {
		return fita;
	}

	public int getDiasALugada() {
		return diasAlugada;
		

	}

	public double getValorTotal() {
		return valorTotal;
	}

	public int getPontosDeAlugadorFrequenta() {
		return pontosDeAlugadorFrequenta;
	}

	public void calculaExtrato(String tipoDeFita) {
		switch (tipoDeFita.toLowerCase()) {

		case ("normal"):
			valorCorrente = 2.0;
			if (getDiasALugada() > 2) {

				valorCorrente += (getDiasALugada() - 2.0) * 1.5;
			}
			break;

		case ("lancamento"):

			valorCorrente += getDiasALugada() * 3;

			if (getDiasALugada() > 1) {
				pontosDeAlugadorFrequenta++;
			}
			break;

		case ("infantil"):

			valorCorrente += 1.5;

			if (getDiasALugada() > 3) {
				valorCorrente += (getDiasALugada() - 3) * 1.5;
			}
			break;
		default :
			System.out.println("OPÇÃO INVÁLIDA!!!");
			
		}// FIM DO SWITCH
			// TRATA DE PONTOS DE ALUADOR FREQUENTE
		pontosDeAlugadorFrequenta++;
		valorTotal += valorCorrente;
	}

	public String toString() {
		String aluguelEmString = "";

		aluguelEmString += fita.toString() + "\t" + valorCorrente + "\n";

		return aluguelEmString;
	}

}
