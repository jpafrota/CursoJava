package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		if(media >= 10) {
			System.out.println("Parabéns! você passou com distinãoo! " + media);
		} else if(media >= 7) {
			System.out.println("você foi aprovado! " + media);
		} else {
			System.out.println("você está reprovado. Se esforce mais. " + media);
		}
		
	}
}
