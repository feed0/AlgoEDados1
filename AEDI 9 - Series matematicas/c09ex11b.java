public class c09ex11b {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = (i * 3) - 2;
			den = Math.sqrt( (i * 3) + 4 ) ;
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie *= 5.0 / 3;
		System.out.println("\nSoma da série: " + serie);
	}

}
