//QUEST�O 02: Fa�a um programa que pe�a um n�mero e ent�o
//mostre a mensagem "O n�mero informado foi [n�mero]"

package com.jpafrota.cursojava.aula13lab;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valor = scan.nextInt();
		System.out.println("O numero informado foi: " + valor);
	}

}
