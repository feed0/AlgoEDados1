import java.util.Scanner;
public class C06Ex07 {
	// e02064
	public static void main(String[] args) {
		double salarioEmpregado, PLliquido = 0;
		
		Scanner key = new Scanner(System.in);
		System.out.println("PARTICIPA��O DO EMPREGADO NOS LUCROS \n");
		System.out.print("Digite o sal�rio do empregado: ");
		salarioEmpregado = key.nextDouble();
		
		if (salarioEmpregado <= 300) 
			PLliquido = (500 + (0.7 * salarioEmpregado)) * 0.75;
		else
			if (salarioEmpregado <= 1000) 
				PLliquido = (200 + (0.5 * salarioEmpregado)) * 0.75;
			else PLliquido = (0 + (0.3 * salarioEmpregado)) * 0.75;	
		
		System.out.printf("%s %.2f","Participa��o nos lucros: ",PLliquido);
		key.close();	
		
	}

}
