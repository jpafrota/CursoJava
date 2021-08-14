package com.jpafrota.cursojava.aula17lab;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Questao29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println("Loja Quase Dois - Tabela de Preços");
		
		for(int i = 1; i <= 50; i++) {
			
			System.out.println(i + ": R$" + df.format(i*1.99));
			
		}

	}

}
