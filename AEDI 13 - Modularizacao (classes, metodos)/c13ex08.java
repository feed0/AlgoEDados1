package AEDI13;

import java.util.Scanner;

public class c13ex08 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(c13ex08.class.getResourceAsStream("13 08.txt"));

		String[] nomeCompleto;
		int comprimentoNome;
		
		// ENTRADA NOME COMPLETO EM VETOR
		nomeCompleto = in.nextLine().split(" ");
		comprimentoNome = nomeCompleto.length;
		
		// IMPRESSAO NOME COMPLETO
		for (String i: nomeCompleto)
			System.out.print(i + " ");
		
		// CHAMDA METODO
		System.out.println("\nNome de ABNT: ");
		NomeABNT(nomeCompleto, comprimentoNome);

		in.close();

	}
	
	// FUNCAO
	public static void NomeABNT(String[] nomeCompleto, int comprimentoNome) {
		
		System.out.print(nomeCompleto[comprimentoNome - 1].toUpperCase() + ", ");
		
		for (int i=0; i < nomeCompleto.length - 1; i++)
			System.out.print(nomeCompleto[i].substring(0,1).toUpperCase() + ". ");		
		
	}

}
