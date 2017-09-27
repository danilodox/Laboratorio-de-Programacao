package figurasGeometricas;

public class Retangulo implements FiguraGeometrica {
	private double largura;
	private double altura;

	/*lanca exception caso o valor da altura e/ou largura seja menor ou igual a 0
	ou a quando altura e largura sao iguais*/
	public Retangulo(double altura, double largura) throws Exception{
		if ((largura <= 0 || altura <= 0) || altura == largura){
			throw new Exception("Valores invalidos para o retangulo!");
		}else{
			this.largura = largura;
			this.altura = altura;
		}

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
		return "O retangulo criado tem altura de tamanho: " + altura + " e largura de: " + largura;
	}
}
