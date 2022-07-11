import java.util.Scanner;
public class C08Ex03 {
	// e02064
	// 50 ALUNOS COM NOTAS E FALTAS + CONTADOR
	public static void main(String[] args) {
		int reps, faltas, contadorAprovados = 0;
		double nota;
		
		Scanner key = new Scanner(System.in);
		System.out.println("Número de alunos: ");
		reps = key.nextInt();
		
		for (int i = 1; i <= reps; i++) {
			
			System.out.printf("%s %d%s", "Digite a nota do(a) aluno(a)", i, ": ");
			nota = key.nextDouble();
			if (nota == -1)
				break;
			
			System.out.printf("%s %d%s", "Digite o numero de faltas do(a) aluno(a)", i, ": ");
			faltas = key.nextInt();
			
			if (nota >= 65 && faltas <= 16) {
				contadorAprovados ++;
				System.out.printf("%s %d %s","Aluno(a)", i, ": APROVADO");
			}
			else System.out.printf("%s %d %s", "Aluno(a)", i, ": REPROVADO");
			System.out.println("\n");
		}
		System.out.println("\nAprovados = "+contadorAprovados);
		System.out.println("Reprovados = "+ (reps - contadorAprovados));
		key.close();
	}

}