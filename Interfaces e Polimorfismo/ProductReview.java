import java.util.Scanner;


public class ProductReview extends Post implements Evaluable{
  
  
  private String brand;
  private int stars;


  public ProductReview () {
    super();
    this.brand = new String();
  }
  
  
  public void setBrand(String nbrand) {
    this.brand = nbrand;
  };

  public String getBrand() {
    return this.brand;
  };
  
  public int getStars() {
    return this.stars;
  };



  @Override
  public void evaluate (int value) {
    while ( !(value >= 1 && value <= 10) ) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Número de estrelas inválido!");
      System.out.print("Informe sua avaliação(1 à 10).: ");
      value = scanner.nextInt();
    };
    this.stars = value;
  };
  
  @Override
  public void show () {
    super.show();
    System.out.println("Marca do Produto: " + getBrand());
    System.out.println("Estrelas: " + getStars());
  };
}
