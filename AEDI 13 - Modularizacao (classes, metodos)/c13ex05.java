package AEDI13;
import java.util.Scanner;

public class c13ex05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Diga um ângulo em graus: ");
		double anguloGraus = in.nextDouble();
		
		// CONVERTE PARA RADs
		double anguloRadianos = anguloGraus * Math.PI / 180;
		System.out.println(String.format("Radianos: \t%.1f\n", anguloRadianos));
		
		// CHAMADA METODOS
		System.out.println(
				
				String.format("Seno: \t\t%.3f \tArco Seno: \t%.3f", seno(anguloRadianos), 1 / seno(anguloRadianos))
				+ String.format("\nCosseno: \t%.3f \tArco Cosseno: \t%.3f", cosseno(anguloRadianos), 1 / cosseno(anguloRadianos))
				+ String.format("\nTangente: \t%.3f \tArco Cosseno: \t%.3f", tangente(anguloRadianos), 1 / tangente(anguloRadianos))
				
				    );		
		
		in.close();
		
	}
	
	// FUNCOES
	public static double seno(double a) {
		
		double seno = Math.sin(a);
		return seno;
		
	}
	
	public static double cosseno(double a) {
			
		double cosseno = Math.cos(a);
		return cosseno;
		
	}
	
	public static double tangente(double a) {
			
		double tangente = Math.tan(a);
		return tangente;
		
	}

}
