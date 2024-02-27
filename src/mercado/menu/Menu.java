package mercado.menu;

import java.util.Scanner;

import mercado.util.Cores;

public class Menu {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
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
				break;
			
			case 2:
				System.out.println(Cores.TEXT_WHITE_BRIGHT + "\n Consiltar todos os Produtos");
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
				
	
	}
	

}
