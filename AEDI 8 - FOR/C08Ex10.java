import java.util.Scanner;
public class C08Ex10 {
	// CUSTO TOTAL DE UM PROJETO
	public static void main(String[] args) {
		String nomeInsumo, insumoMaisCaro = null;
		double precoUnitario, custoParcial, somatorioCustos = 0, maiorCustoParcial = 0;
		int reps, quantidadeConsumida;
		
		Scanner key = new Scanner(
				C08Ex10.class.getResourceAsStream("c08ex10.txt"));
		
		reps = key.nextInt();
		System.out.println("Tipos de insumo: " + reps + "\n");
		key.nextLine();
		
		for (int i = 1; i <= reps; i++) {
			nomeInsumo = key.nextLine();
			quantidadeConsumida = key.nextInt();
			precoUnitario = key.nextDouble();
			key.nextLine();
			
			custoParcial = precoUnitario * quantidadeConsumida;
			somatorioCustos += custoParcial;
			
			if (i == 1 || custoParcial > maiorCustoParcial) {
				maiorCustoParcial = custoParcial;
				insumoMaisCaro = nomeInsumo;
			}
			
			System.out.printf(
					  "Tipo:         %s" +
					"%nPreço:        %.2f" + 
					"%nQuantidade:   %d" + " \tCUSTO PARCIAL = %.2f" +
					"%n%n",
					nomeInsumo, precoUnitario, quantidadeConsumida, custoParcial);
		}
		
		if (reps > 0) {
			double media = somatorioCustos / reps;
			System.out.printf(
					"%n___________________ANÁLISE___________________" +
					"%nCusto total:         %.2f" +
					"%nMédia:               %.2f" +
					"%nInsumo mais caro:    %s",
					somatorioCustos, media, insumoMaisCaro);
		}
		else
			System.out.println("Nenhum insumo !");
		
		key.close();
	}

}
