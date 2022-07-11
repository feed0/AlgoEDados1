import java.util.Scanner;
public class C08Ex05 {
	// e02064
	// ELEIÇÕES PREFEITO
	public static void main(String[] args) {
		int codigoVoto, contadorFulano = 0, contadorCiclano = 0, contadorBeltrano = 0;
		String prefeitoEleito;
		
		Scanner key = new Scanner(System.in);
		for (int i = 1; i <= 100; i++) {
			System.out.print("Digite o código do voto do eleitor "+ i + ": ");
			codigoVoto = key.nextInt();
			if (codigoVoto == 1)
				contadorFulano++;
			else if (codigoVoto == 2)
				contadorCiclano++;
			else
				contadorBeltrano++;
		}
		if (contadorFulano > contadorCiclano && contadorFulano > contadorBeltrano)
			prefeitoEleito = "Fulano";
		else if (contadorCiclano > contadorBeltrano)
			prefeitoEleito = "Ciclano";
		else 
			prefeitoEleito = "Beltrano";
		System.out.println("\nPrefeito eleito: "+prefeitoEleito+
				"\nVotos para Fulano: "+contadorFulano+
				"\nVotos para Ciclano: "+contadorCiclano+
				"\nVotos para Beltrano: "+contadorBeltrano);
		key.close();
	}

}