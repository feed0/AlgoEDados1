package AEDI12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// COLLECTIONS BINARY SEARCH
import java.util.Collections;

public class c12ex28 {
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		// DECLARAÇÃO DUAS LISTAS
		List<String> ra = new ArrayList<String>();
		List<String> nome = new ArrayList<String>();

		// PREENCHIMENTO LISTAS
		System.out.println("Diga 50 RAs e os nomes dos respectivos alunos: ");
		for (int i = 0; i < 4; i++) {

			ra.add(key.nextLine());
			nome.add(key.nextLine());

		}

		// BOLHA NOMES
		String temp;
		for (int i = 0; i < nome.size() - 1; i++) {
			
			for (int x = 0; x < nome.size() - 1; x++)
				if (nome.get(x).compareToIgnoreCase(nome.get(x + 1) ) > 0) {

					temp = nome.get(x);
					nome.set(x, nome.get(x + 1));
					nome.set(x + 1, temp);

					temp = ra.get(x);
					ra.set(x, ra.get(x + 1));
					ra.set(x + 1, temp);

				}
		}
		
		// NOME A PROCURAR
		System.out.println("Diga o nome a procurar: ");
		String nomeProcura = key.nextLine();
		
		// POSICAO DO ALUNO
		int posicao = 1 + Collections.binarySearch(nome, nomeProcura);
		System.out.println("Posição do aluno " + nomeProcura + ": " + posicao);
		
		key.close();

	}
}
