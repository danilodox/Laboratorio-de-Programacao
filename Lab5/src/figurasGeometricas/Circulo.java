package figurasGeometricas;

public class Circulo implements FiguraGeometrica {
	private double raioCirculo;

	//lanca exception caso o valor do raio seja menor ou igual a 0
	public Circulo(double raioCirculo) throws Exception{
		if (raioCirculo <= 0){
			throw new Exception("Valor do raio do circulo invalido!");
		}else{
			this.raioCirculo = raioCirculo;
		}
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
