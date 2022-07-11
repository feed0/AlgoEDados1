import java.util.Scanner;
public class C08Ex02 {
	// e02064
	// 50 ALUNOS COM NOTAS E FALTAS
	public static void main(String[] args) {
		int faltas;
		double nota;
		
		Scanner key = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			
			System.out.printf("%s %d%s", "Digite a nota do(a) aluno(a)", i, ": ");
			nota = key.nextDouble();
			if (nota == -1)
				break;
			
			System.out.printf("%s %d%s", "Digite o numero de faltas do(a) aluno(a)", i, ": ");
			faltas = key.nextInt();
			
			if (nota >= 65 && faltas <= 16)
				System.out.printf("%s %d %s","Aluno(a)", i, ": APROVADO");
			else System.out.printf("%s %d %s", "Aluno(a)", i, ": REPROVADO");
			System.out.println();
		}
		key.close();
	}

}