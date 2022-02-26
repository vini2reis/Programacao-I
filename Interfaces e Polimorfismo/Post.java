import java.util.Date;
import java.text.SimpleDateFormat;

public class Post {
  
  private String title;
  private String content;
  private Date data;
  private int likes;
  private int dislikes;


  public Post () {
    this.title = new String();
    this.content = new String();
    setLikes(0);
    setDislikes(0);
  }
  
  
  public void setTitle (String n_title) {
    this.title = n_title;
  };
  
  public String getTitle () {
    return this.title;
  };
  
  public void setContent (String n_content) {
    this.content = n_content;
  };
  
  public String getContent () {
    return this.content;
  };
  
  public void setDate() {
    this.data = new Date();
  }
  
  public void setLikes (int n_likes) {
    this.likes = n_likes;
  };
  
  public int getLikes () {
    return this.likes;
  };
  
  public void setDislikes (int n_dislikes) {
    this.dislikes = n_dislikes;
  };
  
  public int getDislikes () {
    return this.dislikes;
  };


  void show () {
    System.out.println("\nTitulo: " + getTitle());
    System.out.println("Conteudo: " + getContent());
    System.out.println("Data: " + this.data);
    System.out.println("Likes: " + getLikes());
    System.out.println("Dislikes: " + getDislikes());
  };
  
  void like () {
    this.likes += 1;
  };
  
  void dislike () {
    this.dislikes += 1;
  };
}
