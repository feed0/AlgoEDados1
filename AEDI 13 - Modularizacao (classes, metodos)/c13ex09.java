package AEDI13;

import java.util.Scanner;

public class c13ex09 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(c13ex09.class.getResourceAsStream("13 09.txt"));
		
		// ENTRADA FRASE
		String frase = in.nextLine();
		System.out.println("FRASE: " + frase);
		
		// CHAMDA METODO
		System.out.println("\nNome com iniciais maiúsculas: ");
		IniciaisMaiusculas(frase);

		in.close();

	}
	
	// FUNCAO
	public static void IniciaisMaiusculas(String frase) {
		
		String caractere;
		
		for (int i=0; i<frase.length(); i++) {
			
			caractere = frase.substring(i, i+1);
			
			// SE FOR LETRA
			if (!caractere.equalsIgnoreCase(" ")) 				
				System.out.print(caractere);
			// SE FOR ESPACO BRANCO
			else { 
				
				// IMPRIME ESPACO BRANCO
				System.out.print(caractere);
				// PASSA PRO PROXIMO CARACTERE
				i++;
				caractere = frase.substring(i, i+1);
				System.out.print(caractere.toUpperCase());
				
			}
			
		}

	}
	
}
