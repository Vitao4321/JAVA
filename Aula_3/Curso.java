package aula_03;

public class Curso {
	private int codigo;
	private String nome;
	private int cargahoraria;
	
	public void cadastrar(int pcodigo, String pnome, int pcargahoraria) {
		this.codigo = pcodigo;
		this.nome = pnome;
		this.cargahoraria = pcargahoraria;
		
	}
	
	public String mostrar() {
		return "Curso: " + this.codigo + " | " + this.nome + " | " + this.cargahoraria;
	}
	
	
}
