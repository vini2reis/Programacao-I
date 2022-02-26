public class News extends Post {
  
  
  private String source;


  public News () {
    super();
    this.source = new String();
  }
  
  
  public void setSource (String n_source) {
    this.source = n_source;
  };

  public String getSource () {
    return this.source;
  };
  

  @Override
  public void show () {
    super.show();
    System.out.println("Fonte: " + getSource());
  };
}
