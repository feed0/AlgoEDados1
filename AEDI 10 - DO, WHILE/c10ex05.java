import java.util.Scanner;
public class c10ex05 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(c10ex05.class.getResourceAsStream("10 05.txt"));
		
		
		double altura, peso;
		String sexo;
		
		int contPessoas = 0, contMulheres = 0, contHomens = 0, mulheresMagras = 0;
		double somaAlturaH = 0;
		do {
			altura = key.nextDouble();
			if (altura == 0)
				break;
			
			peso = key.nextDouble();
			key.nextLine();
			sexo = key.nextLine();
		
			contPessoas ++;
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")) {
				contMulheres ++;
				if (peso < 60)
					mulheresMagras ++;
			}
				
			else {
				contHomens ++;
				somaAlturaH += altura;
			}
			
		} while (altura != 0);
		
		double mediaAlturaHomens = somaAlturaH / contHomens;
		
		System.out.printf(
				"Pessoas: %d"
				+ "\nMulheres: %d"
				+ "\nAltura média homens: %.3f"
				+ "\nMulheres peso < 60: %d"
				, contPessoas, contMulheres, mediaAlturaHomens, mulheresMagras );
		key.close();
	}

}
