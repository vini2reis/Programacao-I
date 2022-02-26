import java.util.Scanner;

class Laboratorio {

	String nomeFantasia = "TruE";
	String razaoSocial = "Remedios LTDA";
	String cnpj = "04.848.410/0001-48";
	String inscricaoEstadual = "569.487.267";
	String endereco = "Rua Gerhardt, 27";
	String telefone = "6589-3276";


    void mostra(){
		
		System.out.println("Nome Fantasia: " + this.nomeFantasia);
		System.out.println("Razão Social: " + this.razaoSocial);
		System.out.println("Cnpj: " + this.cnpj);
		System.out.println("Inscrição Estadual: " + this.inscricaoEstadual);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + this.telefone);

    }
}
