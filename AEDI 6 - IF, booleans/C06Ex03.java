import java.util.Scanner;
public class C06Ex03 {
	// e02064
	public static void main(String[] args) {
		double valorVendasMes, salario;
		
		Scanner key = new Scanner(System.in);
		System.out.println("SALÁRIO COM COMISSÃO POR VENDAS \n");
		System.out.print("Digite o valor mensal das vendas: R$");
		valorVendasMes = key.nextDouble();
		
		if (valorVendasMes <= 1000)
			salario = 240f;
		else
			if (valorVendasMes <= 10000)
				salario = 240 + (valorVendasMes*0.1);
			else salario = 240 + 1000;
		System.out.printf("%s %.2f", "Salário: R$", salario);
		key.close();		
	}
}
