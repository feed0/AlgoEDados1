package AEDI13;
import java.util.Scanner;

public class c13ex01 {
	
	// GLOBAIS
	static double x1, y1, x2, y2;
	static double distancia;
	
	// MAIN 
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		// ENTRADA COORDENADAS
		System.out.println("Diga as coordenadas (X1, Y1) e (X2, Y2)");
		x1 = key.nextDouble();
		y1 = key.nextDouble();
		x2 = key.nextDouble();
		y2 = key.nextDouble();
		
		// CHAMADA DO MÉTODO DISTANCIA
		distanciaPontos();
		System.out.printf("Distancia = %.4f", distancia);
		
		key.close();
		
	}
	
	// FUNCAO DISTANCIA 
	static double distanciaPontos() {
		
		distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return distancia;
	
	}

}
