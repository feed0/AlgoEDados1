public class c09ex12 {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 20000; i += 2) {
			num = 1;
			den = (i * 2) - 1;
			serie += num / den;
			
			den = -1 * ( (i *2) + 1 );
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie *= 4;
		System.out.println("\nSoma da série: " + serie);
	}

}