import java.util.Scanner;
public class c10ex06 {

	public static void main(String[] args) {
		Scanner key = new Scanner(c10ex06.class.getResourceAsStream("10 06.txt"));
		
		double a, b, c, x0, y0;
		a = key.nextDouble();
		b = key.nextDouble();
		c = key.nextDouble();
		System.out.printf("A: %.2f  B: %.2f  C: %.2f \n__________________________"
				, a, b, c);
			
		double distancia = 0.1;
		do {
			
			x0 = key.nextDouble();
			y0 = key.nextDouble();
			
			distancia = ( ((a * x0) + (b * y0) + c) 
					/ Math.sqrt( (Math.pow(a, 2) + Math.pow(b, 2) )) );
			
			System.out.println("\nX0 = " + x0 + "\tY0 = " + y0
						+ "\nD = " + distancia);
			
			if (distancia == 0) {	
				System.out.println("COINCIDE !");
				break;
			}
			
		} while (distancia != 0);
		
		key.close();
		
	}

}
