package AEDI12;
import java.util.Arrays;
import java.util.Scanner;

public class c12ex25 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// 20 EQUIPES E SUAS PONTUACOES
		String[] equipes = new String[20];
		int[] pontuacao = new int[equipes.length];

		System.out.println("Diga 20 equipes e sua pontuações: ");
		for (int i = 0; i < equipes.length; i++) {

			// ENTRA EQUIPES E PONTUACAO
			equipes[i] = in.nextLine();
			pontuacao[i] = in.nextInt();
			in.nextLine();

		}

		// ORDENACAO DECRESCENTE, 
		int temp;
		String tempStr;

		for (int i = 0; i < equipes.length - 1; i++) {
			
			for (int x = 0; x < equipes.length - 1; x++)
				if (pontuacao[x] < pontuacao[x + 1]) {

					temp = pontuacao[x];
					pontuacao[x] = pontuacao[x + 1];
					pontuacao[x + 1] = temp;

					tempStr = equipes[x];
					equipes[x] = equipes[x + 1];
					equipes[x + 1] = tempStr;

				}
		}
		
		// PESQUISA COM FOR IF
		System.out.println("Diga uma equipe: ");
		String procura = in.nextLine();
		int procuraPos = -1;
		
		for (int i=0; i<equipes.length; i++) {
			
			if (equipes[i].equalsIgnoreCase(procura)) {
			
				System.out.println("Posição: " + (i+1));
				procuraPos = i + 1;
				
			}
		}
		
		// SE NAO ACHAR, PROCURPOS = -1
		if (procuraPos != -1) {
			
			if (procuraPos <= 4)
				System.out.println("Libertadores");
			else if (procuraPos <= 12)
				System.out.println("Sul-americana");
			else
				System.out.println("Rebaixada");
			
		}
		
		// PESQUISA COM BINARY SERACH
		int pos = Arrays.binarySearch(equipes, procura);
		System.out.println("Posição na tabela: "  + ( pos + 1 ) );
		
		in.close();

	}

}
