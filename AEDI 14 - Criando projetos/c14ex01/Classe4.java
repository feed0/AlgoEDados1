package c14ex01;
public class Classe4 {

	public static void CalcularFatorial() {
	
		System.out.print("Informe um número: ");
		long numero = c14ex01.in.nextLong();
		long fatorial = 1L;
		for(long contador = 2; contador <= numero; contador++) {
			fatorial = fatorial * contador;
		}
		System.out.println("Fatorial = " + fatorial);
		
	}
}
