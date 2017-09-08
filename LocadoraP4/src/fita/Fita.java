package fita;

public class Fita {
	
	private String titulo;
	private TipoDeFita tipoDeFita;
	
	public Fita(String titulo, String tipoDeFita) {
		this.titulo = titulo;
		this.tipoDeFita = TipoDeFita.valueOf(tipoDeFita);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	
	public String getTipoDeFita() {
		return tipoDeFita.toString();
	}


	@Override
	public String toString() {
		return "\t" + titulo;
	}
	
	
	
	
	
	
}