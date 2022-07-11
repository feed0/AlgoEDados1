package AEDI12;
import java.util.Scanner;
public class c12ex02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex02.class.getResourceAsStream("12 02.txt"));
		
		int[] valores = new int[10];
		for (int i = 0; i < 10; i++) {
			valores[i] = key.nextInt();
			if (valores[i] > 5 && valores[i] < 10) 
				System.out.println(valores[i]);	
		}
		
		key.close();
	}
}
