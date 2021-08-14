package com.jpafrota.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nomeCompleto = scan.nextLine();
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
				
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();

		System.out.print("Digite sua altura: ");
		float altura = scan.nextFloat();
		
		System.out.print("Quantos filhos voc� possui: ");
		byte temFilhos = scan.nextByte();
		
		System.out.print("Voc� tem animais de estima��o?: ");
		boolean temPet = scan.nextBoolean();
		
		
		System.out.println("Seu nome completo �: " + nomeCompleto);
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		System.out.println("Sua idade �: " + idade + " anos");
		System.out.println("Sua altura �: " + altura + " metros");
		System.out.println("Voc� tem: " + temFilhos + " filhos");
		System.out.println("Possui animais de estima��o: " + temPet);
	}
}
