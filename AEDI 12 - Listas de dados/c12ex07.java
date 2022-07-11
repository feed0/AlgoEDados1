package AEDI12;
import java.util.Scanner;
public class c12ex07 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex07.class.getResourceAsStream("12 07.txt"));
		
		System.out.printf("%12s %12s", "ALUNO", "NOTA");
		
		String linha[] = new String[2]; // LEITURA NUMA LINHA ALUNO E NOTA
		String aluno[] = new String[50];
		double nota[] = new double[50];
		char conceito[] = new char[50];
		for (int i = 0; i < aluno.length; i++) {
			linha = key.nextLine().split(" ");
			
			aluno[i] = linha[0];
			nota[i] = Double.valueOf(linha[1]);
			
			if (nota[i] <= 30)
				conceito[i] = 'D';
			else if (nota[i] <= 60)
				conceito[i] = 'C';
			else if (nota[i] <= 80)
				conceito[i] = 'B';
			else 
				conceito[i] = 'A';
			
			System.out.printf("\n%12s %10s", aluno[i], conceito[i]);
		}
		key.close();
		
	}

}
