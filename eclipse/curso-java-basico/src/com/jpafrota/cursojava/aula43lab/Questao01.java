package com.jpafrota.cursojava.aula43lab;

public class Questao01 {

	public static void main(String[] args) {

		ContaEspecial conta1 = new ContaEspecial("Jorge", "466220", 1500, 500);
		ContaPoupanca conta2 = new ContaPoupanca("Maycon", "713987", 200, 25);
		ContaBancaria conta3 = new ContaBancaria("Serafina", "77828", 1200);
		
		conta1.depositar(1000);
		
		System.out.println(conta1.toString());
		System.out.println(conta2.toString());
		System.out.println(conta3.toString());
		
	}

}
