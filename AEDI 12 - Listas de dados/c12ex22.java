package AEDI12;
import java.util.Scanner;

public class c12ex22 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// ENTRADA
		int[] numeros = new int[20];
		System.out.println("Diga 20 números: ");
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = in.nextInt();

		// SAIDA SEQUENCIA IMPAR
		for (int i = 0; i < numeros.length; i += 2)
			System.out.println(numeros[i]);
		
		// SAIDA SEQUENCIA PAR
		for (int i = 1; i < numeros.length; i += 2)
			System.out.println(numeros[i]);

		in.close();
		
	}

}
