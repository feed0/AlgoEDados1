package AEDI12;
import java.util.Scanner;
public class c12ex04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex04.class.getResourceAsStream("12 04.txt"));
		
		int[] lista = new int[10];
		for (int i = 0; i < 10; i++) {
			lista[i] = key.nextInt();
			System.out.printf("%.0f \n", Math.pow(lista[i], 2));	
		}
		
		key.close();
	}
}
