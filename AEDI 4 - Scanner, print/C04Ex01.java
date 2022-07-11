import java.util.Scanner;
public class C04Ex01 {
	// Autor: e02064
	public static void main(String[] args) {
		String primeiroNome, segundoNome, sobrenome;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu primeiro nome: ");
		primeiroNome = teclado.nextLine();
		System.out.print("Informe seu segundo nome: ");
		segundoNome = teclado.nextLine();
		System.out.print("Informe seu sobrenome: ");
		sobrenome = teclado.nextLine();
		System.out.print("Informe sua idade: ");
		idade = teclado.nextInt();
		
		System.out.println(sobrenome+", "+primeiroNome+" "+
		segundoNome);
		System.out.println("Idade: "+idade+" anos.");
		teclado.close();

	}

}
