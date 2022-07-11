import java.util.Scanner;
public class c08ex30 {
	// SÉRIE MATEMÁTICA
	public static void main(String[] args) {
		double x, n;

		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga um valor para X: ");
		x = key.nextDouble();
		System.out.print("Diga um valor para N: ");
		n = key.nextDouble();
		
		double serie = Math.log(x);
		
		for (int i = 1; i <= n; i ++) {
			serie += Math.pow(x, i) / i;
		}
		
		System.out.println("\nSérie = " + serie);
		key.close();
	}
	
}
