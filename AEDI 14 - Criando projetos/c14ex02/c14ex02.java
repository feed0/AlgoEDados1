package c14ex02;

import java.util.Scanner;

public class c14ex02 {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		do {

			System.out.println("\tCÁLCULO ÁREA" 
			+ "\nEscolha uma opção:" 
			+ "\n 1 - Quadrado" 
			+ "\n 2 - Retângulo"
			+ "\n 3 - Triângulo retângulo" 
			+ "\n 4 - Círculo" 
			+ "\n 0 - SAIR");

			opcao = in.nextInt();

			switch (opcao) {

			case 1: System.out.println("Área do quadrado: " + Classe1.AreaQuadrado()); break;
			case 2:System.out.println("Área do retângulo: " + Classe1.AreaRetangulo()); break;
			case 3: System.out.println("Área do tirângulo retângulo: " + Classe1.AreaTrianguloRetangulo()); break;
			case 4: System.out.println("Área do círculo: " + Classe1.AreaCirculo()); break;
			
			case 0: break;

			default: System.out.println("INVÁLIDO"); break;
			
			}
			
			System.out.println("\n");
			
		} while (opcao != 0);
	}
}