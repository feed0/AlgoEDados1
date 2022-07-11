public class c09ex11a {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = (i * 8) - 6;
			den = Math.pow(4, i - 1) ;
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie = Math.cbrt(serie);
		System.out.println("\nSoma da série: " + serie);
	}

}
