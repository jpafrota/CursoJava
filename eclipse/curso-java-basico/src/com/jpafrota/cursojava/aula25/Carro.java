package com.jpafrota.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel; 
	double consumoCombustivel; 
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km");
		
	}
	
	double obterAutonomia() {
		
		return capCombustivel * consumoCombustivel;
		
	}
	
	double calcularCombustivel(double km) {
		
		return km / consumoCombustivel;
		
	}
	
}
