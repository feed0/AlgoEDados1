import java.util.Scanner;
public class C08Ex01 {
	// e02064
	// ÁREA DE 10 CÍRCULOS
	public static void main(String[] args) {
		double raioCirculo, pi = 3.1416, areaCirculo;
		
		Scanner key = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%s %d%s", "Digite o raio do círculo", i, ": ");
			raioCirculo = key.nextDouble();
			areaCirculo = Math.pow(raioCirculo, 2) * pi;
			System.out.printf("%s %d %s %.2f \n%s","Área do círculo", i, "=", areaCirculo, "");
			System.out.println();
		}
		key.close();
	}

}
