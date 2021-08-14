package com.jpafrota.cursojava.aula34lab;

public class Questao01 {

	public static void imprimir() {
		System.out.println(Contador.retornar());
	}
	
	public static void main(String[] args) {

		Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		Contador cont3 = new Contador();
		Contador cont4 = new Contador();
		
		imprimir();
		
		Contador.incrementar();
		Contador.zerar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimir();
		
	}

}
