package c14ex01;
// OPCAO 2
public class Classe2 {

	public static void CalcularIdade() {
		String nome;
		int anoNasc, anoAtual, idade;

		System.out.print("Digite seu nome: ");
		nome = c14ex01.in.nextLine();
		c14ex01.in.nextLine();
		System.out.print("Digite o ano em que você nasceu: ");
		anoNasc = c14ex01.in.nextInt();

		System.out.print("Digite o ano em que estamos: ");
		anoAtual = c14ex01.in.nextInt();

		idade = anoAtual - anoNasc;

		System.out.print(nome + ", você tem/terá " + idade + " anos em " + anoAtual);

	}

}
