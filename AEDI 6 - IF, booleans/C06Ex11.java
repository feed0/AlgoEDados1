import java.util.Scanner;
public class C06Ex11 {
	// e02064
	// PONTUA��O AP�S JOGO DE V�LEI
	public static void main(String[] args) {
		String equipe1, equipe2;
		int placar1, placar2;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Digite o nome da equipe de casa: ");
		equipe1 = key.nextLine();
		System.out.print("Digite o nome da equipe advers�ria: ");
		equipe2 = key.nextLine();
		System.out.print("Digite o placar da equipe de casa: ");
		placar1 = key.nextInt();
		System.out.print("Digite o placar da equipe advers�tia: ");
		placar2 = key.nextInt();
		
		if (placar1 == 3) {
			if (placar2 == 2)
				System.out.printf("\n%s%s \n%s%d \n%s%d \n \n%s%s \n%s%d \n%s%d",
						"CASA: ", equipe1,
						"sets: ", placar1,
						"pontos: ", 2,
						
						"ADVERS�RIO: ", equipe2,
						"sets: ", placar2,
						"pontos: ", 1);
			else
				if (placar2 == 0 || placar2 == 1)
					System.out.printf("\n%s%s \n%s%d \n%s%d \n \n%s%s \n%s%d \n%s%d",
							"CASA: ", equipe1,
							"sets: ", placar1,
							"pontos: ", 3,
							
							"ADVERS�RIO: ", equipe2,
							"sets: ", placar2,
							"pontos: ", 0);
		}
		else
			if (placar2 == 3)
				if (placar1 == 2)
					System.out.printf("\n%s%s \n%s%d \n%s%d \n \n%s%s \n%s%d \n%s%d",
							"CASA: ", equipe1,
							"sets: ", placar1,
							"pontos: ", 1,
							
							"ADVERS�RIO: ", equipe2,
							"sets: ", placar2,
							"pontos: ", 2);
				else
					if (placar1 == 0 || placar1 == 1)
						System.out.printf("\n%s%s \n%s%d \n%s%d \n \n%s%s \n%s%d \n%s%d",
								"CASA: ", equipe1,
								"sets: ", placar1,
								"pontos: ", 0,
								
								"ADVERS�RIO: ", equipe2,
								"sets: ", placar2,
								"pontos: ", 3);

		key.close();
	}

}