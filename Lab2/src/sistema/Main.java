package sistema;

import aluno.Aluno;

public class Main {

	public static void main(String[] args) {
		
		AlunoDAO aluno = new AlunoDAO();
	
		aluno.inserir(new Aluno("Maria", 70, 70, 0, 80));
		aluno.inserir(new Aluno("Joao", 50, 50, 40, 85));
		aluno.inserir(new Aluno("Joao", 50, 50, 40, 85));
		aluno.remover(new Aluno("Joao", 50, 50, 40, 85));
		
		for (int i = 0; i < aluno.caderneta.getAlunos().size(); i++) {
			System.out.println(aluno.caderneta.getAlunos().get(i).getNome());
		}
		
		aluno.atualizar(new Aluno("Maria", 70, 70, 0, 80), new Aluno("Maria Martins", 80, 70, 0, 80));
		aluno.inserir(new Aluno("Maria", 70, 70, 0, 80));
		aluno.inserir(new Aluno("Maria", 70, 70, 0, 80));
		
		for (int i = 0; i < aluno.caderneta.getAlunos().size(); i++) {
			System.out.println(aluno.caderneta.getAlunos().get(i).getNome());
		}
		
		System.out.println(aluno.listarAlunos());
		
		System.out.println(aluno.procuraAluno("Maria"));
		System.out.println(aluno.procuraAluno("Joao"));
		
		aluno.inserir(new Aluno("Joao", 50, 50, 40, 85));
		
		System.out.println(aluno.caderneta.verificaAprovacao("Maria"));
		System.out.println(aluno.caderneta.verificaAprovacao("João"));
	
	}

}