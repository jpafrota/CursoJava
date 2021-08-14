package com.jpafrota.cursojava.aula25a27lab;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.modelo = "A30";
		lampada.potencia = 18;
		lampada.tensao = 220;
		lampada.tipoIluminacao = "LED";
		lampada.corDaLuz = "RGB";
		
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Pot�ncia: " + lampada.potencia);
		System.out.println("Tens�o: " + lampada.tensao);
		System.out.println("Tipo de Ilumina��o: " + lampada.tipoIluminacao);
		System.out.println("Cor da Luz: " + lampada.corDaLuz);
		
		System.out.println("L�mpada ligada: " + lampada.ligado);
		lampada.interruptor();
		System.out.println("L�mpada ligada: " + lampada.ligado);
		lampada.interruptor();
		System.out.println("L�mpada ligada: " + lampada.ligado);
		lampada.ligar();
		System.out.println("L�mpada ligada: " + lampada.ligado);
		lampada.ligar();
		System.out.println("L�mpada ligada: " + lampada.ligado);
		lampada.desligar();
		System.out.println("L�mpada ligada: " + lampada.ligado);
		
	}

}
