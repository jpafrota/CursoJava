//QUEST�O 07: Fa�a um programa que calcule a �rea de um quadrado, em seguida mostre
//o dobro dessa �rea para o usu�rio.

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double area = lado * lado;
		
		System.out.println("�rea do quadrado: " + area + " m�");
		System.out.println("Dobro da �rea: " + area*2);
		
	}
	
}
