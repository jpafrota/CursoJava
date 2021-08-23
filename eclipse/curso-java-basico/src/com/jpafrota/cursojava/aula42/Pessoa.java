package com.jpafrota.cursojava.aula42;

// Classes finais n�o podem ser estendidas, ou seja, n�o podem ter subclasses

// O maior exemplo disso � a classe String.
// N�o se pode fazer, por exemplo: public class MinhaString EXTENDS String
// Pois � invi�vel e perigoso alguma classe poder sobrescrever os m�todos existentes na superclasse String.
// Pode acontecer o mesmo em projetos onde temos classes extremamente sens�veis a mudan�as e n�o desejamos que algu�m altere algo.

public final class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String obterEtiquetaEndereco() {
		
		return "Endere�o: " + this.endereco;
		
	}
	
	public void doSomething() {
		System.out.println("classe pessoa");
	}
	
}
