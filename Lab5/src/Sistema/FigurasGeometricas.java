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
		calculaAreaEmString += "A área deste retangulo é: " + retangulo.calculaArea() + "\n";
		calculaAreaEmString += "A área deste quadrado é: " + quadrado.calculaArea() + "\n";
		calculaAreaEmString += "A área deste círculo é: " + circulo.calculaArea() + "\n";

		return calculaAreaEmString;
	}

	public String calculaPerimetro() {
		String calculaPerimetroEmString = "";
		calculaPerimetroEmString += "O perímetro do retângulo é: " + retangulo.calculaPerimetro() + "\n";
		calculaPerimetroEmString += "O perímetro do círculo é: " + circulo.calculaPerimetro() + "\n";
		calculaPerimetroEmString += "O perímetro do quadrado é: " + quadrado.calculaPerimetro() + "\n";

		return calculaPerimetroEmString;
	}

	public String calculaTodasAsAreas() {
		return "Todas as áreas são: " + retangulo.calculaArea() + " " + quadrado.calculaArea() + " e "
				+ circulo.calculaArea() + " retângulo, quadrado e círculo, respectivamente\n";
	}

	@Override
	public String toString() {
		return "" + circulo.toString() + "\n" + quadrado.toString() + "\n" + retangulo.toString();
	}

}