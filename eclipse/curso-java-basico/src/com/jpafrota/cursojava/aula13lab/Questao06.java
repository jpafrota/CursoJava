//QUEST�O 06: Fa�a um programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio (em metros): ");
		double raio = scan.nextDouble();
		
		System.out.print("O valor da �rea �: " + 3.14 * (raio * raio) + "m�");
		
		
	}

}
