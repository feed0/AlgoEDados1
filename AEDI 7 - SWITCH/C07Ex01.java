import java.util.Scanner;
public class C07Ex01 {
	// E02064
	// LOTERIA ESPORTIVA
	public static void main(String[] args) {
		String nome, premio;
		int numeroAcertos;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Diga seu nome: ");
		nome = key.nextLine();
		System.out.print("Diga o seu n�mero de acertos");
		numeroAcertos = key.nextInt();
		
		switch (numeroAcertos) {
			case 1: case 2: case 3: case 4: case 5:
				premio = "n�o h� premios";
				break;
			case 6: case 7: case 8: case 9: case 10:
				premio = "outro cart�o";
				break;
			case 11:
				premio = "R$ 100,00";
				break;
			case 12:
				premio = "R$ 1000,00";
				break;
			case 13:
				premio = "R$ 50.000,00!";
				break;
			default:
				premio = "INV�LIDO";			
		}		
		System.out.printf("%s, seu pr�mio: %s",nome, premio);
		key.close();
	}

}
