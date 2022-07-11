public class c09ex13 {

	public static void main(String[] args) {
		double num = 1, den, serie = 0; 
		
		for (int i = 1; i <= 10; i += 2) {
			
			num = 1; // RESET
			for (int k = 1; k <= i; k ++) {
				num *= k;	
			}
			
			den = Math.pow(2, i) - 1;
			serie += num / den;
			
			System.out.printf("%3d° ... %20.0f / %.0f \n", i, num, den);
			
			num *= -1 * (i + 1);
			den = Math.pow(2, (i + 1)) - 1;
			serie += num / den;
			
			System.out.printf("%3d° ... %20.0f / %.0f \n", i + 1, num, den);
		}
		

		System.out.println("\nSoma da série: " + serie);
	}

}