import java.util.Scanner;


class Medicamento {

	String nome ="B30";
	double precoVenda = 5.00;
	Data dataEntrada = new Data();
	Laboratorio laboratorio = new Laboratorio();
	boolean receitaObrigatoria = true;
	int qtdEstoque = 65;

	void mostra(){
		
		System.out.println("Medicamento: " + this.nome);
		System.out.printf("Preço: %.2f\n", this.precoVenda);
		System.out.println("Validade: " + this.dataEntrada.formatar());
		System.out.println("Laboratório: " + laboratorio.nomeFantasia);
		System.out.println("Estoque: " + this.qtdEstoque);
		System.out.println("Receita Obrigatoria: " + ((this.receitaObrigatoria)? "Sim" : "Nao"));
	}

	void reajustarPreco(double percentual, int op){

		if(op == 6){
			this.precoVenda = this.precoVenda + (this.precoVenda * percentual);
		}
		else if(op == 7){
			this.precoVenda = this.precoVenda - (this.precoVenda * percentual);
		}
	}

	void vender(int quantidade){
	
		if(receitaObrigatoria == true){
			System.out.println("Esse medicamento só pode ser vendido com a receita");
		}
		if(quantidade <= qtdEstoque){
			this.qtdEstoque = this.qtdEstoque - quantidade;
			System.out.println("Realizado com sucesso");
		}else{
			System.out.println("Impossível realizar. Em falta so estoque.");
		}
	}

	void comprar(int quantidade){
	
		this.qtdEstoque = this.qtdEstoque + quantidade;
	}
}
