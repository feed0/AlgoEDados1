package AEDI12;
import java.util.Scanner;

public class c12ex20 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// ENTRADA 10 NUMEROS
		int[] numeros = new int[10];
		System.out.println("Diga 10 números: ");
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = in.nextInt();
		
		int ultimoNum = numeros[numeros.length - 1];
		int soma = 0, cont = 0;
		
		// NUMEROS MAIORES QUE O ULTIMO
		for (int i = 0; i < numeros.length - 1; i++)
			
			if (numeros[i] > ultimoNum) {
			
				System.out.println(numeros[i]);
				soma += numeros[i];
				cont ++;
						
			}
		
		// MEDIA DOS MAIORES
		double media;
		if (cont != 0) {
			
			media = (float) soma / cont;
			System.out.println(media);
			
		}
		
		in.close();
		
	}

}
