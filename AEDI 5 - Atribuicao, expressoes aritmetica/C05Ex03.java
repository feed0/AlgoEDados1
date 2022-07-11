import java.util.Scanner;
public class C05Ex03 {
	// e02064
	public static void main(String[] args) {
		double salarioBruto;
		int numeroDependentes;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Informe o salário bruto: ");
		salarioBruto = key.nextDouble();
		System.out.print("Informe o número de dependentes: ");
		numeroDependentes = key.nextInt();
		
		double impostoRenda = (15/100f) * (salarioBruto - (numeroDependentes * 60f));
		
		System.out.println();
		System.out.printf("Valor a ser retido de Imposto de Renda: R$ %5.2f", impostoRenda);
		key.close();
	}
}
