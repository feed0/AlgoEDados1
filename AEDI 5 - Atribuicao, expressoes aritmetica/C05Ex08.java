import java.util.Scanner;
public class C05Ex08 {
// Autor: e02064
	public static void main(String[] args) {
		double areaSetor, anguloSetor;
		
		Scanner key = new Scanner(System.in);
		System.out.println("CÁLCULO DO RAIO A PARTIR DE ÁREA E ÂNGULO DE SETOR \n");
		System.out.print("Informe a área do setor circular: ");
		areaSetor = key.nextDouble();
		System.out.print("Agora o seu ângulo: ");
		anguloSetor = key.nextDouble();
		
		double raio = Math.sqrt((areaSetor * 360) / (anguloSetor * 3.1416));
		
		System.out.println();
		System.out.printf("%s %.4f", "Raio =", raio);
		key.close();
	}

}
