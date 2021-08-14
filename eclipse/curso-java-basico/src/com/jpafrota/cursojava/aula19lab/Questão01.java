package com.jpafrota.cursojava.aula19lab;

public class Questão01 {

	public static void main(String[] args) {

		int[] A = new int[5];
		
		for(int i = 0; i < 5; i++) {
			A[i] = i+1;
		}
		
		int[] B = new int[5];
		
		for(int i = 0; i < 5; i++) {
			B[i] = A[i];
		}
		
		for(int aux : A) {
			System.out.print(aux);
		}
		
		System.out.println();
		
		for(int aux : B) {
			System.out.print(aux);
		}
		
	}

}
