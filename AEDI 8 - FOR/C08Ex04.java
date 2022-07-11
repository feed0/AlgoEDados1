import java.util.Scanner;
public class C08Ex04 {
	// e02064
	// CONTADOR IDADE ADULTA DE UMA TURMA COM 50 ALUNOS
	public static void main(String[] args) {
		String nome;
		int idade, contadorAdulto = 0;
		
		Scanner key = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o nome do aluno(a) "+ i + ": ");
			nome = key.nextLine();
			System.out.print("Digite a idade de "+ nome + ": ");
			idade = key.nextInt();
			key.nextLine();
			
			System.out.println("Nome = " + nome + " ... Idade = " + idade);
			System.out.println();
			
			if (idade > 18)
				contadorAdulto ++;
		}
		System.out.println("Até 18 -> " + (5 - contadorAdulto));
		System.out.println("Acima de 18 -> " + contadorAdulto);
		
		key.close();
	}

}
