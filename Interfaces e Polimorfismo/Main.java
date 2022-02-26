import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {

  public static void main(String[] args) {
    
    Blog blog = new Blog();
    Scanner scanner = new Scanner(System.in);
    int opcao;
    Post p;

    do {
    System.out.println("BLOG: O que voce quer fazer?\n");
    System.out.println("1 - Novo post de noticia");
    System.out.println("2 - Nova resenha de produto");
    System.out.println("3 - Novo post de outros assuntos");
    System.out.println("4 - Listar todas as postagens");
    System.out.println("5 - Curtir postagem");
    System.out.println("6 - Nao curtir postagem");
    System.out.println("9 - Sair\n\n");
    
    System.out.print("Escolha uma opcao: ");
    opcao = scanner.nextInt();
    System.out.print("\n\n");
    
      switch (opcao) {
        
        case 1:
          p = new News();
          blog.readData(p);
          break;
          
        case 2:
          p = new ProductReview();
          blog.readData(p);
          break;
          
        case 3:
          p = new Post();
          blog.readData(p);
          break;
          
        case 4:
          blog.showAll();
          break;
          
        case 5:
          System.out.print("Digite o índice da postagem: ");
          int i = scanner.nextInt();
          
          if (i >= 0 && i < blog.getPosts().size()) {
            blog.getPosts().get(i).like();
            System.out.print("Like\n\n");
          } else {
            System.out.println("Índice inválido\n");
          };
          break;
          
        case 6:
          System.out.print("Digite o índice da postagem: ");
          i = scanner.nextInt();
          if (i >= 0 && i < blog.getPosts().size()) {
            blog.getPosts().get(i).dislike();
            System.out.print("Dislike\n\n");
          } else {
            System.out.println("Índice inválido\n");
          };
          break;
          
        case 9: break;
        
        default:
          System.out.println("Opção inválida!\n\n");
          break;
      }
    } while (opcao != 9);
  }
}
