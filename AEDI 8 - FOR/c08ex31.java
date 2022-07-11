import java.util.Scanner;
public class c08ex31 {

	public static void main(String[] args) {
		String nome, codCargo;
		double salarioBruto;

		Scanner key = new Scanner(
				c08ex31.class.getResourceAsStream("c08ex31f.txt"));
				
		int contSalarioAcima = 0, contAdmin = 0, contOutrosAcima = 0;
		double somaAdmin = 0, menorSalario = 0;
		String nomeMenorSalario = null, cargoMenorSalario = null;
		
		System.out.printf("%25s %s %s %s", "NOME", "\tSALARIO BRUTO", "\tCÓDIGO CARGO", "\tSIUAÇÃO" + "\n");
		
		for (int i = 1; i <= 7; i ++) {
			
			nome = key.nextLine();
			codCargo = key.nextLine();
			salarioBruto = key.nextDouble();
			key.nextLine();
			
			System.out.printf("\n%25s \tR$ %10.2f \t%6s", nome, salarioBruto, codCargo);
			
			if (
					( codCargo.equalsIgnoreCase("C") && salarioBruto < 2500 )
					|| ( codCargo.equalsIgnoreCase("P") && salarioBruto < 4650)
					|| ( codCargo.equalsIgnoreCase("O") && salarioBruto < 3200)
					|| ( codCargo.equalsIgnoreCase("A") && salarioBruto < 5100) ) {
				
				System.out.print("\t\tABAIXO");
				
			} else if (
					( codCargo.equalsIgnoreCase("C") && salarioBruto > 2500 )
					|| ( codCargo.equalsIgnoreCase("P") && salarioBruto > 4650)
					|| ( codCargo.equalsIgnoreCase("O") && salarioBruto > 3200)
					|| ( codCargo.equalsIgnoreCase("A") && salarioBruto > 5100) ) {
				contSalarioAcima ++;
			}
			
			if (codCargo.equalsIgnoreCase("A") ) {
				contAdmin ++;
				somaAdmin += salarioBruto;
			} else if (codCargo.equalsIgnoreCase("X") && salarioBruto > 5000) {
				contOutrosAcima ++;
			}
			
			if (i == 1 || salarioBruto <= menorSalario) {
				menorSalario = salarioBruto;
				nomeMenorSalario = nome;
				
				if (codCargo.equalsIgnoreCase("C") ) {
					cargoMenorSalario = "engenheiro calculista";
				} else if (codCargo.equalsIgnoreCase("P") ) {
					cargoMenorSalario = "engenheiro projetista";
				} else if (codCargo.equalsIgnoreCase("O") ) {
					cargoMenorSalario = "engenheiro de obra";
				} else if (codCargo.equalsIgnoreCase("A") ) {
					cargoMenorSalario = "engenheiro administrador";
				} else {
					cargoMenorSalario = "outros";
				}
			}
		}
		System.out.printf("\n" + "\nQuantidade eng. com salário acima: " + contSalarioAcima + 
				"\nMedia adms. : R$ %.2f" +
				"\n'OUTROS' com salario acima de R$ 5000,00: " + contOutrosAcima +
				"\n%s tem o menor salário (R$ %.2f) no cargo %s.", (somaAdmin / contAdmin), nomeMenorSalario, menorSalario, cargoMenorSalario );
		
	}

}
