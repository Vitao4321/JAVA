package aula_05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		// Objeto criado para entrada de dados
		BufferedReader dados = new BufferedReader(new InputStreamReader(System.in));		
		
		// Cria uma lista de objetos
		ArrayList<Curso> cur = new ArrayList<Curso>();
		
		System.out.println("------------------");
		System.out.println("Cadastro de curos");
		System.out.println("------------------");
		
		int codigo;
		String nome;
		
		// While para pegar as informações dos alunos
		do {
			codigo = cur.size() + 1;
			System.out.println("Codigo: " + codigo);
			//codigo = Integer.parseInt(dados.readLine());
			
			System.out.print("Nome: ");
			nome = dados.readLine();
			
			if(!nome.equals("0")) {
				// Criação do objeto do tipo Curso
				Curso c = new Curso();
				c.cadastrar(codigo, nome);
			
				// Adiciona um objeto (c) na lista de objetos (cur)
				cur.add(c);
			}
			
		} while (!nome.equals("0"));
		
		System.out.println("------------------");
		System.out.println("Listagem de Cursos");
		System.out.println("------------------");
		
		// Lista dos objetos criados 
		for(int conta = 0; conta < cur.size(); conta++)
			System.out.println(cur.get(conta).mostrar());
		
		// Cria uma lista de objetos
		ArrayList<Aluno> alu = new ArrayList<Aluno>();
		
		System.out.println("------------------");
		System.out.println("Cadastro de Alunos");
		System.out.println("------------------");
		
		int ra;
				
		// While para pegar as informações dos alunos
		do {
			ra = alu.size() + 1;
			System.out.println("RA: " + ra);
					
			
			System.out.print("Nome: ");
			nome = dados.readLine();
			
			if(!nome.equals("0")) {	
				String listacurso = "Curso [";
				
				for(int conta = 0; conta < cur.size(); conta++)
					listacurso += cur.get(conta).mostrar().substring(6, cur.get(conta).mostrar().length()) + " | ";
				
				System.out.print(listacurso.substring(0, listacurso.length() - 1) + "]: " );
				int aux = Integer.parseInt(dados.readLine());
				
				// Criação do objeto do tipo Curso
				Aluno a = new Aluno();
				a.cadastrar(ra, nome, cur.get(aux - 1));
					
				// Adiciona um objeto (c) na lista de objetos (cur)
				alu.add(a);
			}
					
		} while (!nome.equals("0"));
		
		System.out.println("------------------");
		System.out.println("Listagem de Alunos");
		System.out.println("------------------");
		
		// Lista dos objetos criados 
		for(int conta = 0; conta < alu.size(); conta++)
			System.out.println(alu.get(conta).mostrar());
	
	}
	
}
