import java.util.Scanner;
public class C05Ex02 {
	// Autor: e02064
	public static void main(String[] args) {
				
		double raioEsfera, areaEsfera, volumeEsfera;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Informe o raio da esfera para o cálculo de sua AREA e de seu VOlUME: ");
		raioEsfera = key.nextDouble();
		
		areaEsfera = 4 * 3.1416 * (Math.pow(raioEsfera, 2));
		volumeEsfera = (4/3f) * 3.1416 * (Math.pow(raioEsfera, 3));
		
		System.out.println();
		System.out.printf("Área = %5.2f", areaEsfera);
		System.out.printf("\nVolume = %5.2f", volumeEsfera);
		key.close();
	}

}
