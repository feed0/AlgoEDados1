import java.util.Scanner;
import java.text.DecimalFormat;
public class c10ex08 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c10ex08.class.getResourceAsStream("10 08.txt"));
		
		String cidade, menorCidade = null;
		int populacao, eleitores, homens, mulheres;
		
		int contCidades = 0, somaPopulacao = 0, somaEleitores = 0, contMaisMulheres = 0, 
				somaHomens = 0, menorPopulacao = 0;
		
	System.out.printf("%18s %12s %12s %12s %12s"
			, "CIDADE", "POPULAÇÃO", "ELEITORES", "HOMENS", "MULHERES");
		do {
			cidade = key.nextLine();
			contCidades ++;
				
			populacao = key.nextInt();
			eleitores = key.nextInt();
			somaPopulacao += populacao; somaEleitores += eleitores;
			if (contCidades == 1 || populacao < menorPopulacao) {
				menorPopulacao = populacao;
				menorCidade = cidade;
			}
			
			homens = key.nextInt();
			somaHomens += homens;
			mulheres = key.nextInt();
			if (mulheres > homens)
				contMaisMulheres ++;
			
			key.nextLine();
			
			System.out.printf("\n%18s %12d %12d %12d %12d"
					,cidade, populacao, eleitores, homens, mulheres);
			if (homens + mulheres != populacao)
				System.out.print(" DIFERE DA POPULAÇÃO !");
		} while (!cidade.equalsIgnoreCase("zimbabue de minas"));
		
		double percentEleitores, mediaHomens;
		percentEleitores = somaEleitores / (float) somaPopulacao;
		mediaHomens = somaHomens / (float) contCidades;
		
		DecimalFormat form = new DecimalFormat("#,##0.000");
		System.out.printf("\n"
				+ "\nTotal de cidade: %d"
				+ "\nPopulação total: %"
				+ "\nPercentual de eleitores: %.3f%"
				+ "\nCidades com mais homens que mulheres: %d"
				+ "\nMédia de homens: %.0f"
				+ "\nMenor população: %s"
				,contCidades, form.format(populacao), percentEleitores, contMaisMulheres, mediaHomens
				,menorCidade);
	}

}
