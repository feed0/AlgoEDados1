import java.util.Scanner;
public class c09ex02 {

	public static void main(String[] args) {
		int reps;
		double num, den, serie = 0; 
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga o número de termos: ");
		reps = key.nextInt();
		
		for (int i = 1; i <= reps; i++) {
			num = i;
			den = Math.pow(i, 2) + ( i - 1);
			serie += num / den;
		}
		
		System.out.println(serie);
		
		key.close();
	}

}
