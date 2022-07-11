import java.util.Scanner;
public class C08Ex08 {
	// 50 ALUNOS BOLETIM + MEDIA DE APROVADOS + NUMERO DE REPROVADOS POR FALTAS
	public static void main(String[] args) {
		int reps, faltas, contaAprovados = 0, contaFaltasMaior16 = 0;
		double nota, somaNotas = 0, media;
		
		Scanner key = new Scanner(
				C08Ex08.class.getResourceAsStream("C08Ex08fonte.txt"));
		
		reps = key.nextInt();
		System.out.println("Número de alunos: " + reps);
		
		for (int i = 1; i <= reps; i++) {
			nota = key.nextDouble();
			System.out.println("\nNota de aluno(a)" + i + ": " + nota);
			
			faltas = key.nextInt();
			System.out.println("Faltas de aluno(a): " + i + ": " + faltas);
			
			if (faltas > 16) {
				contaFaltasMaior16 ++;
				System.out.println("REPROVADO!");
			}
			else if (nota >= 65) {
				contaAprovados ++;
				somaNotas += nota;
				System.out.println("APROVADO!");
			}
			else 
				System.out.println ("REPROVADO!");
			
		}
		
		media = (float) somaNotas / contaAprovados;
		
		System.out.println("\nMédia das notas dos aprovados = " + media +
				"\nQuantidade de alunos com mais de 16 faltas = " + contaFaltasMaior16);
		key.close();			
	}

}
