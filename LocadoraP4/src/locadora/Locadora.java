package locadora;

import cliente.Cliente;

public class Locadora {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Juliana");
		
		c1.adicionaAluguel("O Exorcista", "NORMAL", 3);
		c1.adicionaAluguel("Men in Black", "NORMAL", 2);
		c1.adicionaAluguel("Jurassic Park III", "LANCAMENTO", 3);
		c1.adicionaAluguel("Planeta dos Macacos", "LANCAMENTO", 4);
		c1.adicionaAluguel("Pateta no Planeta dos Macados", "INFANTIL", 10);
		c1.adicionaAluguel("O Rei Leao", "INFANTIL", 30);
		
		
		System.out.println(c1.toString());
		
		
	}
}
