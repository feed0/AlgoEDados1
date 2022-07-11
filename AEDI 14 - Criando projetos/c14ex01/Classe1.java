package c14ex01;
// OPCAO 1
public class Classe1 {
	
	public static void ImprimirNome() {
		
		String primeiroNome, segundoNome, sobrenome;
		int idade;
		
		System.out.print("Informe seu primeiro nome: ");
		primeiroNome = c14ex01.in.nextLine();
		System.out.print("Informe seu segundo nome: ");
		segundoNome = c14ex01.in.nextLine();
		System.out.print("Informe seu sobrenome: ");
		sobrenome = c14ex01.in.nextLine();
		System.out.print("Informe sua idade: ");
		idade = c14ex01.in.nextInt();
		
		System.out.println(sobrenome+", "+primeiroNome+" "+
		segundoNome);
		System.out.println("Idade: "+idade+" anos.");

	}

}
