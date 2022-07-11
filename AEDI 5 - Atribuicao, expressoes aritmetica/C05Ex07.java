import java.util.Scanner;
public class C05Ex07 {
	public static void main(String[] args) {
		double variavelX;
		
		Scanner key = new Scanner(System.in);
		System.out.println("CÁLCULO DA FUNÇÃO \n");	
		System.out.print("Informe um valor para a variável X: ");
		variavelX = key.nextDouble();
		
		double funcaoDeX = Math.sqrt(Math.pow((variavelX / 4f) + 1, 2) + (1/5f)*variavelX);
		
		System.out.printf("\n%s%.0f%s %5.4f","f(",variavelX,") = ",funcaoDeX);
		key.close();
	}

}
