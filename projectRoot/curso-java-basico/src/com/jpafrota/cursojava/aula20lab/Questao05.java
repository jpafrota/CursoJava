package com.jpafrota.cursojava.aula20lab;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[][][] agenda = new String[12][30][8];

		int dia = 0;
		int mes = 0;
		int hora = 0;
		
		int op;
		do {
			
			System.out.println("Digite a opcao desejada: ");
			System.out.println("1 - Agendar compromisso");
			System.out.println("2 - Consultar agenda");
			System.out.println("0 - Encerrar");
			
			op = scan.nextInt();
			
			switch (op) {
			case 0:
				System.out.println("Adeus!");
				break;
				
			case 1: 
				System.out.print("Digite o dia do compromisso: ");
				dia = scan.nextInt();
				System.out.print("Digite o mês do compromisso: ");
				mes = scan.nextInt();
				
				while(hora < 8 || hora > 16) {
					System.out.print("Digite a hora compromisso: ");
					hora = scan.nextInt();
					if(hora < 8 || hora > 16) System.out.println("\nHORA INVALIDA. Tente novamente.\n");
				}
				
				mes--;
				dia--;
				hora -= 8;
				
				System.out.print("Digite o compromisso: ");
				agenda[mes][dia][hora] = scan.next();
				
				System.out.println("");
				scan.nextLine();
				break;
				
			case 2: 
				System.out.print("Digite o dia a ser consultado: ");
				dia = scan.nextInt();
				System.out.print("Digite o mes a ser consultado: ");
				mes = scan.nextInt();
				
				while(hora < 8 || hora > 16) {
					System.out.print("Digite a hora compromisso: ");
					hora = scan.nextInt();
					if(hora < 8 || hora > 16) System.out.println("\nHORA INVALIDA. Tente novamente.\n");
				}
				
				mes--;
				dia--;
				hora -= 8;
				
				if(agenda[mes][dia][hora] == null) {
					System.out.println("SEM COMPROMISSO");
				}
				else {
					System.out.println(agenda[mes][dia][hora]);
				}
				System.out.println("");
				break;
				
			default:
				System.out.println("Opcao invalida!\n");
				
			}
			
		} while(op != 0);
		
	}

}
