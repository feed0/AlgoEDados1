import java.util.Scanner;
public class C08Ex22 {
	// NUMERO PRIMO 
	public static void main(String[] args) {
		int numero, contDivisores = 0;
		double resto;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga um número inteiro maior que zero: ");
		numero = key.nextInt();
		System.out.println();
		
		for (int i = 1; i <= numero; i++) {
			resto = numero % i;
			if (resto == 0) {
				contDivisores ++;
			}
		}
		System.out.println("Número de divisores: " + contDivisores);
		if (contDivisores == 2)
			System.out.println("PRIMO");
		else if (contDivisores > 2)
			System.out.println("NÃO PRIMO");
		
		key.close();
	}

}
