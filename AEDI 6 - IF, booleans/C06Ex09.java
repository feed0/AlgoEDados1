import java.util.Scanner;
public class C06Ex09 {
	// e02064
	// PESO IDEAL COM SEXO (F,M) COMO CONDIÇÃO
	public static void main(String[] args) {
		String sexo;
		double altura, pesoIdeal = 0;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Digite seu sexo: (F ou M) ");
		sexo = key.nextLine();
		System.out.print("Digite sua altura: (m) ");
		altura = key.nextDouble();
		
		if ( sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("MASCULINO") ) 
			pesoIdeal = (72.7 * altura) - 58;
		else 
			if ( sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("FEMININO") ) 
				pesoIdeal = ( 62.1 * altura ) - 44.7;	
			else System.out.println("inválido");
		
		System.out.printf("%s %.3f %s", "Peso ideal: ", pesoIdeal, "kg");
		key.close();
	}
}