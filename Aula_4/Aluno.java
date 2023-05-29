package aula_04;

public class Aluno extends Pessoa {
	private int ra;
	
	//Construtor da classe
	public Aluno(String nome, String email, int ra) {
		this.nome = nome;
		this.email = email;
		this.ra = ra;
	}
		
	public void mostrar() {
		System.out.println("Aluno: " + this.nome + " | Email: " + this.email + " | RA: " + this.ra);
	}
}
