package AEDI12;
import java.util.Scanner;
public class c12ex09 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex09.class.getResourceAsStream("12 09.txt"));
		
		int lista[] = new int[10];
		int soma = 0;
		for(int i = 0; i < lista.length; i++) {
			lista[i] = key.nextInt();
			soma += lista[i];
		}
		
		for (int i = 0; i < lista.length; i++) 
			if (soma % lista[i] == 0)
				System.out.println(lista[i]);
		
		key.close();

	}

}
