import java.text.NumberFormat;
import java.util.Scanner;
public class C08Ex12 {
	// MÁQUINAS AGRICOLAS
	public static void main(String[] args) {
		int codigo, reps;
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		
		Scanner key = new Scanner (
				C08Ex12.class.getResourceAsStream("C08Ex12fonte.txt"));
		
		reps = key.nextInt();
		
		for (int i = 1; i <= reps; i++) {
			codigo = key.nextInt();
			System.out.printf("%4d° Código: \t%d\n", i, codigo);
			
			if (codigo == 1) {
				cont1 ++;
			} else if (codigo == 2) {
				cont2 ++;
			} else if (codigo == 3) {
				cont3 ++;
			} else if (codigo == 4) {
				cont4 ++;
			} else if (codigo == 5) {
				cont5 ++;
			}
			
		}
		
		NumberFormat formato = NumberFormat.getCurrencyInstance();
		double semiTotal1 = cont1 * 1565f, 
				semiTotal2 = cont2 * 1890f, 
				semiTotal3 = cont3 * 2150f, 
				semiTotal4 = cont4 * 2963f, 
				semiTotal5 = cont5 * 3750f,
				total = semiTotal1 + semiTotal2 + semiTotal3 + semiTotal4 + semiTotal5;
				
		System.out.printf(
				  "\n1: %3d * R$ 1565,00 = %s "
				+ "\n2: %3d * R$ 1890,00 = %s "
				+ "\n3: %3d * R$ 2150,00 = %s " 
				+ "\n4: %3d * R$ 2693,00 = %s "
				+ "\n5: %3d * R$ 3750,00 = %s "
				+ "\n\tTOTAL = %s",
				cont1, formato.format(semiTotal1),
				cont2, formato.format(semiTotal2),
				cont3, formato.format(semiTotal3),
				cont4, formato.format(semiTotal4),
				cont5, formato.format(semiTotal5),
				formato.format(total) ); 
	}
}