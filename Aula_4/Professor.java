package aula_04;

public class Professor extends Pessoa {
	private double salario;
	
	//Construtor da classe
	public Professor(String nome, String email, double salario) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	public void mostrar() {
		System.out.println("Professor: " + this.nome + " | Email: " + this.email + " | Salario: " + this.salario);
	}
}
