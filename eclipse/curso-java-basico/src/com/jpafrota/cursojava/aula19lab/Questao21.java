// QUEST�O ANULADA NA LISTA

package com.jpafrota.cursojava.aula19lab;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double[] vetA = new double[20];
		double cotacao;
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Cota��o do D�lar (R$): ");
		cotacao = scan.nextDouble();
		
		for(int i = 0; i < vetA.length; i++) {
			
			vetA[i] = (i + 1) * cotacao;
			System.out.println("U$" + (i + 1) + ": R$" + df.format(vetA[i]));
			
		}
		
	}

}