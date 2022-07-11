public class c09ex10d {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = (i * 2) - 1;
			den = Math.pow(i, 2) ;
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		System.out.println("\nSoma da série: " + serie);
	}

}
