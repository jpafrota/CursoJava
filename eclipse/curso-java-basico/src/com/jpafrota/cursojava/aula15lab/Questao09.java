package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int valor1 = scan.nextInt();
		
		int maior = valor1;
		int menor = valor1;
		
		System.out.print("Digite o segundo n�mero: ");
		int valor2 = scan.nextInt();
		
		if(valor2 < menor) menor = valor2;
		else maior = valor2;

		System.out.print("Digite o terceiro n�mero: ");
		int valor3 = scan.nextInt();
		
		int medio;
		
		if(valor3 < menor) {
			medio = menor;
			menor = valor3;
		}
		else if(valor3 > maior) {
			medio = maior;
			maior = valor3;
		}
		else {
			medio = valor3;
		}
		
		System.out.println("Valores em ordem decrescente: ");
		System.out.println(maior);
		System.out.println(medio);
		System.out.println(menor);
	}
}
