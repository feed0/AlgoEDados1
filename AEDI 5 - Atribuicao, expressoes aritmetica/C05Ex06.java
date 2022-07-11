import java.util.Scanner;
public class C05Ex06 {
	public static void main(String[] args) {
		double coeficienteA, coeficienteB, coeficienteC, abscissaP, ordenadaP;
		
		Scanner key = new Scanner(System.in);
		System.out.println("DISTANCIA ENTRE PONTO P E RETA R");
		System.out.print("\nInforme o coeficiente A: ");
		coeficienteA = key.nextDouble();
		System.out.print("Informe o coeficiente B: ");
		coeficienteB = key.nextDouble();
		System.out.print("Informe o coeficiente C: ");
		coeficienteC = key.nextDouble();
		System.out.print("Informe a abscissa do ponto P: ");
		abscissaP = key.nextDouble();
		System.out.print("Informe a ordenada do ponto P: ");
		ordenadaP = key.nextDouble();
		
		double distancia = ((coeficienteA * abscissaP) + (coeficienteB * ordenadaP) + coeficienteC) 
				/ Math.sqrt(Math.pow(coeficienteA, 2) + Math.pow(coeficienteB, 2));
		
		System.out.printf("\nDISTANCIA = %5.4f",distancia);
		key.close();
	}

}
