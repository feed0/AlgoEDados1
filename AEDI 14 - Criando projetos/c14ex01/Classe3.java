package c14ex01;
public class Classe3 {

	public static void CalcularMedia() {
	
		long n1, n2, n3, soma;
		double media;
		
		System.out.print("Informe um número: ");
		n1 = c14ex01.in.nextLong();
		System.out.print("Informe outro número: ");
		n2 = c14ex01.in.nextLong();
		System.out.print("Informe mais um número: ");
		n3 = c14ex01.in.nextLong();
		
		soma = n1 + n2 + n3;
		media = soma / 3.0;
		
		System.out.printf("Média = %5.2f", media);
		
	}

}
