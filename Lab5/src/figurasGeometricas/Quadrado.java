package figurasGeometricas;

public class Quadrado implements FiguraGeometrica {

	private double larguraQuadrado;

	//lanca exception caso o valor do lado seja menor ou igual a 0
	public Quadrado(double larguraQuadrado) throws Exception {
		if (larguraQuadrado <= 0){
			throw new Exception("Valor do lado do quadrado invalido!");
		}else{
			this.larguraQuadrado = larguraQuadrado;
		}
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return Math.pow(larguraQuadrado, 2);
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
