package c14ex02;

import java.util.Scanner;

public class c14ex02 {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		do {

			System.out.println("\tC�LCULO �REA" 
			+ "\nEscolha uma op��o:" 
			+ "\n 1 - Quadrado" 
			+ "\n 2 - Ret�ngulo"
			+ "\n 3 - Tri�ngulo ret�ngulo" 
			+ "\n 4 - C�rculo" 
			+ "\n 0 - SAIR");

			opcao = in.nextInt();

			switch (opcao) {

			case 1: System.out.println("�rea do quadrado: " + Classe1.AreaQuadrado()); break;
			case 2:System.out.println("�rea do ret�ngulo: " + Classe1.AreaRetangulo()); break;
			case 3: System.out.println("�rea do tir�ngulo ret�ngulo: " + Classe1.AreaTrianguloRetangulo()); break;
			case 4: System.out.println("�rea do c�rculo: " + Classe1.AreaCirculo()); break;
			
			case 0: break;

			default: System.out.println("INV�LIDO"); break;
			
			}
			
			System.out.println("\n");
			
		} while (opcao != 0);
	}
}