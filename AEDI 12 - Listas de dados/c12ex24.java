package AEDI12;
import java.util.Scanner;

public class c12ex24 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] numeros = new int[10];

		// ENTRA NUMEROS
		System.out.println("Diga 10 números: ");
		for (int i = 0; i < numeros.length; i++) 
			numeros[i] = in.nextInt();
		
		// NOVO VETOR
		int[] numerosDiv3 = new int[numeros.length];
		for (int i = 0;i<numeros.length;i++) {
			
			if (numeros[i] % 3 ==0)
				numerosDiv3[i] = numeros[i];
			
		}
		
		// IMPRIME NOVO VETOR
		for (int i =0;i<numerosDiv3.length;i++)
			if (numerosDiv3[i] != 0)
				System.out.println(numerosDiv3[i]);
		
		in.close();

	}

}
