import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Calendar;



public class Blog {
  
  
  private ArrayList<Post> posts;



  public Blog () {
    this.posts = new ArrayList<Post>();
  };



  public ArrayList<Post> getPosts() {
    return this.posts;
  };
  


  public void showAll() {
    System.out.println("Todos os posts do BLOG: ");
    int size = posts.size();
    for(int i = 0; i < size; i++) {
      this.posts.get(i).show();
      System.out.println();
    };
  };
  
  
  public void readData (Post p) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Título: ");
    p.setTitle(scanner.nextLine());
    System.out.print("Conteudo: ");
    p.setContent(scanner.nextLine());
    p.setDate();
    
    if (p instanceof ProductReview) {
      ProductReview f = (ProductReview) p;
      System.out.print("Marca: ");
      f.setBrand(scanner.nextLine());
      System.out.print("Número de estrelas: ");
      f.evaluate(scanner.nextInt());
      System.out.print("\n\n");
    }
    
    else if (p instanceof News) {
      News f = (News) p;
      System.out.print("Fonte: ");
      f.setSource(scanner.nextLine());
      System.out.print("\n\n");
    };

    this.posts.add(p);
  };
}
