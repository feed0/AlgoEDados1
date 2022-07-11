package c14ex01;
import java.util.Scanner;

public class c14ex01 {

	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int opcao;
		
		do {
			
			System.out.println(
					"Escolha uma opção:"
					+ "\n 1 - Imprimir nome"
					+ "\n 2 - Calcular idade"
					+ "\n 3 - Calcular média"
					+ "\n 4 - Calcular fatorial"
					+ "\n 5 - Calcular hipotenusa"
					+ "\n 0 - SAIR"
					);
			
			opcao = in.nextInt();
		
			switch (opcao) {
			
			case 1: Classe1.ImprimirNome(); break;
			case 2: Classe2.CalcularIdade(); break;
			case 3: Classe3.CalcularMedia(); break;
			case 4: Classe4.CalcularFatorial(); break;
			case 5: Classe5.CalcularHipotenusa(); break;
			
			case 0: break;
			
			default: System.out.println("INVÁLIDO"); break;
			
			}
			
			System.out.println("\n");
			
		} while (opcao != 0);

		System.out.println("\nFIM");
		in.close();
		
	}

}
