package com.jpafrota.cursojava.aula36lab.curso;

public class Aluno {

	private String nome;
	private String matricula;
	private double[] notas;
	
	public Aluno() {
		this.notas = new double[4];
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public void setNotasPos(double nota, int pos) {
		this.notas[pos] = nota;
	}
	
	
	public String obterInfo() {
		
		String info = "Nome: " + this.nome + "\n" +
				"Matricula: " + this.matricula + "\n";
		
		for(double aux : this.notas) {
			info += aux + " ";
		}
		
		return info;
		
	}
	
}
