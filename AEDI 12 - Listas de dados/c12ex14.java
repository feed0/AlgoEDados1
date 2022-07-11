package AEDI12;
import java.util.Scanner;

public class c12ex14 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex14.class.getResourceAsStream("12 14.txt"));
		System.out.printf("%14s %14s %14s\n", "CIDADE", "POPULA플O", "ESTADO");

		String[] cidade = new String[100], estado = new String[cidade.length];
		int[] populacao = new int[cidade.length];
		for (int i = 0; i < cidade.length; i ++) { // ATRIBUI플O
			cidade[i] = key.nextLine();
			populacao[i] = key.nextInt();
			key.nextLine();
			estado[i] = key.nextLine();
			System.out.printf("\n%14s %14d %14s", cidade[i], populacao[i], estado[i]);
		}
		
		String tempStr;
		int tempInt;
		for (int a = 0; a < cidade.length - 1; a ++)  // ORDENA플O
			for (int i = 0; i < cidade.length - 1; i ++) 
				if (populacao[i] < populacao[i+1]) {
					
					tempInt = populacao[i];
					populacao[i] = populacao[i+1];
					populacao[i+1] = tempInt;
					
					tempStr = cidade[i];
					cidade[i] = cidade[i+1];
					cidade[i+1] = tempStr;
					
					tempStr = estado[i];
					estado[i] = estado[i+1];
					estado[i+1] = tempStr;
				}
		
		System.out.println("\n\n\tREORDENADO");
		System.out.printf("%14s %14s %14s\n", "CIDADE", "POPULA플O", "ESTADO");
		
		for (int i = 0; i < 10; i ++)  // IMPRIME 10 MAIORES
			System.out.printf("\n%14s %14d %14s", cidade[i], populacao[i], estado[i]);
		
		key.close();
	}
}
