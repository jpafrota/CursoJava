package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;

public class Questao40 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int[] vetC = new int[5];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < vetB.length; i++){
			vetB[i] = scan.nextInt();
		}
		
		int posC = 0;
		boolean flag = true;
		for(int i = 0; i < vetA.length; i++) {
			
			for(int j = 0; j < vetB.length; j++) {
				
				if(vetA[i] == vetB[j]) {
					flag = false;
					break;
				}
				
			}
			
			if(flag == true) {
				vetC[posC] = vetA[i];
				posC++;
			}
			else flag = true;
			
		}
		
		for(int aux : vetC) {
			System.out.print(aux + " ");
		}
		
	}

}
