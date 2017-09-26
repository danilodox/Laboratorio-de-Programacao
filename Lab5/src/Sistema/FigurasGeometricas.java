package Sistema;

import figurasGeometricas.Circulo;
import figurasGeometricas.Quadrado;
import figurasGeometricas.Retangulo;

public class FigurasGeometricas {

	private Retangulo retangulo;
	private Quadrado quadrado;
	private Circulo circulo;

	public FigurasGeometricas(double altura, double largura, double lado, double raio) {
		retangulo = new Retangulo(altura, largura);
		quadrado = new Quadrado(lado);
		circulo = new Circulo(raio);
	}

	public String calculaArea() {
		String calculaAreaEmString = "";
		calculaAreaEmString += "A �rea deste retangulo �: " + retangulo.calculaArea() + "\n";
		calculaAreaEmString += "A �rea deste quadrado �: " + quadrado.calculaArea() + "\n";
		calculaAreaEmString += "A �rea deste c�rculo �: " + circulo.calculaArea() + "\n";

		return calculaAreaEmString;
	}

	public String calculaPerimetro() {
		String calculaPerimetroEmString = "";
		calculaPerimetroEmString += "O per�metro do ret�ngulo �: " + retangulo.calculaPerimetro() + "\n";
		calculaPerimetroEmString += "O per�metro do c�rculo �: " + circulo.calculaPerimetro() + "\n";
		calculaPerimetroEmString += "O per�metro do quadrado �: " + quadrado.calculaPerimetro() + "\n";

		return calculaPerimetroEmString;
	}

	public String calculaTodasAsAreas() {
		return "Todas as �reas s�o: " + retangulo.calculaArea() + " " + quadrado.calculaArea() + " e "
				+ circulo.calculaArea() + " ret�ngulo, quadrado e c�rculo, respectivamente\n";
	}

	@Override
	public String toString() {
		return "" + circulo.toString() + "\n" + quadrado.toString() + "\n" + retangulo.toString();
	}

}