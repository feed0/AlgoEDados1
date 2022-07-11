public class C08Ex24 {
	// 1/3 x 2¹ + 2³ ....
	public static void main(String[] args) {
		double termo, soma = 0;
		
		for (int i = 1; i <= 99; i += 2) {
			termo = Math.pow(2, i);
			soma += termo;
			
		}
		System.out.printf("Soma = %.0f", soma / 3);

	}

}
