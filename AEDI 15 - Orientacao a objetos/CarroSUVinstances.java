package AEDI15;

public class CarroSUVinstances {

	public static void main(String[] args) {
		
		CarroSUV Carro1 = new CarroSUV("BMW", "X5", 2020, false, true, 2000, 2);
		Carro1.ImprimeCarro();
		Carro1.ImprimeSUV();
		System.out.println();
		
		CarroSUV Carro2 = new CarroSUV("BMW", "X4", 2016, false, false, 2500, 2);
		Carro2.ImprimeCarro();
		Carro2.ImprimeSUV();
		System.out.println();
		
		CarroSUV Carro3 = new CarroSUV("Mercedes", "GLC", 2022, true, true, 2500, 2);
		Carro3.ImprimeCarro();
		Carro3.ImprimeSUV();
	}
	
}
