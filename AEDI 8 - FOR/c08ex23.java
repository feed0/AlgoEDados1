
public class c08ex23 {
	// PALÍNDROMOS
	public static void main(String[] args) {
		int primeiro, segundo, terceiro, quarto, cont = 0, soma = 0;
		
		for (int i = 1000; i <= 9999; i ++) {
		
			primeiro 	= i % 10; 
			segundo 	= i % 100 / 10;
			terceiro 	= i / 100 % 10;
			quarto 		= i / 1000;
				
			if (primeiro == quarto && segundo == terceiro) {
				soma += i;
				cont ++;
				System.out.println(i + "° = " + primeiro + "" + segundo + "" + terceiro + "" + quarto);
			}
		}
		
		if (cont > 0) {
			System.out.println("\nMÉDIA = " + soma / cont ) ;
		}
	}

}
