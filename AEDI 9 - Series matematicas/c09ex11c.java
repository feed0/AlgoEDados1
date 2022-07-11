public class c09ex11c {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = ( (i * 2) + 1 ) 
					* ( Math.sqrt( (i * 4) + 1 ) );
			den = Math.pow(5, i);
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie *= serie;
		System.out.println("\nSoma da série: " + serie);
	}

}
