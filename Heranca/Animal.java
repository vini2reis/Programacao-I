class Animal{
 	
 	private String nome;
 	private int comprimento;
 	private String cor;
 	private String ambiente;
 	private double velocidade;
 	private int patas;
 	
 	public Animal(String nome, int comprimento, String cor, String ambiente, double velocidade, int patas){
 		this.nome = nome;
 		this.comprimento = comprimento;
 		this.cor = cor;
 		this.ambiente = ambiente;
 		this.velocidade = velocidade;
 		this.patas = patas;
 	}
 	
 	public void setNome(String nome){
 		this.nome = nome;
 	}
 	public String getNome(){
 		return this.nome;
 	}
 	public void setComptimento(int comprimento){
 		this.comprimento = comprimento;
 	}
 	public int getComprimento(){
 		return this.comprimento;
 	}
 	public void setCor(String cor){
 		this.cor = cor;
 	}
 	public String getCor(){
 		return this.cor;
 	}
 	public void setAmbiente(String ambiente){
 		this.ambiente = ambiente;
 	}
 	public String getAmbiente(){
 		return this.ambiente;
 	}
 	public void setVelocidade(double velocidade){
 		this.velocidade = velocidade;
 	}
 	public double getVelocidade(){
 		return this.velocidade;
 	}
 	public void setPatas(int patas){
 		this.patas = patas;
 	}
 	public int getPatas(){
 		return this.patas;
 	}
 	
 	public void dados(){
 		System.out.print("Animal: " + this.nome);
 		System.out.print("Comprimento: " + this.comprimento + " cm");
 		System.out.print("Cor: " + this.cor);
 		System.out.print("Ambiente: " + this.ambiente);
 		System.out.print("Velocidade: " + this.velocidade + " m/s");
 		System.out.print("Patas: " + this.patas);
 		System.out.println("\n\n");
 	}
 	
 


 }
    