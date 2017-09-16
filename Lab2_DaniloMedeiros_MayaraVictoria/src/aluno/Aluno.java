package aluno;

public class Aluno {

	private String nome;
	private float nota1, nota2, media, notaFinal;
	private int frequencia;
	
	public Aluno(){}
	
	public Aluno(String nome, float nota1, float nota2, float notaFinal, int frequencia) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaFinal = notaFinal;
		this.frequencia = frequencia;
		this.media = (nota1 + nota2) / 2;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float getMedia() {
		return media;
	}
	
	public float getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	public int getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
}
