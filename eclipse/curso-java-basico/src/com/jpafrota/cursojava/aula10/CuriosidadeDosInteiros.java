package com.jpafrota.cursojava.aula10;

public class CuriosidadeDosInteiros {

	public static void main(String[] args) {
		
		int valorMax = 2147483647;
		int a = 1;
		
		System.out.println(valorMax + a);
		//O interessante aqui � que valorMax � o maior numero que java pode armazenar no tipo "int"
		//Por�m, ao ser somado com qualquer valor, a vari�vel "d� a volta" no range de n�meros.
		//No caso, ao somar 1 ao valorMax obt�m-se o primeiro valor m�nimo do range "int", que � -2147483648
	}
}
