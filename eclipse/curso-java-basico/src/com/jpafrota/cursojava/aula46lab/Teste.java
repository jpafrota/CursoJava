package com.jpafrota.cursojava.aula46lab;

public class Teste {

	public static void main(String[] args) {

		Quadrado f1 = new Quadrado();
		f1.setLado(2);
		f1.setNome("Quadrado");
		
		Circulo f2 = new Circulo();
		f2.setRaio(2);
		f2.setNome("C�rculo");
		
		Triangulo f3 = new Triangulo();
		f3.setAltura(2);
		f3.setBase(3);
		f3.setNome("Tri�ngulo");
		
		Cubo f4 = new Cubo();
		f4.setAresta(3);
		f4.setNome("Cubo");
		
		Cilindro f5 = new Cilindro();
		f5.setAltura(3);
		f5.setRaio(2);
		f5.setNome("Cilindro");
		
		Piramide f6 = new Piramide();
		f6.setAltura(3);
		f6.setApotema(4);
		f6.setArestaBase(2);
		f6.setNumPoliBase(4);
		f6.setBase(f1);
		f6.setNome("Pir�mide");
		
		FiguraGeometrica figuras[] = new FiguraGeometrica[6];
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;

		System.out.println("----------------\n");
		
		for(FiguraGeometrica figura : figuras) {
			
			System.out.println(figura.toString());
			System.out.println("----------------\n");
			
			// Tamb�m poderia ser feito da seguinte forma, usando
			// instanceof:
			
			/*
			 * if(figura instanceof Figura2D){
			 * 
			 *     Figura2D f2d = (Figura2D) figura;
			 *     System.out.println(f2d.calcularArea());
			 * 
			 * }
			 * 
			 * if(figura instanceof Figura3D){
			 * 
			 *     Figura3D f3d = (Figura3D) figura;
			 *     System.out.println(f3d.calcularArea());
			 *     System.out.println(f3d.calcularVolume());
			 *
			 * }
			 * 
			 */
			
			
		}
		
	}

}
