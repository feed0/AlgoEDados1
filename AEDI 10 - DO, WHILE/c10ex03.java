import java.util.Scanner;
public class c10ex03 {

	public static void main(String[] args) {
	Scanner key = new Scanner(c10ex03.class.getResourceAsStream("10 03.txt"));
	
	double angulo = key.nextDouble();
	double raio = 0, setor = 0;
	
	do {
		raio = key.nextDouble();
		if (raio == -1)
			break;
		setor = (angulo * 3.1416 * Math.pow(raio, 2)) / 360;
		System.out.printf("Raio: %.3f -> Setor: %.3f\n"
				,raio, setor);
	} while (raio != -1);
	
	
	}

}
