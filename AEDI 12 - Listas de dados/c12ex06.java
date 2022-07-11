package AEDI12;
import java.util.Scanner;
public class c12ex06 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c12ex06.class.getResourceAsStream("12 06.txt"));
		
		String[] meses = new String[12];
		for (int i = 0; i < meses.length; i ++) 
			meses[i] = key.nextLine();
		
		
		for (int i = meses.length - 1; i >= 0; i --) 
			System.out.println(meses[i]);
		
		key.close();
		
	}
}
