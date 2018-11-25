package main;

public class Marca {
	
	private String nomeDaMarca;
	private Modelo modelo;
	
	public Marca(String nomeDaMarca, String modelo) {
		
		this.nomeDaMarca = nomeDaMarca;
		this.modelo = new Modelo(modelo);
		
	}
	
	public String getNomeDaMarca() {
		return nomeDaMarca;
	}
	
	public Modelo getModelo() {
		return modelo;
	}
	

}
