import java.util.Scanner;
public class C05Ex11 {
	// e02064
	public static void main(String[] args) {
		long numeroCheque;
		
		Scanner key = new Scanner(System.in);
		System.out.println("SEPARADOR DE D�GITOS DE CHEQUE BRANC�RIO \n");
		System.out.print("Digite o n�mero de 9 d�gitos do cheque: ");
		numeroCheque = key.nextLong();
		
		System.out.println();
		System.out.printf("%s %d \n%s %d \n%s %d", 
				"BANCO =", numeroCheque / 1000000,
				"AG�NCIA =", numeroCheque / 1000 % 1000,
				"SEQUENCIAL =", numeroCheque % 1000);
		key.close();
	}

}
