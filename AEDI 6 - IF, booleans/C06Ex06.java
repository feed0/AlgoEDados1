import java.util.Scanner;
public class C06Ex06 {
	// e02064
	public static void main(String[] args) {
		double coeficienteA, coeficienteB, coeficienteC;
		
		Scanner key = new Scanner(System.in);
		System.out.println("CÁLCULO RAÍZES COM CONDIÇÃO DISCRIMINANTE \n");
		System.out.print("Digite o coeficiente A: ");
		coeficienteA = key.nextDouble();
		System.out.print("Digite o coeficiente B: ");
		coeficienteB = key.nextDouble();
		System.out.print("Digite o coeficiente C: ");
		coeficienteC = key.nextDouble();
		
		double discriminante = Math.pow(coeficienteB, 2) - (4 * coeficienteA * coeficienteC);
		double raiz1 = (-1 * coeficienteB + Math.sqrt(discriminante) ) / (2 * coeficienteA);
		double raiz2 = (-1 * coeficienteB - Math.sqrt(discriminante) ) / (2 * coeficienteA);
		
		if (discriminante > 0)
			System.out.printf("%s %.2f %s %.2f", "Duas raízes distintas:", raiz1, "e", raiz2); 
		else 
			if (discriminante == 0)
				System.out.println("Duas raízes iguais: "+raiz1);
			else 
				System.out.println("Não existem raízes reais para essa função");
		
		key.close();
	}

}
