package livraria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int opcao = 0;
		CadastroLivro cadastro;
		Venda venda;
		
		Scanner leitor = new Scanner(System.in);
		
		cadastro = new CadastroLivro();
		venda = new Venda();
		
		
			while(true) {
				try {
				System.out.println("=== Bem-vindo(a) ao Livraria da Lari ===");
				System.out.println("Digite a opção desejada: ");
				System.out.println("\n 1-- Cadastrar um Livro. \n 2-- Vender um Livro. \n 3-- Imprimir Balanço. \n 4-- Sair");
				System.out.println("OPÇÃO: ");
				
				opcao = leitor.nextInt();
				
				if (opcao == 1) {
					cadastro = new CadastroLivro();
					
					System.out.println("Informe o nome do livro:");
					cadastro.setNomeLivro(leitor.nextLine());
					
					System.out.println("Informe o preço do livro: ");
					cadastro.setPreço(Float.parseFloat(leitor.nextLine()));
					
					System.out.println("Informe a quantidade de livro: ");
					cadastro.setQuantidade(Integer.parseInt(leitor.nextLine()));
					
				} else if(opcao == 2) {
					venda = new Venda();
					System.out.println("Informe o valor do livro: ");
				}else if(opcao == 3) {
					System.out.println("Balanço:");
				}else if(opcao == 4) {
					System.out.println("Programa encerrado!");
				};
				
					
			} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e);
		}
				System.exit(0);
		} 
	}
}