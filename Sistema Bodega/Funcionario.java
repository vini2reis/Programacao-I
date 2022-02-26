import java.util.*;

public class Funcionario{

	String nome;
	double salario;
	String nasc;
	String cpf;
	
	public Funcionario(){

	}
	
	public Funcionario(String name, double salario, String nas, String cpf){
		this.nome = name;
		this.salario = salario;
		this.nasc = nas;
		this.cpf = cpf;
	}

	public String toString(){
		return "\nNome: " + this.nome + "\nSalario: R$ " + this.salario + "\nData de nascimento: " + this.nasc + "\nCPF: " + this.cpf + "\n\n";
	}
}
	
