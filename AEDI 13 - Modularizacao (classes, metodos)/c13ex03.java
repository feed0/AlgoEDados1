package AEDI13;
import java.util.Scanner;

public class c13ex03 {

	static int numero;
	static int posicao;
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		// LEITURA NUMERO e POSICAO
		System.out.println("Diga um inteiro entre 0 e 999.999.999: ");
		numero = key.nextInt();
		System.out.println("Diga a posicao: ");
		posicao = key.nextInt();
		
		// IMPRESSAO
		System.out.println(posicaoInv(numero, posicao));
		
		key.close();
	}
	
	public static int posicaoInv(int num, int pos) {
		
		// INT PARA VETOR STRING
		String[] numeroVet = Integer.toString(num).split("");
		
		// INVERSAO
		int posicaoInv = numeroVet.length - pos;
		
		// RESULTADO
		int numeroInv = Integer.valueOf(numeroVet[posicaoInv]);
		
		return numeroInv;
		
	}

}
