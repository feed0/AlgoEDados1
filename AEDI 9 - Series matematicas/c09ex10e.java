public class c09ex10e {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = i;
			den = i * 6 ;
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		System.out.println("\nSoma da série: " + serie);
	}

}
