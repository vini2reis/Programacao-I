class Mamifero extends Animal{
 	
 	private String alimento;
 	
 	public Mamifero(String nome, int comprimento, String cor, String alimento, double velocidade, int patas){
 		setNome(nome);
 		setComprimento(comprimento);
 		setCor(cor);
 		this.alimento = alimento;
 		setAmbiente("Terra");
 		setVelocidade(velocidade);
 		setPatas(patas);
 	}
 	
 	public void setAlimento(String alimento){
 		this.alimento = alimento;
 	}
 	public String getAlimento(){
 		return this.alimento;
 	}
 	
 	public void dados(){
 		System.out.print("Animal: " + getNome());
 		System.out.print("Comprimento: " + getComprimento() + " cm");
 		System.out.print("Cor: " + getCor());
 		System.out.print("Ambiente " + getAmbiente());
 		System.out.print("Velocidade :" + getVelocidade() + " m/s");
 		System.out.print("Patas: " + getPatas());
 		System.out.print("Alimento: " + getAlimento());
 		System.out.println("\n\n");
 	}
 


 }
