package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aluguel.Aluguel;
import cliente.Cliente;
import fita.Fita;

public class ClienteTest {
	Cliente cliente;
	Aluguel aluguel;
	
	@Before
	public void criaCliente() {
		cliente = new Cliente("Danilo");
		cliente.adiconaAluguel("Ate o ultimo soldado", "NORMAL", 50);
		
		Fita fita = new Fita("O chamado", "NORMAL");
		aluguel = new Aluguel(fita, 90);
	}
	
	@Test
	public void testAdiconaAluguel() {
		
		assertTrue(cliente.adiconaAluguel("Vida", "NORMAL", 6));
		assertFalse(cliente.verificaAluguel("O chamado"));
		cliente.adiconaAluguel(aluguel.getFita().getTitulo(), aluguel.getFita().getTipoDeFita(), aluguel.getDiasALugada());
		assertTrue(cliente.verificaAluguel("Vida"));
	}

	@Test
	public void testGetTotalPontosDeAlugadorFrequente() {
		assertEquals(1, cliente.getTotalPontosDeAlugadorFrequente());
	}

	@Test
	public void testGetValorTotal() {
		assertEquals(74, cliente.getValorTotal(), 0);
	}

	@Test
	public void testToString() {
		assertEquals("Registro de Alugueis de Danilo\n"
				+    "\tAte o ultimo soldado\t74.0\n"
				+ 	 "Valor total devido: 74.0\n"
				+	 "Voce acumulou 1 pontos de alugador frequente\n", cliente.toString());
	}

}