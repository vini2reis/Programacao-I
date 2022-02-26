import java.util.*;

public class Cliente{

    String nome;
    String cpf;
    boolean fiadofree;

    public Cliente(){

    }

    public Cliente(String name, String cpf, boolean fiado){
        this.nome = name;
        this.cpf = cpf;
        this.fiadofree = fiado;
    }

    public String toString(){
        String ff;

        if(this.fiadofree){
            ff = new String("Sim");
        }else{
            ff = new String("Não");
        }

        return "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nFiado liberado: " + ff + "\n\n";
    }
}