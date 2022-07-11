package AEDI12;
import java.util.Scanner;
public class c12ex10 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex10.class.getResourceAsStream("12 10.txt"));
		
		String[] nome = new String[50], linha = new String[2];
		int[] nota = new int[nome.length];
		int soma = 0, cont = 0;
		for (int i = 0; i < nome.length; i++) {
			linha = key.nextLine().split("/");
			nome[i] = linha[0];
			nota[i] = Integer.valueOf(linha[1]);
			
			soma += nota[i];
			cont ++;
			
		}
		
		double media = soma / (float) cont;
		for (int i = 0; i < nome.length; i++) 
			if (nota[i] > media)
				System.out.println(nome[i]);
		
		key.close();
	}
}
