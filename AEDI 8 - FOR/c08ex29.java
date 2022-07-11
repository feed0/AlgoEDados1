import java.util.Scanner;
public class c08ex29 {

	public static void main(String[] args) {
		int x, y;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga um valor INTEIRO para X: ");
		x = key.nextInt();
		System.out.print("Diga um valor INTEIRO para Y: ");
		y = key.nextInt();
		
		System.out.println("\nX: " + x + " e Y: " + y);
		
		double exp = 1;
		
		for (int i = 1; i <= y; i ++) {
			exp *= x;
			 
		}
		System.out.printf("\nf(%d) = %.2f", x, exp );
		key.close();
	}

}
