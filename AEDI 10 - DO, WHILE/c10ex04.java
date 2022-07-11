import java.util.Scanner;
public class c10ex04 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(c10ex04.class.getResourceAsStream("10 04.txt") );
		
		double taxaBDI = key.nextDouble() / 100;
		
		String nome;
		int quantidade;
		double preco, soma = 0;
		
		System.out.printf("\t%10s \t%10s \t%10s", "NOME", "QUANTIDADE", "PREÇO");
		System.out.println("\n");
		do {
			key.nextLine();
			nome = key.nextLine();
			if (nome.equalsIgnoreCase("FIM"))
				break;
			quantidade = key.nextInt();
			preco = key.nextDouble();
			
			soma += quantidade * preco;
			
			System.out.printf(
					  "\t%10s \t%8d \tR$ %10.2f"
					+ "\n"
					, nome, quantidade, preco);
			
		} while (!nome.equalsIgnoreCase("FIM"));
		
		double bonificacao, precoFinal;
		bonificacao = soma * taxaBDI;
		precoFinal = soma + bonificacao;
		
		System.out.println("\n" + "\t--ANÁLISE--");
		System.out.printf("\tCusto total = \tR$ %.2f"
				+ "\n\tBDI (%.2f) = \tR$ %.2f"
				+ "\n\tPreço final = \tR$ %.2f"
				, soma, taxaBDI, bonificacao, precoFinal);
		
		key.close();
		
	}

}
