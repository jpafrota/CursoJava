package com.jpafrota.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		
		aluno1.setCursos("Ci�ncia da Computa��o");
		
		double[] notas = {10, 9, 8, 7};
		
		aluno1.setNotas(notas);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCursos("Ci�ncia da Computa��o");
		
		double[] notas2 = {10, 9, 8, 7};
		
		aluno2.setNotas(notas2);
		
		// Tanto aluno1 == aluno2 e aluno1.equals(aluno2); dar�o o mesmo resultado.
		// Mesmo que aluno1 e aluno2 sejam iguais em seus atributos
		// Isso porque, por default, Java compara apenas a refer�ncia dos objetos
		// Ou seja, s� daria true se fosse o mesmo endere�o de mem�ria
		// O m�todo "equals" funciona do mesmo jeito, quando herdado da classe OBJECT
		// Mas � poss�vel sobrescrever esse m�todo dentro da classe aluno
		System.out.println(aluno1 == aluno2);
		System.out.println(aluno1.equals(aluno2));
		
		// No exemplo abaixo � poss�vel ver em pr�tica a sobrescrita do m�todo equals
		// A classe String sobrescreve esse m�todo por padr�o, comparando o conte�do das vari�veis ao inv�s do endere�o de mem�ria.
		String testando = "dasdasd";
		String testeee = "dasdasd";
		
		System.out.println(testando.equals(testeee));
		
	}

}
