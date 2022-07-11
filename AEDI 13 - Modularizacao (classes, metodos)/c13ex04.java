package AEDI13;
import java.util.Scanner;
import java.util.Random;

public class c13ex04 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("ADVINHE");
		
		int resposta, cont = 1, numAleatorio = aleatoriarizador();
		System.out.println(numAleatorio);
		
		do { 
		
		resposta = key.nextInt();
		cont++;
		
		} while (resposta != numAleatorio);
		
		System.out.println("CERTO"
				+ "\nTentivas: " + (cont - 1) );
	
		key.close();
	}
	
	public static int aleatoriarizador() {
		
		Random aleatorio = new Random();
		int numAleatorio = aleatorio.nextInt(101);
		return numAleatorio;
		
	}

}
