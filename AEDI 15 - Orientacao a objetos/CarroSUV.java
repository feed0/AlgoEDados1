package AEDI15;

public class CarroSUV extends Carro{

	// + 2 ATRIBUTOS
	private double peso, altura;
	
	// NOVO CONSTRUTOR
	public CarroSUV(String marca, String modelo, 
			int ano, boolean novo, boolean turbo,
			double peso, double altura) {
		
		super(marca, modelo, ano, novo, turbo);
		this.peso = peso;
		this.altura = altura;
		
	}
	
	// IMPRIME SUV
	public void ImprimeSUV() {
		System.out.println(
				"PESO: " + peso
				+ "\nALTURA: " + altura);
	}
	
	// METODOS PESO
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// METODOS ALTURA
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
