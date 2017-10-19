package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sistema.Sistema;

public class SistemaTest {

	Sistema sistema;

	@Before
	public void setUp() throws Exception {
		sistema = new Sistema();
	}

	@Test
	public void testValidaTagTrue() {
		assertTrue(sistema.validaTag("<body> <center> <h1> the liisss c </h1> </center> <p> the as das saldasdad ada a"
				+ "sdadsadald ksamdmadsas sk bundinhas de coco nutes  sadada morgango com iurutge"
				+ "t sun sadi saas goiaba. </p> <ol> <li> sau dsadas dasd ? </li> <li> sau dsadas"
				+ " dasd ? </li> <li> sau dsadas dasd ? </li> </ol> </body>"));

		assertTrue(sistema.validaTag("<body> aaaaaa <center> aaaa </center> aaaa </body>"));
		assertTrue(sistema.validaTag("<body> oi </body>"));
	}
	
	@Test
	public void testValidaTagFalse() {
		assertFalse(sistema.validaTag("<body> oi </body"));
		assertFalse(sistema.validaTag("<body>"));
		assertFalse("nao tem tag de abertura do h1",sistema.validaTag("<body> <center>  the liisss c </h1> </center> <p> the as das saldasdad ada a\"\r\n" + 
				"				+ \"sdadsadald ksamdmadsas sk bundinhas de coco nutes  sadada morgango com iurutge\"\r\n" + 
				"				+ \"t sun sadi saas goiaba. </p> <ol> <li> sau dsadas dasd ? </li> <li> sau dsadas\"\r\n" + 
				"				+ \" dasd ? </li> <li> sau dsadas dasd ? </li> </ol> </body>"));
		
		
	}

}
