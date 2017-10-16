package main;

import sistema.Sistema;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Sistema sistema = new Sistema();
		
		sistema.criaFuncionario("Danilo", "Ator Diretor");
		sistema.criaFuncionario("Aline", "Roteirista");
		sistema.criaFuncionario("Fiora", "Cinegrafista");
		sistema.criaFuncionario("Arthur", "Ator");
		sistema.criaFuncionario("Cesar", "Ator");
		sistema.criaFuncionario("Jessica", "Ator");
		
		
		
		sistema.criarFilme("Primavera", 2018, "Danilo", "Aline", "Danilo Arthur Cesar Jessica", "Fiora");
		
		//System.out.println(sistema.getFilmografia("Danilo"));
		
		//se colocar uma funcao que nao pertence ao funcionario, vai dar null point error
		System.out.println(sistema.getFilmografiaPorFuncao("Aline", "Roteirista"));
	}

}
