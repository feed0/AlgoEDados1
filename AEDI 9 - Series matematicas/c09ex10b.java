public class c09ex10b {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 100; i ++) {
			num = i * 2;
			den = i * 3;
			serie += num / den;
			
			System.out.println(i + " " + num + " / " + den);
		}
		
		serie = 1 + Math.sqrt(serie);
		System.out.println("\nSoma da s�rie: " + serie);
	}

}
