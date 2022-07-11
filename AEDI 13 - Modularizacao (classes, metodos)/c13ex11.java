package AEDI13;

import java.util.Scanner;

public class c13ex11 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(c13ex11.class.getResourceAsStream("13 11.txt"));
		
		// ENTRADA FRASE
		String nomeCompleto = in.nextLine();
		System.out.println("NOME: " + nomeCompleto);
		
		// CHAMDA METODO
		System.out.println("\nPenúltimo nome: ");
		PenultimoNome(nomeCompleto);
		
		in.close();

	}
	
	// FUNCAO
	public static void PenultimoNome(String nomeCompleto) {	
			
			String[] nomeVet = nomeCompleto.split(" ");
			String penultimoNome = nomeVet[nomeVet.length - 2].toUpperCase();
			System.out.println(penultimoNome);
		
		}

	}
