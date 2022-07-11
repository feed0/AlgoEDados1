package AEDI15;

public class Carro {
	
	// 5 ATRIBUTOS
	private String marca, modelo;
	private int ano;
	private boolean novo, turbo;
	
	// CONSTRUTOR
	public Carro(String marca, String modelo, int ano, boolean novo, boolean turbo) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.novo = novo;
		this.turbo = turbo;
		
	}
	
	// METODO IMPRIME ATRIBUTOS BASICOS
	public void ImprimeCarro() {
		
		System.out.println(
				    "MARCA: \t" + marca
				+ "\nMODELO: \t" + modelo
				+ "\nANO: \t" + ano
				+ "\nNOVO: " + novo
				+ "\nTURBO: " + turbo);
		
	}
	
	// METODOS NOVO
	public boolean getNovo() {
		return this.novo;
	}
	
	public void setNovob(boolean novo) {
		this.novo = novo;
	}
	
	// METODOS TURBO
	public boolean getTurbo() {
		return this.turbo;
	}
	
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
}

