import java.util.Scanner;
public class C08Ex07 {
	// 50 ALUNOS COM ATÉ 12 OU + 30 + MEDIA
	public static void main(String[] args) {
		String nome;
		int idade, reps, contaAte12 = 0, contaMaior30 = 0, somaIdade = 0;
		double media;
		
		Scanner key = new Scanner(
				C08Ex07.class.getResourceAsStream("C08Ex07fonte.txt"));
				
		reps = key.nextInt();
		System.out.println("Número de alunos: " + reps);
		
		for (int i = 1; i <= reps; i++) {
			key.nextLine();
			nome = key.nextLine();
			System.out.println("\nNome de aluno(a) " + i + ": " + nome);
			
			idade = key.nextInt();
			System.out.println("Idade " + nome + ": " + idade);
			
			somaIdade += idade;
			if (idade <= 12)
				contaAte12++;
			else if (idade > 30)
				contaMaior30++;
		}
		if (reps > 0) {
			media = 1.0 * somaIdade / reps;
			System.out.println("\nAlunos com até 12 anos: " + contaAte12 +
					"\nAlunos com idade acima de 30 anos: " + contaMaior30 +
					"\nMedia das idades: " + media);
		}
		else {
			System.out.println("ERROR");
		}
		key.close();
	}

}
