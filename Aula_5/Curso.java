package aula_05;

public class Curso {
	private int codigo;
	private String nome;
	
	public void cadastrar(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String mostrar() {
		return "Curso: " + this.codigo + " - " + this.nome;
		
	}
	
	
}
