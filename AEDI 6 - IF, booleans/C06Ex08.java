import java.util.Scanner;
public class C06Ex08 {
	// e02064
	// faixa de pesos para IMC ideal
	public static void main(String[] args) {
		String nome;
		double altura;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = key.nextLine();
		System.out.print("Digite sua altura: ");
		altura = key.nextDouble();
		
		double PESO1 = Math.pow(altura, 2) * 20;
		double PESO2 = Math.pow(altura, 2) * 25;
		
		System.out.printf("%s %s %.2f %s %.2f", nome,", a faixa de pesos para sua altura é:", PESO1, "e", PESO2);
		key.close();
	}

}
