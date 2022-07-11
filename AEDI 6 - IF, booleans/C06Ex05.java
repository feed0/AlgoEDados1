import java.util.Scanner;
public class C06Ex05 {
	// e02064
	public static void main(String[] args) {
		long numeroInteiro;
		String divisibilidade;
		
		Scanner key = new Scanner(System.in);
		System.out.println("É DIVISÍVEL POR 5 E 7 AO MESMO TEMPO? \n");
		System.out.print("Digite o número inteiro: ");
		numeroInteiro = key.nextInt();
		
		if (numeroInteiro % 5 == 0 && numeroInteiro % 7 == 0) 
			divisibilidade = " é divisível simultaneamente por 5 e 7";
		else 
			divisibilidade = " NÃO é divisível simultaneamente por  5 e 7";
		
		System.out.println(numeroInteiro + divisibilidade);
		key.close();
	}
}
