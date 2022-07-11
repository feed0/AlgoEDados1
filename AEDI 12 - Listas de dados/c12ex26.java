package AEDI12;
import java.util.Scanner;

public class c12ex26 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// ENTRADA
		System.out.println("Diga uma frase: ");
		String frase = in.nextLine();
		
		// SPLIT SEPARA PALAVRAS
		String[] palavras = frase.split(" ");
		
		// FORÇA MAIUSCULO NA PRIMEIRA LETRA
		for (int i=0; i<palavras.length; i++) 
			System.out.println(palavras[i].substring(0,1).toUpperCase() + palavras[i].substring(1));
		
		in.close();

	}

}
