package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = scan.nextInt();
		int qtdDivisoes = 0;
		boolean ehPrimo = true;

		for (int i = 2; i < numero; i++) {

			// a condi��o ehPrimo == true garante que o la�o n�o seja executado caso encontre algum divisor entre 2 e j. 
			for (int j = 2; j < i && ehPrimo == true; j++) {
				
				if (i % j == 0) {
					ehPrimo = false;
				}
				
				qtdDivisoes++;
				
			}

			if(ehPrimo) System.out.print(i + " ");
			
			ehPrimo = true;
			
		}
	
		System.out.println("");
		System.out.println(qtdDivisoes);
		
	}

}
