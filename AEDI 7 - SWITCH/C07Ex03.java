import java.util.Scanner;
public class C07Ex03 {
	// e02064
	// MULTA SOBRE ATRASO DE UM IMPOSTO
	public static void main(String[] args) {
		double valorImposto, multa;
		int diasAtraso;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Digite o valor do imposto: R$ ");
		valorImposto = key.nextDouble();
		System.out.print("Digite o número de dias de atraso: ");
		diasAtraso = key.nextInt();
		
		switch (diasAtraso) {
			case 1: case 2: case 3: case 4: case 5:
				System.out.println("Não há multa a ser paga!");
				break;
			case 6: case 7: case 8:
				multa = valorImposto * 0.02;
				System.out.println("Multa R$ "+multa);
				break;
			case 9: case 10:
				multa = (valorImposto * 0.1) + (0.005 * valorImposto * diasAtraso);
				System.out.println("Multa: R$ "+multa);
				break;
			default:
				multa = (valorImposto * 1.5) + (1 * diasAtraso);
				System.out.println("Multa :R$ "+multa);
		}
		key.close();
	}

}
