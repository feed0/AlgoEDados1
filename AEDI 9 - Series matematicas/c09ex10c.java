public class c09ex10c {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = (i * 2) - 1;
			den = (i * 2) ;
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie = 1.0 / 3 * Math.pow(serie, 2);
		System.out.println("\nSoma da série: " + serie);
	}

}
