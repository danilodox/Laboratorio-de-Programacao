package figurasGeometricas;

public class Retangulo implements FIguraGeometrica {
	private double largura;
	private double altura;

	public Retangulo(double altura, double largura) {
		this.largura = largura;
		this.altura = altura;

	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return altura * largura;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		double perimetro;
		perimetro = ((2 * altura) + (2 * largura));
		return perimetro;
	}

	public double getLargura() {
		return largura;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "O retângulo criado tem altura de tamanho: " + altura + " e largura de: " + largura;
	}
}
