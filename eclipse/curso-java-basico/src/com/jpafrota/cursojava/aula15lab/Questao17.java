package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um ano do calend�rio: ");
		double ano = scan.nextDouble();
		
		if(ano % 4 == 0) {
			
			if(ano % 100 != 0) System.out.print("O ano informado � bissexto!");
			
			else {
				if(ano % 400 == 0) System.out.print("O ano informado � bissexto!");
				else System.out.print("O ano informado n�o � bissexto!");
			}
			
		}
		
		else System.out.print("O ano informado n�o � bissexto!");
		
	}
}
