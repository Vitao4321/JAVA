package aula_04;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João da Silva", "j@oul.com.br", 123);
		Aluno a2 = new Aluno("Maria de Souza", "m@ig.com.br", 999);
		
		a1.mostrar();
		a2.mostrar();
		
		Professor p1 = new Professor("Pablo Gonçalves", "p@gmail.com", 25000);
		
		p1.mostrar();
	}

}
