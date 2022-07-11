package AEDI13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c13ex06 {

	// GLOBAIS
	static List<String> nomes = new ArrayList<String>();
	static String nomeFamilia;
	
	public static void main(String[] args) {

		Scanner in = new Scanner(c13ex06.class.getResourceAsStream("13 06.txt"));

		// ENTRADA NOME FAMILIA
		nomeFamilia = in.nextLine();
		System.out.println("Nome da família: \t" + nomeFamilia);

		// ENTRADA NOMES COMPLETOS
		int numeroNomes = 100;
		System.out.printf("\nDiga os %d nomes completos: \n", numeroNomes);
		for (int i = 0; i < numeroNomes; i++) {
		
			nomes.add(in.nextLine());
			System.out.println(nomes.get(i));
			
		}
		
		System.out.println("\n");
		
		// CHAMADA METODO NUM FAMILIA		
		System.out.println("\nNúmero de familiares: " + contaFamiliares());
		
		in.close();

	}

	// FUNCOES
	public static int contaFamiliares() {
		
		int contFamilia = 0;
		String ultimoNome;
		for (String nomeCompleto : nomes) {

			ultimoNome = nomeCompleto.split(" ")[nomeCompleto.split(" ").length - 1];
			if (ultimoNome.equalsIgnoreCase(nomeFamilia))
				contFamilia++;

		}
		
		return contFamilia;
		
	}

}
