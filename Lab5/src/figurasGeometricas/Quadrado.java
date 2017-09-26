package figurasGeometricas;

public class Quadrado implements FIguraGeometrica {

	private double larguraQuadrado;

	public Quadrado(double larguraQuadrado) {
		this.larguraQuadrado = larguraQuadrado;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 2 * larguraQuadrado;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return 4 * larguraQuadrado;
	}

	public double getLarguraQuadrado() {
		return larguraQuadrado;
	}

	@Override
	public String toString() {
		return "O quadrado criado tem lados de tamanho: " + larguraQuadrado;
	}
}
