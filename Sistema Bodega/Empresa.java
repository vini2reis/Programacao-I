import java.util.*;

public class Empresa{

	Scanner entrada = new Scanner(System.in);
	String nome;
	String cnpj;

	public Empresa(){

	}

	public Empresa(String name, String cnpj){
		this.nome = name;
		this.cnpj = cnpj;
	}

	public Funcionario contrata(){
		String nome;
		double salario;
		String dataNasc;
		String cpf;

		System.out.print("Digite o nome do funcionário: ");
		nome = entrada.next();
		System.out.print("CPF: ");
		cpf = entrada.next();
		System.out.print("Salário: ");
		salario = entrada.nextDouble();
		System.out.print("Data de nascimento: ");
		dataNasc = entrada.next();
		Funcionario fun = new Funcionario(nome, salario, dataNasc, cpf);

		return fun;
	}

	public Cliente novoCliente(){
		String nome;
		String cpf;
		boolean fiadoFree = false;
		int resp;

		System.out.print("Nome do cliente: ");
		nome = entrada.next();
		System.out.print("CPF: ");
		cpf = entrada.next();
		System.out.println("Fiado liberado?");
		System.out.println("1- Sim");
		System.out.println("2- Não");
		resp = entrada.nextInt();

		if(resp == 1){
			fiadoFree = true;
		}
		
		else if(resp == 2){
			fiadoFree = false;
		}

		Cliente clnt = new Cliente(nome, cpf, fiadoFree);

		return clnt;
	}

	public Bebida addBebida(){
		String nome;
		int ml;
		String teor;
		double preco;
		int qtd;

		System.out.print("Nome da bebida: ");
		nome = entrada.nextLine();
		System.out.print("Quantidade de ml: ");
		ml = entrada.nextInt();
		System.out.print("Teor alcoolico: ");
		teor = entrada.next();
		System.out.print("Preço: ");
		preco = entrada.nextDouble();
		System.out.print("Quantidade no estoque: ");
		qtd = entrada.nextInt();

		Bebida bebida = new Bebida(nome, ml, teor, preco, qtd);

		return bebida;
	}

	public void mostraFuncionario(ArrayList<Funcionario> func){
		for(int i = 0; i < func.size(); i++){
			Funcionario f = func.get(i);
			System.out.println("Funcionario " + (i+1) + "- " + f);
		}
	}

	public void mostraBebida(ArrayList<Bebida> bebi){
		for(int i = 0; i < bebi.size(); i++){
			Bebida b = bebi.get(i);
			System.out.println("Bebida " + (i+1) + "- " + b);
		}
	}

	public void mostraCliente(ArrayList<Cliente> cl){
		for(int i = 0; i < cl.size(); i++){
			Cliente c = cl.get(i);
			System.out.println("Cliente " + (i+1) + "- " + c);
		}
	}
}