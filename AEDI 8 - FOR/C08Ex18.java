import java.util.Scanner;
public class C08Ex18 {
	 // TABUADA COM INPUT 1...9
	public static void main(String[] args) {
		int numero, fx;

		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga um número: ");
		numero = key.nextInt(); 
				
		for (int i = 1; i <= 9; i++ ) {
			fx = numero * i;
			System.out.printf("\n%d x %d = %d ", i, numero, fx );
		}
		
		key.close();
	}

}
