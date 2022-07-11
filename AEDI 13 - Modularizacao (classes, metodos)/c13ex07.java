package AEDI13;

import java.util.Scanner;

public class c13ex07 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(c13ex07.class.getResourceAsStream("13 07.txt"));

		String[] nomeCompleto;
		int comprimentoNome;
		
		// ENTRADA NOME COMPLETO EM VETOR
		nomeCompleto = in.nextLine().split(" ");
		comprimentoNome = nomeCompleto.length;
		
		// IMPRESSAO NOME COMPLETO
		for (String i: nomeCompleto)
			System.out.print(i + " ");
		
		// CHAMDA METODO
		System.out.println("\nNome de familia: " + NomeFamilia(nomeCompleto, comprimentoNome) );

		in.close();

	}
	
	// FUNCAO
	public static String NomeFamilia(String[] nomeCompleto, int comprimentoNome) {
		
		String nomeFamilia = nomeCompleto[comprimentoNome - 1];
		return nomeFamilia;
		
		
	}

}
