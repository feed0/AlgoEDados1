
public class c08ex28 {

	public static void main(String[] args) {
		int i, soma = 0;
		double triangular, media; 
		
		for (i = 1; i * (i + 1) * (i + 2) <= 1000; i++) {
			triangular = i * (i + 1) * (i + 2);
			soma += triangular;
			System.out.printf("Triangular %d = %.0f\n", i, triangular);
		}
		
		if (i > 0) {
			media = soma / (i - 1);
			System.out.println("\nMédia = " + media);
		}
		
	}

}
