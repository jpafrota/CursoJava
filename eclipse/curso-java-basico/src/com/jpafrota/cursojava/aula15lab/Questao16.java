package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		double a = scan.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		double b = scan.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		double c = scan.nextDouble();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta == 0) {
			System.out.println("A equa��o possui duas ra�zes iguais.");
			System.out.println("x1: " + (-b/(2*a)) );
			System.out.println("x2: " + (-b/(2*a)) );
		}
		
		else if (delta < 0) {
			System.out.println("A equa��o n�o possui ra�zes reais.");
		}
		
		else {
			double x1 = ( -b + Math.sqrt(delta) ) / (2 * a);
			double x2 = ( -b - Math.sqrt(delta) ) / (2 * a);
			System.out.println("A equa��o possui duas ra�zes reais.");
			System.out.println("x1: " + x1);
			System.out.println("x2: " + x2);
		}
		
	}
}
