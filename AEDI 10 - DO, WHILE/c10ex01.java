import java.util.Scanner;
public class c10ex01 {

	public static void main(String[] args) {
		double valor, multa = 0, media, soma = 0;
		int cont = 0;
		
		Scanner key = new Scanner(System.in);
		
		do {
			System.out.print("Diga valor: ");
			valor = key.nextDouble();
			
			if (valor == -1)
				break;
			multa = valor * 0.1;
			soma += multa;
			cont ++;
		} while (valor != -1);
		
		if (cont > 0) {
			media = soma / cont;
			System.out.printf("Média multas: %.2f", media);
		}
		
		key.close();
	}

}
