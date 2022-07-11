package AEDI12;
import java.util.Scanner;

public class c12ex15 {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(c12ex15.class.getResourceAsStream("12 15.txt"));

		int[] numero = new int[10];
		int somaPares = 0, contPares = 0;
		System.out.println("Números pares:");
		for (int i = 0; i < 10; i++) {
			// ENTRADA
			numero[i] = key.nextInt();

			// SE FOR PAR
			if (numero[i] % 2 == 0) {
				System.out.printf("\n%d ", numero[i]);
				somaPares += numero[i];
				contPares++;
			}
		}

		double media = somaPares / (float) contPares;
		System.out.printf("\n\nMédia dos pares: %.1f", media);
		key.close();

	}
}
