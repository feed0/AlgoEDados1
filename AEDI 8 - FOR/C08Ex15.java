import java.util.Scanner;
public class C08Ex15 {
	// E02064
	// INFORMAÇÕES 1000 FUNCIONÁRIOS 
	public static void main(String[] args) {
		String nome, cargo, nomeMaiorSalario = null;
		double salario, somaSalarioAdolescentes = 0, maiorSalario = 0;
		int idade, contAdolescentes = 0;

		Scanner key = new Scanner(
				C08Ex15.class.getResourceAsStream("c08ex15.txt"));
		
		
		System.out.printf("%10s %10s %10s %8s" + "\n",
				"NOME", "CARGO", "SALARIO", "IDADE");
		for (int i = 1; i <= 1000; i ++) {
			
			nome = key.nextLine();
			cargo = key.nextLine();
			salario = key.nextDouble();
			idade = key.nextInt();
			key.nextLine();
			
			System.out.printf("\n%10s %10s %10.2f %8d", nome, cargo, salario, idade);
			
			if (salario > Math.pow(10, 4) && idade > 50) {
				System.out.printf("\t* SÊNIOR *");
			}
			
			if (idade <= 18) {
				somaSalarioAdolescentes += salario;
				contAdolescentes ++;
			}
			
			if (i == 1 || salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
		}
		
		System.out.printf("\n");
		
		double mediaSalarioAdolescentes = somaSalarioAdolescentes / contAdolescentes;

		if (contAdolescentes > 0) {
			System.out.printf("\nMédia salarial de jovens com idade até 18:   R$ %.2f", mediaSalarioAdolescentes);	
		}
		
		System.out.printf("\nFuncionário com maior salário:                  " + nomeMaiorSalario);
	}

}
