package com.jpafrota.cursojava.aula41;

public class Teste {

	public static void imprimirEndereco(Pessoa pessoa) {

		// A implementa��o do m�todo "testeAbstra��o" pode esclarecer melhor.
		pessoa.testeAbstracao();

	}

	public static void main(String[] args) {

		// Classes abstratas n�o podem ser instanciadas.
		// Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		imprimirEndereco(aluno);
		aluno.setEndereco("Rua E");
		professor.setEndereco("Rua A");
		
		// o c�digo abaixo n�o funciona pois como j� foi visto, ao instanciar um aluno de um TIPO diferente,
		// n�o obtemos acesso aos m�todos daquela classe. somente os m�todos referentes ao tipo declarado, que � Pessoa.
		// aluno.funcaoQualquer();

		// M�todos e atributos da superclasse abstrata podem ser usados por suas subclasses normalmente.
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());

	}

}
