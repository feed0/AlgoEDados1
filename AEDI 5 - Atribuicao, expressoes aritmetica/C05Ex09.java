import java.util.Scanner;
public class C05Ex09 {
// e02064
	public static void main(String[] args) {
		double nota1, nota2, nota3;
		
		Scanner key = new Scanner(System.in);
		System.out.println("MÉDIA PONDERADA DAS NOTAS DE UM ALUNO \n");
		System.out.print("Informe a nota da primeira prova: ");
		nota1 = key.nextDouble();
		System.out.print("Agora a da segunda: ");
		nota2 = key.nextDouble();
		System.out.print("E a última: ");
		nota3 = key.nextDouble();
		
		double mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
				
		System.out.println();
		System.out.printf("%s %.1f", "A nota final é:", mediaPonderada);
		key.close();
	}

}
