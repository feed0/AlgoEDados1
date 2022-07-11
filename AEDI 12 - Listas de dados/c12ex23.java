package AEDI12;
import java.util.Scanner;

public class c12ex23 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String[] placas = new String[100], donos = new String[placas.length];

		// ENTRA PLACA E DONO
		for (int i = 0; i < placas.length; i++) {

			System.out.print("Diga a placa da vaga " + (i + 1) + ": ");
			placas[i] = in.nextLine();
			System.out.print("Diga o dono da vaga " + (i + 1) + ": ");
			donos[i] = in.nextLine();

		}

		// PESQUISA
		System.out.println("Diga a placa ou dono a pesquisar: ");
		String pesquisa = in.nextLine();

		for (int i = 0; i < placas.length; i++) {
			
			// SE PESQUISA IGUAL PLACA OU DONO
			if (pesquisa.equals(placas[i]) || pesquisa.equals(donos[i]))
				System.out.println("Vaga: " + (i + 1));

		}

		in.close();

	}

}
