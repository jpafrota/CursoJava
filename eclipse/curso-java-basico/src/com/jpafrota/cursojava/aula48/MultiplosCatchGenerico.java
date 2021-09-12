package com.jpafrota.cursojava.aula48;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			}
			
			// a classe Throwable � superclasse de todas as exceptions E ERROS
			// usar Throwable n�o � uma boa pr�tica
			// ao inv�s disso utilizamos a classe Exception
			// que � a superclasse de todas as exce��es, n�o erros.
			catch (Exception exc) {
				System.out.println("Erro: " + exc.getMessage());
				exc.printStackTrace();
			}

		}

	}

}
