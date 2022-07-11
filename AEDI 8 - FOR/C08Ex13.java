import java.util.Scanner;
public class C08Ex13 {
	// PESQUISA IBGE CIDADES
	public static void main(String[] args) {
		String cidade, menorCidade = null;
		int populacao, eleitores, homens, mulheres,  populacaoMaior1Milhao = 0, mulheresMaiorHomens = 0, menorPopulacao = 0;
		boolean populacaoVsAdultos;
		double percentEleitores;
		
		Scanner key = new Scanner(
				C08Ex13.class.getResourceAsStream("c08ex13.txt"));
		
		
		System.out.printf("CIDADE \t\tPOPULAÇÃO \tELEITORES \tHOMENS \t\tMULHERES \tADULTOS != POP. \t%% ELEITORES" + "\n");
		
		for (int i = 1; i <= 5; i++) {
			
			cidade = key.nextLine();
			populacao = key.nextInt();
			eleitores = key.nextInt();
			homens = key.nextInt();
			mulheres = key.nextInt();
			key.nextLine();
			
			if (homens + mulheres != populacao) {
				populacaoVsAdultos = true;
			} else {
				populacaoVsAdultos = false;
			}
				
			percentEleitores = (float) eleitores / populacao * 100 ;
			
			if (populacao > Math.pow(10, 6) ) {
				populacaoMaior1Milhao ++;
			}
			
			if (mulheres > homens) {
				mulheresMaiorHomens ++;
			}
			
			if (i == 1 || populacao < menorPopulacao) {
				menorPopulacao = populacao;
				menorCidade = cidade;
			}
			
			System.out.printf("\n%8s \t%7d \t%7d \t%7d \t%7d \t%10s \t\t%.1f" ,
					cidade, populacao, eleitores, homens, mulheres, populacaoVsAdultos, percentEleitores);
			
		}
		
		System.out.println("\n\nPopulação acima de 1 milhão:       " + populacaoMaior1Milhao
				           + "\nMais mulheres que homens:          " + mulheresMaiorHomens
				           + "\nMenor cidade:                      " + menorCidade);
		
		key.close();

	}

}
