package AEDI12;
import java.util.Scanner;

public class c12ex11 {
	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex11.class.getResourceAsStream("12 11.txt"));
		
		String[] linha = new String[2];
		String[] nome = new String[50];
		double[] nota = new double[nome.length];
		for (int i = 0; i < nome.length; i ++) { // LEITURA MESMA LINHA
			linha = key.nextLine().split("/");
			nome[i] = linha[0];
			nota[i] = Double.valueOf(linha[1]);
		}
		
		String tempStr;
		double tempDbl;		
		for (int a = 0; a < nome.length - 1; a ++)  // ORDENACAO DECRESCENTE 
			for (int i = 0; i < nome.length - 1; i ++) 
				if (nota[i] < nota[i+1]) {
					tempStr = nome[i];
					nome[i] = nome[i+1];
					nome[i+1] = tempStr;
					
					tempDbl = nota[i];
					nota[i] = nota[i+1];
					nota[i+1] = tempDbl;
				}
	
		System.out.println("\tMAIOR NOTA: " + nome[0]); // MAIOR NOTA
		key.close();
		
	}
}
