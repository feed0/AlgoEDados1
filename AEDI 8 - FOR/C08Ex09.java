import java.util.Scanner;
public class C08Ex09 {
	// HOMENS E MULHERES E SUAS MÉDIAS DAS IDADES
	public static void main(String[] args) {
		String nome, sexo;
		int reps, idade, somaIdadeF = 0, somaIdadeM = 0, contaFeminino = 0, contaMasculino = 0;
		
		Scanner key = new Scanner(
				C08Ex09.class.getResourceAsStream("C08Ex09fonte.txt"));
		
		reps = key.nextInt();
		System.out.println("Número de pessoas: " + reps);
		key.nextLine();
		
		for (int i = 1; i <= reps; i++) {
			
			nome = key.nextLine();
			idade = key.nextInt();
			key.nextLine();
			sexo = key.nextLine();
			
			System.out.println("\n" + i + "° " + "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
			
			if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("f") ) {
				somaIdadeF += idade;
				contaFeminino ++;
			}
			else {
				somaIdadeM += idade;
				contaMasculino ++;
			}
		}
		
		if (contaFeminino > 0) {
		System.out.println("\nMédia idade feminina: " + somaIdadeF / (float) contaFeminino);
		}
		if (contaMasculino > 0) {
		System.out.printf("%s%.2f", "Média idade masculina: ", somaIdadeM / (float) contaMasculino);
		}
		
		key.close();
		
	}

}
