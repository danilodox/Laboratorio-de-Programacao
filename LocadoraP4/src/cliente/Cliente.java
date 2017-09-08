package cliente;

import java.util.ArrayList;
import aluguel.Aluguel;
import fita.Fita;

public class Cliente {
	private String nome;

	private ArrayList<Aluguel> listaDeAlugueis;
	
	public Cliente(String nome) {
		this.nome = nome;
		listaDeAlugueis = new ArrayList<>();
	}
	
	
	public boolean adiconaAluguel(String titulo, String tipoDeFita, int diasAlugados) {
		Fita fita = new Fita(titulo, tipoDeFita);
		
		Aluguel aluguel = new Aluguel(fita, diasAlugados);
		
		aluguel.calculaExtrato(fita.getTipoDeFita());
		return listaDeAlugueis.add(aluguel);
	}
	
	public boolean verificaAluguel(String titulo) {
		for (int i = 0; i < listaDeAlugueis.size(); i++) {
			if (listaDeAlugueis.get(i).getFita().getTitulo().equals(titulo)) {
				return true;
			}
		}
		return false;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getTotalPontosDeAlugadorFrequente() {
		int pontosDeALugadorFrequenta = 0;
		for (int i = 0; i < listaDeAlugueis.size(); i++) {
			
			pontosDeALugadorFrequenta += listaDeAlugueis.get(i).getPontosDeAlugadorFrequenta();
			
		}
		return pontosDeALugadorFrequenta;
	}
	
	public double getValorTotal() {
		double valorTotal = 0.0;
		
		for (int i = 0; i < listaDeAlugueis.size(); i++) {
			valorTotal += listaDeAlugueis.get(i).getValorTotal();
		}
		
		return valorTotal;
	}
	
	
	
	public String toString() {
		String clienteEmString = "";
		
		
		
		clienteEmString += "Registro de Alugueis de " + getNome() + "\n";
		
		for (Aluguel listaDeAluguel : listaDeAlugueis) {
			clienteEmString += listaDeAluguel.toString();
		}
		
		clienteEmString += "Valor total devido: " + getValorTotal() + "\n";
		clienteEmString += "Voce acumulou " + getTotalPontosDeAlugadorFrequente() + " pontos de alugador frequente\n";
		
		return clienteEmString;
	
	}
			
}
