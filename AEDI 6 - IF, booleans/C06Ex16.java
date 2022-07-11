import java.util.Scanner;

import javax.swing.JOptionPane;
public class C06Ex16 {
	// e02064
	// ESCOLA DE LÍNGUAS
	public static void main(String[] args) {
		int faltas, idade;
		double prova1, prova2, prova3, trabalho, media = 0, trabalhoFinal;
		String resultado;
		
		Scanner key = new Scanner(
				C06Ex16.class.getResourceAsStream("C06Ex16fonte.txt"));
		faltas = key.nextInt();
		prova1 = key.nextDouble();
		prova2 = key.nextDouble();
		prova3 = key.nextDouble();
		trabalho = key.nextDouble();
		idade = key.nextInt();
		
		if (prova1 + prova2 > prova3 * 2) 
			media = ( prova1 + prova2 ) / 2;
		else if (prova1 + prova3 > prova2 * 2)
			media = ( prova1 + prova3 ) / 2;
		else if (prova2 + prova3 > prova1 * 2)
			media = ( prova2 + prova3 ) / 2;
		
		if (faltas <= 5)
			media *= 3;
		else if (faltas <= 10)
			media *= 2;
		
		if (idade <= 17)
			trabalhoFinal = trabalho;
			else if ( idade <= 50)
				trabalhoFinal = trabalho * 2;
			else trabalhoFinal = trabalho * 3;

		double notaFinal = media + trabalhoFinal;
		
		if (notaFinal <= 50)
			resultado = "REPROVADO";
		else if (notaFinal <= 70)
			resultado = "REGULAR";
		else if (notaFinal <= 80)
			resultado = "BOM";
		else if (notaFinal <= 90)
			resultado = "MUITO BOM";
		else resultado = "EXCELENTE";
		
		JOptionPane.showMessageDialog(null,
				  "NOTA FINAL:              " + notaFinal
				+ "\nRESULTADO:             " + resultado,
				"ESCOLA DE LÍNGUAS",
				JOptionPane.INFORMATION_MESSAGE);
		
		key.close();
			
	}

}
