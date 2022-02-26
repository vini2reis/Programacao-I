import java.util.Scanner;

class ProMed{
	public static void main(String[] args){
	
		Scanner entrada = new Scanner(System.in);
		Medicamento medicamento = new Medicamento();
		int opcao = 0;
		int opcao2 = 0;
		double percentual;
		int qtd;

		do{

			System.out.println("		MENU PRINCIPAL\n\n");
			System.out.println("1- Reajuste de preço");
			System.out.println("2- Vender medicamento");
			System.out.println("3- Comprar medicamento");
			System.out.println("4- Mostrar medicamento");
			System.out.println("5- Mostrar laboratório");
			System.out.println("0- Sair");
		
			System.out.print("Escolha uma opção: ");
			opcao = entrada.nextInt();

			if(opcao == 1){
				System.out.println("6- Acrescimo");
				System.out.println("7- Desconto");
				System.out.print("Escolha uma opção: ");
				opcao2 = entrada.nextInt();
				System.out.print("Percentual desejado (Ex: 0,10): ");
				percentual = entrada.nextDouble();
				medicamento.reajustarPreco(percentual, opcao2);
			}
			else if(opcao == 2){
				System.out.print("Quantidade: ");
				qtd = entrada.nextInt();
				medicamento.vender(qtd);
			}
			else if(opcao == 3){
				System.out.print("Quantidade: ");
				qtd = entrada.nextInt();
				medicamento.comprar(qtd);
			}
			else if(opcao == 4){
				medicamento.mostra();
			}
			else if(opcao == 5){
				medicamento.laboratorio.mostra();
			}
		}while (opcao != 0 );
	}
}
