import java.util.Scanner;
public class C06Ex10 {
	// e02064
	// APLICAÇÃO FINANCEIRA 
	public static void main(String[] args) {
		double capital, taxaDiaria;
		int numeroDias;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Digite o capital aplicado: ");
		capital = key.nextDouble();
		System.out.print("Digite o número de dias decorridos: ");
		numeroDias = key.nextInt();
		System.out.print("Digite a taxa diária: (%) ");
		taxaDiaria = key.nextDouble();
		
		double rendimento = capital * (taxaDiaria/100f) * numeroDias;
		double impostoRenda = 0.15 * rendimento;
		double valorResgate = capital + rendimento - impostoRenda - 10;
		
		System.out.printf("\n%s%.2f. \n%s%.2f%s %s%.2f",
							"O rendimento foi de R$ ", rendimento,
							"Após o imposto de R$ ", impostoRenda, " e a taxa de adm. de R$ 10,00 ,",
							"o valor a ser resgatado é de R$ ", valorResgate);
		
		key.close();
	}

}
