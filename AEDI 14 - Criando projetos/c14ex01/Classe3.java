package c14ex01;
public class Classe3 {

	public static void CalcularMedia() {
	
		long n1, n2, n3, soma;
		double media;
		
		System.out.print("Informe um n�mero: ");
		n1 = c14ex01.in.nextLong();
		System.out.print("Informe outro n�mero: ");
		n2 = c14ex01.in.nextLong();
		System.out.print("Informe mais um n�mero: ");
		n3 = c14ex01.in.nextLong();
		
		soma = n1 + n2 + n3;
		media = soma / 3.0;
		
		System.out.printf("M�dia = %5.2f", media);
		
	}

}
