package com.jpafrota.cursojava.aula15lab;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int suspeito = 0;
		
		System.out.println("Telefonou para a v�tima?");
		String resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		System.out.println("Mora perto da v�tima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		System.out.println("Devia para a v�tima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		System.out.println("J� trabalhou com a v�tima?");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("Sim")) suspeito++;
		
		if(suspeito < 2) System.out.println("Inocente.");
		else if(suspeito == 2) System.out.println("Suspeito.");
		else if(suspeito <= 4) System.out.println("C�mplice.");
		else System.out.println("Assassino.");
			
	}
}
