import java.util.Scanner;
public class c10ex02 {

	public static void main(String[] args) {
		double valor, soma = 0;
		int cont = 0, cont1k = 0;
		
		Scanner key = new Scanner(
				c10ex02.class.getResourceAsStream("10 02.txt"));
		
		do {
			valor = key.nextDouble();
			System.out.print("Valor: " + valor + "\n");
			if (valor == 0)
				break;
			soma += valor;
			cont ++;
			if (valor >= 1000)
				cont1k ++;
		} while (key.hasNextLine() && valor != 0);
		
		double media = soma / cont; 
		
		System.out.printf(
				    "               Total: %.2f"
				+ "\n               Média: %.2f"
				+ "\nAcima de R$ 1.000,00: %d"
				, soma, media, cont1k);
	}

}
