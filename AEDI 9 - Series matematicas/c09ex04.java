import java.util.Scanner;
public class c09ex04 {

	public static void main(String[] args) {
		int reps;
		double num, den, serie = 0; 

		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga o número de termos: ");
		reps = key.nextInt();
		
		for (int i = 1; i <= reps * 4; i += 4) {
			num = i * (i + 1);
			den = (i + 2) * (i + 3);
			serie += num / den;
		}
		
		serie = Math.sqrt(serie);
		System.out.println(serie);

		key.close();
	}

}
