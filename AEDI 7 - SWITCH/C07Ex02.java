import java.util.Scanner;
public class C07Ex02 {
	// e02064
	// MÉDIA DE NOTAS E CONCEITO
	public static void main(String[] args) {
		int nota1, nota2, nota3;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		nota1 = key.nextInt();
		System.out.print("Digite a segunda nota: ");
		nota2 = key.nextInt();
		System.out.print("Digite a terceira nota: ");
		nota3 = key.nextInt();
		
		int mediaFinal = (nota1 + nota2 + nota3) / 3;
		
		switch (mediaFinal) {
			case 1: case 2: case 3: case 4:
				System.out.println("O conceito do aluno é: E");
				break;
			case 5: case 6:
				System.out.println("O conceito do aluno é: D");
				break;
			case 7:
				System.out.println("O conceito do aluno é: C");
				break;
			case 8:
				System.out.println("O conceito do aluno é: B");
				break;
			case 9: case 10:
				System.out.println("O conceito do aluno é: A");
				break;
			default:
				System.out.println("Uma das notas está inválida");
				break;
		}
		key.close();
	}
}