//QUEST�O 08: Fa�a um programa que pergunte quanto voc� ganha por hora e o 
//n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio
//no referido m�s

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� recebe por hora de trabalho?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou esse m�s?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("Seu sal�rio esse m�s ser� de: R$" + salario + " reais");
		
	}

}
