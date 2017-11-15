package manipuladordearquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class ManipuladorArquivo {
	
	
	public static String importaTexto(String nomeArquivo) {

		FileReader arq = null;
		BufferedReader lerArquivo = null;
		String linha = null;
		String retorno = "";
		try {
			arq = new FileReader(nomeArquivo);
			lerArquivo = new BufferedReader(arq);
			while ((linha = lerArquivo.readLine()) != null) {
				retorno += linha + ", ";
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (lerArquivo != null) {
				try {
					lerArquivo.close();
				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		}
		return retorno;
	}


}
