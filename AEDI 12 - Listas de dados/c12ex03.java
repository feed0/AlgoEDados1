package AEDI12;
import java.util.Scanner;
public class c12ex03 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex03.class.getResourceAsStream("12 03.txt"));
		
		int[] lista = new int[10];
		for (int i = 0; i < 10; i++) {
			lista[i] = key.nextInt();
			if (34 % lista[i] == 0) 
				System.out.print(lista[i] + "\n");
		}
		
		key.close();
	}
}
