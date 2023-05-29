package aula_05;

public class Aluno {
	private int ra;
	private String nome;
	private Curso curso;
	
	public void cadastrar(int ra, String nome, Curso curso) {
		this.ra = ra;
		this.nome  = nome;
		this.curso = curso;
	}
	
	public String mostrar() {
		return "RA: " + this.ra + " - " + this.nome +  " | " + this.curso.mostrar();
		
	}
}
