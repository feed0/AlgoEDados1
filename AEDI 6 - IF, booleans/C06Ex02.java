import java.util.Scanner;
public class C06Ex02 {
	// e02064
	public static void main(String[] args) {
		double poluentes, multa;
		
		Scanner key = new Scanner(System.in);
		System.out.println("POLUENTES ATMOSFÉRICOS \n");
		System.out.print("Digite a quantidade de poluentes emitidos pela empresa: ");
		poluentes = key.nextDouble();
		
		System.out.println();
		if (poluentes < 1500) 
			multa = 0;
		else 
			if (poluentes <= 3500) 
				multa = 3000;			
			else 
				multa = 5000 * poluentes;
		System.out.printf("%s %.2f", "A empresa deve pagar a multa de R$", multa);
			key.close();	
	}

}
