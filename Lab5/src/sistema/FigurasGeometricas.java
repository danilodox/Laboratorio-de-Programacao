package sistema;

import figurasGeometricas.Circulo;
import figurasGeometricas.Quadrado;
import figurasGeometricas.Retangulo;

public class FigurasGeometricas {

	private Retangulo retangulo;
	private Quadrado quadrado;
	private Circulo circulo;

	public FigurasGeometricas(double altura, double largura, double lado, double raio) throws Exception{
			retangulo = new Retangulo(altura, largura);
			quadrado = new Quadrado(lado);
			circulo = new Circulo(raio);
	}

	//calcula a area da figura informada ou de todas. Lanca exception caso o nome da figura nao exista
	public String calculaArea(String nomeFigura) throws Exception {
		String calculaAreaEmString = "";
		
		if (nomeFigura.equalsIgnoreCase("retangulo")){
			calculaAreaEmString += "A Area deste retangulo eh: " + retangulo.calculaArea();
		}else if (nomeFigura.equalsIgnoreCase("quadrado")){
			calculaAreaEmString += "A Area deste quadrado eh: " + quadrado.calculaArea();
		}else if (nomeFigura.equalsIgnoreCase("circulo")){
			calculaAreaEmString += "A Area deste circulo eh: " + circulo.calculaArea();
		}else if (nomeFigura.equalsIgnoreCase("todas")){
			calculaAreaEmString += "Todas as areas sao: " + retangulo.calculaArea() + ", " + quadrado.calculaArea() + " e "
					+ circulo.calculaArea() + " retangulo, quadrado e circulo, respectivamente\n";
		}else{
			throw new Exception("O valor que vc forneceu não representa nenhuma figura geométrica conhecida!");
		}
		return calculaAreaEmString;
	}

	//calcula perimetro da figura informada. Lanca exception caso o nome da figura nao exista
	public String calculaPerimetro(String nomeFigura) throws Exception { 
		String calculaPerimetroEmString = "";
		if (nomeFigura.equalsIgnoreCase("retangulo")){
			calculaPerimetroEmString += "O perimetro do retangulo eh: " + retangulo.calculaPerimetro();
		}else if (nomeFigura.equalsIgnoreCase("quadrado")){
			calculaPerimetroEmString += "O perimetro do quadrado eh: " + quadrado.calculaPerimetro();
		}else if (nomeFigura.equalsIgnoreCase("circulo")){
			calculaPerimetroEmString += "O perimetro do circulo eh: " + circulo.calculaPerimetro();	
		}else{
			throw new Exception("O valor que vc forneceu não representa nenhuma figura geométrica conhecida!");
		}
		return calculaPerimetroEmString;
	}
	
	//exibe informacoes sobre a figura requerida. Lanca exception caso o nome da figura nao exista
	public String exibeInformacoeFiguras(String nomeFigura) throws Exception{
		if (nomeFigura.equalsIgnoreCase("retangulo")){
			return retangulo.toString();
		}else if (nomeFigura.equalsIgnoreCase("quadrado")){
			return quadrado.toString();
		}else if (nomeFigura.equalsIgnoreCase("circulo")){
			return circulo.toString();
		}else if (nomeFigura.equalsIgnoreCase("todas")){
			return toString();
		}else{
			throw new Exception("O valor que vc forneceu não representa nenhuma figura geométrica conhecida!");
		}
	}

	@Override
	public String toString() {
		return retangulo.toString() + "\n" + quadrado.toString() + "\n" + circulo.toString();
	}

}