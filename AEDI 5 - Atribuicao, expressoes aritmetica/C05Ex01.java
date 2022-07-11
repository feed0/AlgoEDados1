import java.util.Scanner;
public class C05Ex01 {
	// e02064
	public static void main(String[] args) {

		double variavel, ordenada;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Informe a variável para calcular f(x) = x³ + 4x + 10: ");
		variavel = key.nextDouble();
		
		ordenada = Math.pow(variavel,3.0) + (4.0*variavel) + 10;
		
		System.out.printf("Resultado: %5.2f", ordenada);
		key.close();
	}

}
