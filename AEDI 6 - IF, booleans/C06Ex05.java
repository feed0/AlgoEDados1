import java.util.Scanner;
public class C06Ex05 {
	// e02064
	public static void main(String[] args) {
		long numeroInteiro;
		String divisibilidade;
		
		Scanner key = new Scanner(System.in);
		System.out.println("� DIVIS�VEL POR 5 E 7 AO MESMO TEMPO? \n");
		System.out.print("Digite o n�mero inteiro: ");
		numeroInteiro = key.nextInt();
		
		if (numeroInteiro % 5 == 0 && numeroInteiro % 7 == 0) 
			divisibilidade = " � divis�vel simultaneamente por 5 e 7";
		else 
			divisibilidade = " N�O � divis�vel simultaneamente por  5 e 7";
		
		System.out.println(numeroInteiro + divisibilidade);
		key.close();
	}
}
