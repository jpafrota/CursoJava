package com.jpafrota.cursojava.aula34;

public class TesteCalculadora {

	public static void main(String[] args) {

		// MODIFICADORES STATIC N�O PRECISAM DE UMA INST�NCIA DA CLASSE
		// PARA SEREM ACESSADOS. VALE PARA M�TODOS E VARI�VEIS!
		// NESSE EXEMPLO A CLASSE MINHA CALCULADORA N�O FOI INSTANCIADA E POSSUI
		// TR�S M�TODOS EST�TICOS.
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		//calc.soma(1, 2);
		
		MinhaCalculadora.soma(1, 2);
		
	}

}
