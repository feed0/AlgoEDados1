package AEDI12;
import java.util.Scanner;

public class c12ex16 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		// ENTRADA
		System.out.println("Diga 10 números: ");
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = key.nextInt();

		}
		
		System.out.println("Diga o multiplicador: ");
		double coeficiente = key.nextDouble();

		// CALCULO E IMPRESSAO
		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i] * coeficiente + " ");

		}

		key.close();
		
	}

}
