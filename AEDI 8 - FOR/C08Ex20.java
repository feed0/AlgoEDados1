import java.util.Scanner;
public class C08Ex20 {
	// N PRIMEIROS TERMOS DE PROGRESSAO GEOMERTICA
	public static void main(String[] args) {
		int reps;
		double termo, soma = 0;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga o número de termos: ");
		reps = key.nextInt();
		System.out.println();
		
		for (int i = 1; i <= reps; i++) {
			termo = Math.pow(2, i - 1);
			soma += termo;
			System.out.printf("%d termo: %.0f\n", i, termo);
		}
		System.out.printf("\nSoma dos %d primeiros termos: %.0f", reps, soma);
		key.close();
	}
}