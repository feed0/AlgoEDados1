import java.util.Scanner;
public class C08Ex21 {
	// IMC
	public static void main(String[] args) {
		String[] situacao = {"abaixo do peso", "peso ideal", "acima do peso"};
		double altura, imc;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga sua altura: ");
		altura = key.nextDouble();
		System.out.println();
		
		System.out.printf("\tPESO \tIMC \tSITUAÇÃO");
		
		for (int i = 60; i <= 100; i++) {
			imc = i / Math.pow(altura, 2);
			System.out.printf("\n\t%d \t%.2f ", i, imc);
			if (imc < 20)
				System.out.printf("\t%s", situacao[0]);
			else if (imc <= 25)
				System.out.printf("\t%s", situacao[1]);
			else {
				System.out.printf("\t%s", situacao[2]);
			}
		}
		key.close();
	}

}
