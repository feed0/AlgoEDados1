public class c09ex11e {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = Math.pow(i, 2) * Math.sqrt( (i * 2) + 3);
			den = Math.pow(i + 1, i);
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie *= 2.0 / 3;
		System.out.println("\nSoma da série: " + serie);
	}

}
