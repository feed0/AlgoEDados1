public class C08Ex16 {
	// M�DIA �MPARES ENTRE 1000 E 2000
	public static void main(String[] args) {
		int somaImpares = 0, contImpares = 0;
		
		for (int i = 1000; i <= 2000; i++) {
			
			if (i % 2 != 0) {
				contImpares ++;
				somaImpares += i;
			}
		}
		System.out.printf("N�mero de �mpares: " + contImpares +
				        "\n             Soma: " + somaImpares / contImpares);
	}

}
