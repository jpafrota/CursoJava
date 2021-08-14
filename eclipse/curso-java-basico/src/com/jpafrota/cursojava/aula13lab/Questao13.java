//QUEST�O 15: Fa�a um Programa que pergunte quanto voc� ganha por hora e o 
//n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu 
//sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o 
//Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um 
//programa que nos d�:
//a. sal�rio bruto.
//b. quanto pagou ao INSS.
//c. quanto pagou ao sindicato.
//d. o sal�rio l�quido.
//e. calcule os descontos e o sal�rio l�quido, conforme a tabela 
//abaixo:
//+ Sal�rio Bruto : R$ - IR (11%) : R$ - INSS 
//(8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio
//Liquido : R$
//Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� recebe por hora de trabalho?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou esse m�s?");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = valorHora * horasTrabalhadas;
				
		double ir = (11d/100d) * salarioBruto;
		double inss = (8d/100d) * salarioBruto;
		double sindicato = (5d/100d) * salarioBruto;
		double descontos = ir + inss + sindicato;
		
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("IR: " + ir);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Total de Descontos: " + descontos);
		
		System.out.println("Seu sal�rio l�quido � de: R$" + salarioLiquido + " reais");

		
	}

}
