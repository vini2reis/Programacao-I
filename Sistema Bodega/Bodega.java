import java.util.*;

class Bodega{
	public static void main(String[] args){
	
		Scanner entrada = new Scanner(System.in);
		ArrayList<Funcionario> bodegueiros = new ArrayList<>();
		ArrayList<Bebida> produtos = new ArrayList<>();
		ArrayList<Cliente> clientes = new ArrayList<>();
		Empresa empresa = new Empresa("Bebidas do Jão", "04.848.410/0001-48");
		int op = 0;
		Funcionario funcionario = new Funcionario();
		bodegueiros.add(new Funcionario("Pedro", 1500.00, "30/05/1989", "158693254-23"));
		bodegueiros.add(new Funcionario("Paulo", 2000.00, "15/03/1987", "569631478-58"));
		bodegueiros.add(new Funcionario("Alex", 1700.00, "08/11/1992", "874569321-25"));
		Bebida bebida = new Bebida();
		produtos.add(new Bebida("Whisky", 1000, "38%", 59.90, 15));
		Cliente cliente = new Cliente();
		clientes.add(new Cliente("Manuel", "563.432.598-22", true));

		

		do{

			System.out.println("		BDJ");
			System.out.println("	    Bebidas Do Jão\n\n");
			System.out.println("1- Contratar funcionário");
			System.out.println("2- Adicionar cliente");
			System.out.println("3- Adicionar bebida");
			System.out.println("4- Comprar bebida");
			System.out.println("5- Vender bebida");
			System.out.println("6- Quantidade no estoque");
			System.out.println("7- Mostrar funcionários");
			System.out.println("8- Mostrar bebida");
			System.out.println("9- Mostrar cliente");
			System.out.println("0- Sair");

			System.out.print("Escolha uma opção: ");
			op = entrada.nextInt();
			System.out.println("\n\n");


			switch(op){

				case 1:
					bodegueiros.add(empresa.contrata());
					break;

				case 2:
					clientes.add(empresa.novoCliente());
					break;

				case 3:
					produtos.add(empresa.addBebida());
					break;

				case 4:
					bebida.compra(produtos);
					break;

				case 5:
					bebida.vende(produtos);
					break;

				case 6:
					bebida.estoque(produtos);
					break;

				case 7:
					empresa.mostraFuncionario(bodegueiros);
					break;

				case 8:
					empresa.mostraBebida(produtos);
					break;

				case 9:
					empresa.mostraCliente(clientes);
					break;
			}
		}while(op != 0);
	}
}	
