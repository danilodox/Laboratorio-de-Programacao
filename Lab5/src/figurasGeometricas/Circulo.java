package figurasGeometricas;

public class Circulo implements FIguraGeometrica {
	private double raioCirculo;

	public Circulo(double raioCirculo) {
		this.raioCirculo = raioCirculo;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * raioCirculo;
	}

	@Override
	public double calculaPerimetro() {
		// TODO Auto-generated method stub
		return 3.14 * raioCirculo;
	}

	public double getRaioCirculo() {
		return raioCirculo;
	}

	@Override
	public String toString() {
		return "O circulo criado tem raio de tamanho: " + raioCirculo;

	}
}
