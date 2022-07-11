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
			case "América": case "Atlético": case "Cruzeiro": case "Villa Nova":
				System.out.println("Minas Gerais");
				break;
			case "Botafogo": case "Flamengo": case "Fluminense": case "Vasco":
				System.out.println("Rio de Janeiro");
				break;
			case "Corinthians": case "Palmeiras": case "Santos": case "São Paulo":
				System.out.println("São Paulo");
				break;
			case "Grêmio": case "Internacional": case "Juventude":
				System.out.println("Rio Grande do Sul");
				break;
			case "Náutico": case "Santa Cruz": case "Sport":
				System.out.println("Pernambuco");
				break;
			default:
				System.out.println("INVÁLIDO");
		}
	key.close();
	}

}
