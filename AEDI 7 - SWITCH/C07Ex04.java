import java.util.Scanner;
public class C07Ex04 {
	// e02064
	// EQUIPE E FUTEBOL E ESTADO
	public static void main(String[] args) {
		String nomeEquipe;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Digite o nome da equipe de futebol: ");
		nomeEquipe = key.nextLine();
		
		switch (nomeEquipe) {
			case "Am�rica": case "Atl�tico": case "Cruzeiro": case "Villa Nova":
				System.out.println("Minas Gerais");
				break;
			case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
				System.out.println("Rio de Janeiro");
				break;
			case "Corinthians": case "Palmeiras": case "Santos": case "S�o Paulo":
				System.out.println("S�o Paulo");
				break;
			case "Gr�mio": case "Internacional": case "Juventude":
				System.out.println("Rio Grande do Sul");
				break;
			case "N�utico": case "Santa Cruz": case "Sport":
				System.out.println("Pernambuco");
				break;
			default:
				System.out.println("INV�LIDO");
		}
	key.close();
	}

}
