package AEDI12;
import java.util.Scanner;
public class c12ex08 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex08.class.getResourceAsStream("12 08.txt"));
		
		int lista[] = new int[20];
		for (int i = 0; i < lista.length; i++) 
			lista[i] = key.nextInt();
		
		for (int i = 0; i < 10; i++) 
			System.out.println(lista[i] + lista[i + 10]);
		
		key.close();
	}

}
