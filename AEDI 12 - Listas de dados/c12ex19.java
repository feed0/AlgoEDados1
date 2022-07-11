package AEDI12;
import java.util.Arrays;
import java.util.Scanner;

public class c12ex19 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// IN 100 BILHETES
		System.out.println("Diga os números de 100 bilhetes: ");
		int[] bilhetes = new int[100];
		for (int i = 0; i < bilhetes.length; i++)
			bilhetes[i] = in.nextInt();
		
		// IN SORTEADO
		System.out.println("Diga o bilhete sorteado: ");
		int sorteado = in.nextInt();
		
		// PROCURA COM BYNARY SEARCH
		int pos = Arrays.binarySearch(bilhetes, sorteado);
		if (pos >= 0)
			System.out.println("PREMIADO!");
		else
			System.out.println("NÃO PREMIADO");
		
		// PROCURA COM FOR 
		boolean achado = false;
		for (int i = 0; i < bilhetes.length; i++)
			if (sorteado == bilhetes[i])
				achado = true;
		
		if (achado == true)
			System.out.println("PREMIADO! 2");
		else
			System.out.println("NÃO PREMIADO 2");

		in.close();

	}

}
