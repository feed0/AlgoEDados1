public class c09ex07 {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 20; i ++) {
			num = i;
			den = Math.sqrt(i * 2);
			serie += num / den;
		}
		
		serie = 10 + serie;
		System.out.println(serie);

	}

}
