package aula_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws IOException {
		BufferedReader dados = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("----------------------");
		System.out.println("Cadastro de Cursos");
		System.out.println("----------------------");
		
		int codigo, cargahoraria;
		String nome;
		
		// Ciração da lista de objetos
		ArrayList<Curso> lista = new ArrayList<Curso>();
		
		do {
			System.out.print("Codigo: ");
			codigo = Integer.parseInt(dados.readLine());
			
			if (codigo > 0) {
			
				System.out.print("Nome: ");
				nome = dados.readLine();
				System.out.print("Digite a Carga Horaria: ");
				cargahoraria = Integer.parseInt(dados.readLine());
				
				//Intanciação - criação de um objeto
				Curso curso1 = new Curso();
				curso1.cadastrar(codigo, nome, cargahoraria);
			
				lista.add(curso1);
			}
			
			System.out.println("---------------------------------");
		}while(codigo > 0);
		
		System.out.println("Listagem de Cursos");
		System.out.println("---------------------------------");
		
		for (int conta = 0; conta < lista.size(); conta++)
			System.out.println(lista.get(conta).mostrar());
		
	}

}
