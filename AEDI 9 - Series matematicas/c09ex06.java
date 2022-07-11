public class c09ex06 {

	public static void main(String[] args) {
		double num, den, serie = 0; 
		
		for (int i = 1; i <= 6; i ++) {
			num = (i * 5) - 2;
			den = (i * 6) + 1;
			serie += num / den;
		}
		
		System.out.println(serie);

	}

}
