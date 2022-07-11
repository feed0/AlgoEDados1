public class c09ex11f {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = ( (i * 2) - 1 ) * Math.pow(2, i + 1);
			den = Math.pow( (i * 5) - 3, 2);
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie = 5 * Math.sqrt(serie);
		System.out.println("\nSoma da série: " + serie);
	}

}