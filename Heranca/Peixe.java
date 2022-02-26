class Peixe extends Animal{
 	
 	private String caracteristica;
 	
 	public Peixe(String nome, int comprimento, String caracteristica, double velocidade){
 		setNome(nome);
 		setComprimento(comprimento);
 		this.caracteristica = caracteristica;
 		setCor("Cinza");
 		setAmbiente("Mar");
 		setVelocidade(velocidade);
 		setPatas("0");
 	}
 	
 	public void setCaracteristica(String caracteristica){
 		this.caracteristica = caracteristica;
 	}
 	public String getCaracteristica(){
 		return this.caracteristica;
 	}
 	
 	public void dados(){
 		System.out.print("Animal: " + getNome());
 		System.out.print("Comprimento: " + getComprimento() + " cm");
 		System.out.print("Cor: " + getCor());
 		System.out.print("Ambiente " + getAmbiente());
 		System.out.print("Velocidade :" + getVelocidade() + " m/s");
 		System.out.print("Patas: " + getPatas());
 		System.out.print("Caracteristica: " + getCaracteristica());
 		System.out.println("\n\n");
 	}
 


 }
