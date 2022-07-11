import java.util.Scanner;
public class C05Ex04 {
	// e02064
	public static void main(String[] args) {
		double abscissa1, ordenada1, abscissa2, ordenada2;
		
		Scanner key = new Scanner(System.in);
		System.out.print("ALGEBRA LINEAR - CÁLCULO DA DISTANCIA ENTRE DOIS PONTOS \n");
		System.out.print("Informe a abcissa do ponto 1: ");
		abscissa1 = key.nextDouble();
		System.out.print("Agora a sua ordenada: ");
		ordenada1 = key.nextDouble();
		System.out.print("Informe a abscissa do ponto 2: ");
		abscissa2 = key.nextDouble();
		System.out.print("Agora sua ordenada: ");
		ordenada2 = key.nextDouble();
		
		double distancia = Math.sqrt(Math.pow(abscissa1 - abscissa2, 2) + Math.pow(ordenada1 - ordenada2, 2));
		
		System.out.println();
		System.out.printf("Distancia entre os pontos: %5.4f", distancia);
		key.close();
	}

}
