import java.util.Scanner;
public class C04Ex02 {
	// Autor: e02064
	public static void main(String[] args) {
		String nome, CPF, identidade, tituloEleitor, CNH, nomeEmpresa; 
		float salario;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe seu CPF: ");
		CPF = teclado.nextLine();
		System.out.print("Informe sua identidade: ");
		identidade = teclado.nextLine();
		System.out.print("Informe seu título de eleitor: ");
		tituloEleitor = teclado.nextLine();
		System.out.print("Informe sua CNH:");
		CNH = teclado.nextLine();
		System.out.print("Informe seu salário: R$");
		salario = teclado.nextFloat();
		teclado.nextLine();
		System.out.println("Informe sua empresa: ");
		nomeEmpresa = teclado.nextLine();
		
		System.out.println("FICHA FUNCIONAL DE: "+nome);
		System.out.println("\nDocumentos:");
		System.out.println("CPF ........................................."+CPF);
		System.out.println("C.I. ........................................"+identidade);
		System.out.println("Título de eleitor ..........................."+tituloEleitor);
		System.out.println("CNH ........................................."+CNH);
		System.out.println("\nEmpresa: "+nomeEmpresa);
		System.out.println("Salário: R$"+salario);
		
		teclado.close();
	}

}
