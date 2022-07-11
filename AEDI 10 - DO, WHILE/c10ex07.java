import java. util.Scanner;
public class c10ex07 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("Diga o tamanho da população: ");
		int populacao;
		populacao = key.nextInt();
		
		int dias = 0;
		double infectados;
		do {
			dias ++;
			infectados = Math.pow(1.003, dias);
			
			if (infectados >= populacao)
				break;
			
		} while (infectados < populacao);
		
		System.out.printf("\nPopulação infectadas após %d dias: %.0f", dias, infectados);
		
		int anos, meses;
		anos = dias / 365;
		dias -= anos * 365;
		meses = dias / 30;
		dias -= meses * 30;
		
		System.out.printf("\nAnos: %d, Meses: %d, Dias: %d", anos, meses, dias);
		
		key.close();
	}

}
