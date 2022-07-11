import java.util.Scanner;
public class C08Ex17 {
	// f(x) | 3 <= x <= 12
	public static void main(String[] args) {
		double fx;
		
		Scanner key = new Scanner(System.in);
		
		for (int i = 3; i <= 12; i ++) {
			fx = Math.sqrt( Math.pow(i, 2) - 3);
			
			System.out.printf("\nf(%d) = %.4f", i, fx);
		}
		key.close();
	}

}
