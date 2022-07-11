import java.util.Scanner;
public class C05Ex11 {
	// e02064
	public static void main(String[] args) {
		long numeroCheque;
		
		Scanner key = new Scanner(System.in);
		System.out.println("SEPARADOR DE DÍGITOS DE CHEQUE BRANCÁRIO \n");
		System.out.print("Digite o número de 9 dígitos do cheque: ");
		numeroCheque = key.nextLong();
		
		System.out.println();
		System.out.printf("%s %d \n%s %d \n%s %d", 
				"BANCO =", numeroCheque / 1000000,
				"AGÊNCIA =", numeroCheque / 1000 % 1000,
				"SEQUENCIAL =", numeroCheque % 1000);
		key.close();
	}

}
