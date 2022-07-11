package AEDI12;
import java.util.Scanner;
public class c12ex05 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex05.class.getResourceAsStream("12 05.txt"));
		
		int[] lista = new int[10];
		int maiorValor = 0;
		for (int i = 0; i < 10; i++) {
			lista[i] = key.nextInt();
			if (i == 0 || lista[i] > maiorValor)
				maiorValor = lista[i];
		}
		
		System.out.println(maiorValor);
		key.close();
	}

}
