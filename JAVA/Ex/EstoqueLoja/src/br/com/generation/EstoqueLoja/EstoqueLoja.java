package br.com.generation.EstoqueLoja;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o seu nome: ");
		String nome = ler.next();
		
		ArrayList<String> estoqueLoja = new ArrayList();
		
		do
		{
			System.out.println("\nOla! "+nome+", Bem vinde a nossa loja de produtos eletronicos ");
			System.out.println("\nPor favor "+nome+", adicone ao carrinho o que deseja comprar ");
			
			System.out.println("------------------------------------------------------------------------");
			System.out.println("\n Digite (1) para adicionar um produto a seu carrinho");
			System.out.println("\n Digite (2) para remover de seu carrinho");
			System.out.println("\n Digite (3) para trocar o seu produto");
			System.out.println("\n Digite (4) para ver o seu carrinho");
			System.out.println("\n Digite (0) para sair de seu carrinho");
			System.out.println("------------------------------------------------------------------------");
			System.out.println("\nDigite uma das opções: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao seu carrinho: ");
				String produto = ler.nextLine();
				estoqueLoja.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto para remover de seu carrinho: ");
				String produtor = ler.nextLine();
				
				if(estoqueLoja.contains(produtor))
				{
					estoqueLoja.remove(produtor);
				}
				else
					{
					System.out.println("\nProduto não encontrado!!!");
					}
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja trocar de seu carrinho: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto para troca: "+verifica+" : ");
				String novo = ler.nextLine();
				
				if(estoqueLoja.contains(verifica))
				{
					estoqueLoja.remove(verifica);
					estoqueLoja.add(novo);
				}
				else
					{
					System.out.println("\nProduto não encontrado!!!");
					}
				System.out.println("\n"+estoqueLoja);
				break;
			case 4:
				System.out.println("\nOs Produtos no seu carrinho: ");
				System.out.println(estoqueLoja);
				break;
				default:
					System.out.println("\nObrigado por comprar em nossa loja, volte sempre !!!");
				
			}
		}while(op!=0);
		

	}


	}


