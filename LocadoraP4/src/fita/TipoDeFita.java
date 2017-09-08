package fita;

public enum TipoDeFita {
	NORMAL("normal"), INFANTIL("infantil"), LANCAMENTO("lancamento");
	
	private final String tipoDeFita;
	
	TipoDeFita(String tipoDeFita){
		this.tipoDeFita = tipoDeFita;
	}
	
	public String getTipoDeFita() {
		return tipoDeFita;
	}
}
