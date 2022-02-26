import java.util.*;

public class Bebida{

    Scanner entrada = new Scanner(System.in);
    String nome;
	int ml;
	String teor;
	double preco;
    int qtd;
    
    public Bebida(){

    }

    public Bebida(String name, int ml, String teor, double preco, int qtd){
        this.nome = name;
        this.ml = ml;
        this.teor = teor;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void compra(ArrayList<Bebida> bebi){
        int i;
        int j;
        int cod;
        int ncompra;
		System.out.println("Bebidas disponiveis:");
		for(i = 0; i < bebi.size(); i++){
			Bebida produto = bebi.get(i);
			System.out.println("Nome: " + produto.nome + " Cod: " + (i+1));
		}
        System.out.println("Digite o codigo da Bebida:");
		cod = entrada.nextInt();
		cod--;
		for(j = 0; j < bebi.size(); j++){
			Bebida prod = bebi.get(j);
			if(j == cod){
				break;
			}
		}
        Bebida prod = bebi.get(j);
        
		if(j == bebi.size()){
			System.out.println("Codigo invalido");
        }else{
			System.out.print("Quantidade de bebidas compradas: ");
			ncompra = entrada.nextInt();
			prod.qtd += ncompra;
			System.out.println("Quantidade de bebidas: " + prod.qtd);
		}
    }

    public void vende(ArrayList<Bebida> bebi){
        int i;
        int j;
        int cod;
        int nvenda;
		System.out.println("Bebidas disponiveis:");
		for(i = 0; i < bebi.size(); i++){
			Bebida produto = bebi.get(i);
			System.out.println("Nome: " + produto.nome + " Cod: " + (i+1));
		}
        System.out.println("Digite o codigo da Bebida:");
		cod = entrada.nextInt();
		cod--;
		for(j = 0; j < bebi.size(); j++){
			Bebida prod = bebi.get(j);
			if(j == cod){
				break;
			}
		}
        Bebida prod = bebi.get(j);
        
		if(j == bebi.size()){
            System.out.println("Codigo invalido");
        }else{
            if(prod.qtd == 0){
                System.out.println("Estoque vazio");
            }else{
                System.out.println("Quantidade no estoque: " + prod.qtd);
                System.out.println("Digite a quantidade de bebidas para vender: ");
                nvenda = entrada.nextInt();
                while(nvenda > prod.qtd){
                    System.out.println("Quantidade maior do que o estoque, Digite novamente: ");
                    nvenda = entrada.nextInt();
                }
                prod.qtd -= nvenda;
                System.out.println("Quantidade de bebidas: " + prod.qtd);
            }
        }
    }

    public void estoque(ArrayList<Bebida> bebi){
        int i;
        int j;
        int cod;
		System.out.println("Bebidas disponiveis:");
		for(i = 0; i < bebi.size(); i++){
			Bebida produto = bebi.get(i);
			System.out.println("Nome: " + produto.nome + " Cod: " + (i+1));
		}
        System.out.println("Digite o codigo da Bebida:");
		cod = entrada.nextInt();
		cod--;
		for(j = 0; j < bebi.size(); j++){
			Bebida prod = bebi.get(j);
			if(j == cod){
				break;
			}
		}
        Bebida prod = bebi.get(j);
        
		if(j == bebi.size()){
			System.out.println("Codigo invalido");
        }
        System.out.println("Temos " + prod.qtd + " " + prod.nome);
    }

    public String toString(){
		return "\nNome: " + this.nome + "\nPreço: R$ " + this.preco  + "\n" + this.ml + "ML" + "\nTeor Alcoolico: " + this.teor + "\nEstoque: " +this.qtd + " und" + "\n\n";
	}
}