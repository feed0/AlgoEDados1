import java.util.Scanner;
public class C06Ex12 {
	// e02064
	// PRODU��O DE BOLAS DE FUTEBOL
	public static void main(String[] args) {
		int numeroBolas, defeituosas, mesesAteCopa; 
		double precoCaixaPapelao, valorAluguel;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Digite o n�mero de bolas produzidas: ");
		numeroBolas = key.nextInt();
		System.out.print("Digite o n�mero de bolas defeituosas e a serem descartadas: ");
		defeituosas = key.nextInt();
		System.out.print("Digite o tempo at� a Copa: (meses) ");
		mesesAteCopa = key.nextInt();
		System.out.print("Digite o pre�o unit�rio das caixas de papel�o: R$ ");
		precoCaixaPapelao = key.nextDouble();
		System.out.print("Digite o valor mensal do aluguel: R$ ");
		valorAluguel = key.nextDouble();
		
		int numeroCaixas = (numeroBolas - defeituosas) / 10;
		if ((numeroBolas - defeituosas) % 10 != 0)
			numeroCaixas ++;
		
		int numeroGalpoes = numeroCaixas / 850;
		if (numeroCaixas % 850 != 0)
			numeroGalpoes ++;
		
		double custoTotal = (numeroCaixas * precoCaixaPapelao) +
				(numeroGalpoes * valorAluguel * mesesAteCopa);
		
		System.out.printf("%s %.2f", "\nCusto total: R$", custoTotal);
		key.close();
	}

}
