package mercado.menu;

import java.util.Scanner;

import mercado.controller.mercadoController;
import mercado.model.mercadoHortiFruti;
import mercado.model.mercadoLimpeza;
import mercado.util.Cores;

public class Menu {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		mercadoController produtos = new MercadoController();
		
		int id, tipo;
		String nome, validade;
		float preco; 
		
		
		
		while(true) {
			
		
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "********************************************");
			System.out.println("                                           ");
			System.out.println("               Mercado GTL                 ");
			System.out.println("                                           ");
			System.out.println("********************************************");
			System.out.println("                                           ");
			System.out.println("1 - Cadastrar                              ");
			System.out.println("2 - Consultar todos os Produtos            ");
			System.out.println("3 - Listar Produto por ID                  ");
			System.out.println("4 - Atualizar Produto                      ");
			System.out.println("5 - Deletar                                ");
			System.out.println("6 - Sair                                   ");
			System.out.println("********************************************");
			
			int opcao = leia.nextInt();
			if(opcao == 6) {
				System.out.println("Obrigado por colaborar com nós!Mercado GTL!");
				leia.close();
				System.exit(0);
				
			}
			
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BRIGHT + "\n Cadastrar");
				System.out.println("Digite o nome do produto:");
				nome = leia.next();
				
				System.out.println("Digite o ID do produto:");
				leia.skip("\\R?");
				id = leia.nextInt();
				
				do {
					System.out.println("Digite o tipo do produto (1-PHF 2-PL):");
					tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
					System.out.println("Digite o valor do produto para (R$):");
					preco = leia.nextInt();
					
					
					switch(tipo) {
					case 1 -> {
						System.out.println("Você escolheu o setor Horti-Fruti. Digite a validade do produto dd/mm/aaaa");
						validade = leia.next();
						produtos.cadastrar(new mercadoHortiFruti(produtos.gerarNumero(), id, tipo, preco, nome, validade));
					}
					case 2 -> {
						System.out.println("Você escolheu o setor da limpeza. Este produto possibilita a troca!" + boolean troca);
						produtos.cadastrar(new mercadoLimpeza(produtos.gerarNumero(), id, tipo, preco, nome));
						
					
							
						}
					}
					keyPress();
					
				
				break;
			
			case 2:
				System.out.println(Cores.TEXT_WHITE_BRIGHT + "\n Consiltar todos os Produtos");
				produtos.listarTodos();
				keyPress();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE_BRIGHT + "\n Atualizar Produto");
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE_BRIGHT + "\n Listar Produto por ID");
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE_BRIGHT + "Deletar");
				break;
			default:
				System.out.println("\nOpção Inválida");
	             break;
			}
			
		}
				
	
	


	private static void keyPress() {
		// TODO Auto-generated method stub
		
	}
	

}
