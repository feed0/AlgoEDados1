import java.util.Scanner;
public class C06Ex01 {
// e02064
	public static void main(String[] args) {
		double variavel, funcao;
		
		Scanner key = new Scanner(System.in);
		System.out.println("FUN��O COM 3 CONDI��ES \n");
		System.out.print("Informe um valor para a vari�vel: ");
		variavel = key.nextDouble();
		
		if (variavel < 4)
			funcao = (( 5 * variavel ) + 3) /
				Math.sqrt(16 - (Math.pow(variavel, 2)));
		else 
			if (variavel == 4)
				funcao = 0;
			else 
				funcao = ((5 * variavel) + 3) /
					Math.sqrt(Math.pow(variavel, 2) - 16);
		
		System.out.println();
		System.out.printf("%s %.4f", "O valor da fun��o �:", funcao);
		key.close();		
	}

}
