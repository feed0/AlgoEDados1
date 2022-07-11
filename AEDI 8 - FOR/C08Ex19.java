public class C08Ex19 {
	// 100 PRIMEIROS DA PROGRESSÃO
	public static void main(String[] args) {
		double termo, soma = 0;
						
		for (int i = 1; i <= 100; i++) {
			termo = Math.pow(i, 2);
			soma += termo;
			
			System.out.printf("%3d termo = %.0f\n", i, termo);
		}
		System.out.printf("\nSoma = %.0f", soma);
	}
	

}
