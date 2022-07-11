package AEDI12;
import java.util.Arrays;
import java.util.Scanner;

public class c12ex18 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		// LEITURA PESSOAS
		System.out.println("Diga o nome das 10 pessoas: ");
		String[] pessoasFila = new String[10];
		for (int i = 0; i < pessoasFila.length; i++)
			pessoasFila[i] = key.nextLine();

		// ENTRA NOME A PESQUISAR
		System.out.println("Diga o nome da pessoa a pesquisar: ");
		String nomePesquisa = key.nextLine();
		boolean encontrado = false;
		
		// PROCURA COM FOR IF
		for (int i = 0; i < pessoasFila.length; i++)
			if (nomePesquisa.equalsIgnoreCase(pessoasFila[i])) {
				
				System.out.println("Posição de '" + nomePesquisa + "': " + (i + 1) );
				encontrado = true;
			
			}
		
		// PROCURA COM BINARY SEARCH
		int pos = Arrays.binarySearch(pessoasFila, nomePesquisa);
		System.out.println("Posicao: " + (pos + 1) );
		
		// IMPRIME NOME NAO ENCONTRADO
		if (encontrado == false)
			System.out.println("Não encontrado!");

		key.close();
	}

}
