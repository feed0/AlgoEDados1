import java.util.Scanner;
public class C08Ex06 {
	// PAR OU IMPAR, SOMA DOS DIVISIVEIS POR 4 E SOMA DOS DIVISIVEIS POR 3
	public static void main(String[] args) {
		int numero, rep, countDivisel3 = 0, somaDivisivel4 = 0;
		
		Scanner key = new Scanner (
				C08Ex06.class.getResourceAsStream("C08Ex06fonte.txt"));
		
		rep = key.nextInt();
		System.out.print("Quantidade de n�meros a serem avaliados: " + rep + "\n\n");
				
		for (int i = 1; i <= rep; i++) {
			numero = key.nextInt();
			System.out.print(i + "�: " + numero);
			
			if (numero % 2 == 0) {
				System.out.println(" -- Esse n�mero � PAR!");
				if (numero % 4 == 0)
					somaDivisivel4 += numero;
			}
			else {
				System.out.println(" -- Esse n�mero � �MPAR!");
			}
			
			if (numero % 3 == 0)
				countDivisel3++;
				
		}
		
		System.out.println("\nSoma dos divis�veis por 4:   " + somaDivisivel4 + 
				 "\nContador de divis�veis por 3:  " + countDivisel3);
		
		key.close();
	}

}