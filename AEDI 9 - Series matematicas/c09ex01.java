
public class c09ex01 {

	public static void main(String[] args) {

		double num, den, serie = 0;
		
		for (int i = 1; i <= 37; i++) {
			num = ( 38 - i ) * ( 39 - i);
			den = i;
			serie += num / den;
		}
		
		System.out.println(serie);

	}

}
