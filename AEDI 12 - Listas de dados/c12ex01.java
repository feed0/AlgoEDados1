package AEDI12;
import java.util.Scanner;
public class c12ex01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex01.class.getResourceAsStream("12 01.txt"));
		
		int[] valores = new int[10];
		int contDivisiveis = 0;
		for (int i = 0; i < 10; i++) {
			valores[i] = key.nextInt();
			if (valores[i] % 5 == 0 && valores[i] % 7 == 0) 
				contDivisiveis ++;	
		}
		
		System.out.println("Número de divisíveis por 5 e 7: " + contDivisiveis);
		key.close();

	}
}
