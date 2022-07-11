import java.util.Scanner;
public class c09ex09 {

	public static void main(String[] args) {
		int reps;
		double num, den, serie = 0; 
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga o número de termos: ");
		reps = key.nextInt();
		
		for (int i = 1; i <= reps; i ++) {
			num = Math.pow(3, i + 1);
			den = (i + 9) * Math.sqrt( Math.pow(i, 4) );
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie = 100 - Math.pow(serie, 3);
		System.out.println("\n" + serie);
		
		key.close();

	}

}
