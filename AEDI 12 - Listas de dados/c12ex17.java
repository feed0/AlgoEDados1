package AEDI12;
import java.util.Scanner;

public class c12ex17 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		// ENTRADA VETOR
		System.out.println("Diga 10 números: ");
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) 
			vetor[i] = key.nextInt();


		// VETOR INVERSO
		int[] vetorInverso = new int[vetor.length];
		int cont = vetor.length - 1;
		for (int i = 0; i < vetorInverso.length; i++) {

			vetorInverso[i] = vetor[cont];
			cont--;

		}
		
		// SAÍDA
		for (int i = 0;i<vetorInverso.length;i++)	
			System.out.println(vetorInverso[i]);
		
		
		key.close();

	}

}
