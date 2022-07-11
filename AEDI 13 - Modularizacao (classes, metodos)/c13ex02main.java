package AEDI13;
import java.util.Scanner;

public class c13ex02main {

	// GLOBAIS
	static double x;

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		// ENTRADA X
		do {

			System.out.println("Diga x: ");
			x = key.nextDouble();
			if (x == -1)
				break;
			System.out.printf("%.4f \n", c13ex02.Funcao(x));

		} while (x != -1);

		key.close();

	}

}
