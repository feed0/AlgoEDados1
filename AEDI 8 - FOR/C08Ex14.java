import java.util.Scanner;
public class C08Ex14 {
	// MATRIZ COM SÍMBOLOS
	public static void main(String[] args) {
		String simbolo;
		int numero;
		
		Scanner key = new Scanner(
				C08Ex14.class.getResourceAsStream("C08Ex14fonte.txt"));
		
		simbolo = key.nextLine();
		numero = key.nextInt();
		
		System.out.printf("Símbolo: " + simbolo +
					    "\nMatriz: " + numero + " x " + numero +
					    "\n");
		
		for (int k = 1; k <= numero; k++) {
			System.out.printf("\n");
			for (int i = 1; i <= numero; i++) {
				System.out.printf(simbolo);
			}
			
		}
	}

}
