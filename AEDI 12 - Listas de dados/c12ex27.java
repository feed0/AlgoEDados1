package AEDI12;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class c12ex27 {
	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex27.class.getResourceAsStream("12 27.txt"));
		Scanner key2 = new Scanner(System.in);
		
		// DECLARAÇÃO DUAS LISTAS
		List<String> cpf = new ArrayList<String>();
		List<String> endereco = new ArrayList<String>();

		// PREENCHIMENTO TXT
		while (key.hasNextLine()) {
			cpf.add(key.nextLine());
			endereco.add(key.nextLine());
		}
		
		// ENTRA CPF A PESQUISAR CONSOLE
		System.out.println("Diga um CPF: ");
		String cpfPesquisa = key2.nextLine();
		
		// PROCURAR CPF
		int posicao = -1;
		for (int i = 0; i < cpf.size(); i ++) 
			
			// CASO ACHE O CPF
			if (cpf.get(i).equalsIgnoreCase(cpfPesquisa)) {
				System.out.println("Quer alterar(A) ou excluir(E) o CPF/endereço? ");
				String resposta = key2.nextLine();
				posicao = i;
				
				// ALTERAR ENDERECO
				if (resposta.equalsIgnoreCase("a") || resposta.equalsIgnoreCase("alterar")) {
					System.out.println("Diga o novo endereço: ");
					String novoEndereco = key2.nextLine();
					endereco.set(i, novoEndereco);
				}
				
				// EXCLUIR CPF E ENDERECO
				else {
					cpf.remove(i);
					endereco.remove(i);
				}
			} 
		
		// CASO NÃO ACHE O CPF
		if (posicao < 0)
			System.out.println("CPF não encontrado!");

		
		// IMPRESSÃO FINAL
		for (int i = 0; i < cpf.size(); i ++) 
			System.out.println(cpf.get(i) + " " + endereco.get(i));
		
		key.close();
		key2.close();
	}
}
