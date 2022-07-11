package AEDI13;

import java.util.Scanner;

public class c13ex10 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(c13ex10.class.getResourceAsStream("13 10.txt"));
		
		// ENTRADA FRASE
		String nomeCompleto = in.nextLine();
		System.out.println("FRASE: " + nomeCompleto);
		
		// CHAMDA METODO
		System.out.println("\nNome cascata: ");
		NomeCascata(nomeCompleto);

		in.close();

	}
	
	// FUNCAO
	public static void NomeCascata(String nomeCompleto) {
		
		String caractere;
		
		for (int i=0; i<nomeCompleto.length(); i++) {
			
			caractere = nomeCompleto.substring(i, i+1).toUpperCase();
			System.out.println(caractere);
				
			}
			
		}

	}
