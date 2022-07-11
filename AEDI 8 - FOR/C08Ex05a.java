import java.util.Scanner;
public class C08Ex05a {
	// e02064
	// ELEIÇÕES PREFEITO + VOTOS NULOS + EMPATE
	public static void main(String[] args) {
		int rep = 0, codigoVoto = 0, contFulano = 0, contCiclano = 0, contBeltrano = 0, votosNulos, votosValidos;
		String prefeitoEleito = null;
				
		Scanner key = new Scanner(
				C08Ex06.class.getResourceAsStream("C08Ex5af.txt"));
		
		rep = key.nextInt();
		System.out.println("\t" + rep + " ELEITORES ");
		
		System.out.println("\nPRIMEIRO TURNO" + "\n");
		
		for (int i = 1; i <= rep; i++) {
			
			codigoVoto = key.nextInt();
			System.out.println("Eleitor "+ i + ":  " + codigoVoto);
			
			if (codigoVoto == 1) contFulano++;
			else if (codigoVoto == 2) contCiclano++;
			else if (codigoVoto == 3) contBeltrano++;
		} 
		
		votosValidos = contFulano + contCiclano + contBeltrano;
		votosNulos = rep - votosValidos;
		
		if (votosValidos >= votosNulos) {
			
// EMPATE TRIPLO
			if (contFulano == contCiclano && contCiclano == contBeltrano) { 
				
				contFulano = 0; contCiclano = 0; contBeltrano = 0; votosNulos = 0; // ZERAR VOTOS
				System.out.println("\nSEGUNDO TURNO: -- 3 CANDIDATOS -- " + "\n");
				
				for (int k = 1; k <= rep; k++) {
					codigoVoto = key.nextInt();
					System.out.println("Eleitor " + k + ":  " + codigoVoto);
					
					if (codigoVoto == 1) contFulano++;
					else if (codigoVoto == 2) contCiclano++;
					else if (codigoVoto == 3) contBeltrano++; 
					else votosNulos ++;
				}
				// DECISÃO
				if (contFulano == contCiclano && contCiclano == contBeltrano) {
					
					if (contFulano > 0) System.out.println("\n\tNOVO EMPATE");
					else System.out.println("\n\tNENHUM VOTO VÁLIDO");
					
					System.out.println("\tESTA ELEIÇÃO PRECISA SER ADIADA");
					
				}
				
				else { 
					
					if (contFulano > contCiclano && contFulano > contBeltrano) prefeitoEleito = "Fulano";
					else if (contCiclano > contFulano  && contCiclano > contBeltrano) prefeitoEleito = "Ciclano";
					else if (contBeltrano > contFulano  && contBeltrano > contCiclano) prefeitoEleito = "Beltrano";
					
					System.out.println(
							"\nVotos para Fulano: " + contFulano +
							"\nVotos para Ciclano: " + contCiclano +
							"\nVotos para Beltrano: " + contBeltrano +
							"\nVotos nulos: "+ votosNulos +
							"\n" + "\n\tPREFEITO ELEITO:\n\t" + prefeitoEleito);		
				}
			}
			
// FULANO vs CICLANO
			else if (contFulano == contCiclano && contCiclano > contBeltrano) { 
				
				contFulano = 0; contCiclano = 0; contBeltrano = 0; votosNulos = 0; // ZERAR VOTOS
				System.out.println("\nSEGUNDO TURNO: -- FULANO vs CICLANO -- " + "\n");
				
				for (int fc = 1; fc <= rep; fc ++) {
					codigoVoto = key.nextInt();
					System.out.println("Eleitor " + fc + ":  " + codigoVoto);
					
					if (codigoVoto == 1) contFulano ++;
					else if (codigoVoto == 2) contCiclano ++;
					else votosNulos ++;
				}
				
				// DECISÃO
				if (contFulano == contCiclano) {
					
					if (contFulano > 0) System.out.println("\n\tNOVO EMPATE");
					else System.out.println("\n\tNENHUM VOTO VÁLIDO");
					
					System.out.println("\tESTA ELEIÇÃO PRECISA SER ADIADA");
					
				}
				
				else { 
					
					if (contFulano > contCiclano) prefeitoEleito = "Fulano";
					else if (contCiclano > contFulano) prefeitoEleito = "Ciclano";
					
					System.out.println(
							"\nVotos para Fulano: " + contFulano +
							"\nVotos para Ciclano: " + contCiclano +
							"\nVotos nulos: "+ votosNulos +
							"\n" + "\n\tPREFEITO ELEITO:\n\t" + prefeitoEleito);		
				}
			} 
// FULANO vs BELTRANO			
			else if (contFulano == contBeltrano && contBeltrano > contFulano) {
				
				contFulano = 0; contCiclano = 0; contBeltrano = 0; votosNulos = 0; // ZERAR VOTOS
				System.out.println("\nSEGUNDO TURNO: -- FULANO vs BELTRANO -- " + "\n");
				
				for (int fb = 1; fb <= rep; fb ++) {
					codigoVoto = key.nextInt();
					System.out.println("Eleitor " + fb + ":  " + codigoVoto);
					
					if (codigoVoto == 1) contFulano ++;
					else if (codigoVoto == 3) contBeltrano ++;
					else votosNulos ++;
				}
				
				// DECISÃO
				if (contFulano == contBeltrano) {
					
					if (contFulano > 0) System.out.println("\n\tNOVO EMPATE");
					else System.out.println("\n\tNENHUM VOTO VÁLIDO");
					
					System.out.println("\tESTA ELEIÇÃO PRECISA SER ADIADA");
					
				}
				
				else { 
					
					if (contFulano > contBeltrano) prefeitoEleito = "Fulano";
					else if (contBeltrano > contFulano) prefeitoEleito = "Beltrano";
					
					System.out.println(
							"\nVotos para Fulano: " + contFulano +
							"\nVotos para Beltrano: " + contBeltrano +
							"\nVotos nulos: "+ votosNulos +
							"\n" + "\n\tPREFEITO ELEITO:\n\t" + prefeitoEleito);		
				}
			}
// CICLANO vs BELTRANO
			else if (contCiclano == contBeltrano && contBeltrano > contFulano) {
							
				contFulano = 0; contCiclano = 0; contBeltrano = 0; votosNulos = 0; // ZERAR VOTOS
				System.out.println("\nSEGUNDO TURNO: -- CICLANO vs BELTRANO -- " + "\n");
				
				for (int cb = 1; cb <= rep; cb ++) {
					codigoVoto = key.nextInt();
					System.out.println("Eleitor " + cb + ":  " + codigoVoto);
					
					if (codigoVoto == 2) contCiclano ++;
					else if (codigoVoto == 3) contBeltrano ++;
					else votosNulos ++;
				}
				
				// DECISÃO
				if (contCiclano == contBeltrano) {
					
					if (contCiclano> 0) System.out.println("\n\tNOVO EMPATE");
					else System.out.println("\n\tNENHUM VOTO VÁLIDO");
					
					System.out.println("\tESTA ELEIÇÃO PRECISA SER ADIADA");
					
				}
				
				else { 
					
					if (contCiclano > contBeltrano) prefeitoEleito = "Ciclano";
					else if (contBeltrano > contCiclano) prefeitoEleito = "Beltrano";
					else votosNulos ++;
					
					System.out.println(
							"\nVotos para Ciclano: " + contCiclano +
							"\nVotos para Beltrano: " + contBeltrano +
							"\nVotos nulos: "+ votosNulos +
							"\n" + "\n\tPREFEITO ELEITO:\n\t" + prefeitoEleito);		
				}
			}
						
		}
		
// MAIS VOTOS NULOS
		else {
			System.out.println("\nEsta votação, inclusive seu segundo turno, estão anulados devido a participação insuficiente!" +
						"\n" + 
						"\n\tVálidos:    \t" + votosValidos +
						"\n\tInválidos   \t" + votosNulos);
		}
		
		key.close();
		
		
	}

}