import java.util.Scanner;
public class c09ex03 {

	public static void main(String[] args) {
		int reps;
		double num, den, serie = 0; 

		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga o número de termos: ");
		reps = key.nextInt();
		
		for (int i = 1; i <= reps; i++) {
			num = 1 + Math.sqrt(i * 4);
			den = i * 3;
			serie += num / den;
		}
		
		System.out.println(serie);

		key.close();
	}

}
