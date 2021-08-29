package com.jpafrota.cursojava.aula41;

public class Teste {

	public static void imprimirEndereco(Pessoa pessoa) {

		// A implementação do método "testeAbstração" pode esclarecer melhor.
		pessoa.testeAbstracao();

	}

	public static void main(String[] args) {

		// Classes abstratas não podem ser instanciadas.
		// Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		imprimirEndereco(aluno);
		aluno.setEndereco("Rua E");
		professor.setEndereco("Rua A");

		// Métodos e atributos da superclasse abstrata podem ser usados por suas subclasses normalmente.
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());

	}

}
