package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sistema.Sistema;

class SistemaTest {
	
Sistema sistema;
String message;

	@BeforeEach
	void setUp() throws Exception {
		sistema = new Sistema();
		message = "<h2> HTML <small> Small </small> Formatting </h2>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<title> Page Title </title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h1> My First Heading </h1>\r\n" + 
				"<p> My first paragraph. </p>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"<h2> HTML <mark> Marked </mark> Formatting </h2>\r\n"; 
				
	}
	
	
	@Test
	void testVerificarTags() {
		sistema.separarTexto(message);
		assertTrue(sistema.verificarTags());
	}
	
	@Test
	void testVerificarTagsFalse() {
		assertFalse(sistema.verificarTags());
	}

}
