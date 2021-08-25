package com.jpafrota.cursojava.aula43lab;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		ContaBancaria contaSimples = new ContaBancaria("Serafina", "77828", 1200);
		ContaEspecial contaEspecial = new ContaEspecial("Jorge", "466220", 1500, 500);
		ContaPoupanca contaPoupanca = new ContaPoupanca("Maycon", "713987", 200, 25);
		
		System.out.println(contaSimples.toString());
		System.out.println(contaPoupanca.toString());
		System.out.println(contaEspecial.toString());

		realizarSaque(contaEspecial, 1600);
		realizarSaque(contaEspecial, 200);
		
	}
	
	public static void realizarSaque(ContaBancaria conta, double valor) {
		
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Valor do saque: R$" + valor);

		} else {
			System.out.println("Saque não realizado. Saldo Insuficiente.");
			System.out.println("Tentativa de saque: R$" + valor);
		}
		conta.mostrarSaldo();
		System.out.println();
	}

}
