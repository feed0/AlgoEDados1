import java.util.Scanner;
public class C08Ex01 {
	// e02064
	// �REA DE 10 C�RCULOS
	public static void main(String[] args) {
		double raioCirculo, pi = 3.1416, areaCirculo;
		
		Scanner key = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s %d%s", "Digite o raio do c�rculo", i, ": ");
			raioCirculo = key.nextDouble();
			areaCirculo = Math.pow(raioCirculo, 2) * pi;
			System.out.printf("%s %d %s %.2f \n%s","�rea do c�rculo", i, "=", areaCirculo, "");
			System.out.println();
		}
		key.close();
	}

}
