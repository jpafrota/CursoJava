package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;
import java.lang.Math;

public class Questao36 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[11];
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = (int) Math.pow(2, i);
			
		}
		
		for(int aux : vetA) {
			System.out.print(aux + " ");
		}
		
	}

}
