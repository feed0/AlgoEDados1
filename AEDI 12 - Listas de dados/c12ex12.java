package AEDI12;
import java.util.Scanner;

public class c12ex12 {
	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex12.class.getResourceAsStream("12 12.txt"));
		
		String[] linha = new String[2];
		String[] nome = new String[8];
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
		
		for (int i = 0; i < nome.length; i ++) 
			if (nota[i] == nota[0])
				System.out.println(nome[i]);
		
		key.close();
	}
}
