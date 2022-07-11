import java.util.Scanner;
public class C04Ex03 {
	// Autor: e02064
	public static void main(String[] args) {
		int emissao1, emissao2;
		float faixa1, faixa2, faixa3;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Informe a taxa de emissão mínima para aplicação das multas: ");
		emissao1 = key.nextInt();
		System.out.print("Informe agora a taxa de emissão mais alta para aplicação das multas: ");
		emissao2 = key.nextInt();
		System.out.print("Informe o valor da multa para as empresas que não ultrapassem a taxa mínima de emissões: ");
		faixa1 = key.nextFloat();
		System.out.print("Informe o valor da multa para as empresas que se enquadram numa faixa de emissões intermediárias: ");
		faixa2 = key.nextFloat();
		System.out.print("Informe o valor da multa (por poluente emitido) para as empresas que ultrapassem a taxa de emissões mais alta: ");
		faixa3 = key.nextFloat();
		
		System.out.println("____________________________________________________________________");
		System.out.println("         Quantidade de Poluente Emitidio X Valor da Multa"           );
		System.out.println("Até "+emissao1+" de R$ "+faixa1);
		System.out.println("Acima de "+emissao1+" até "+emissao2+" multa de R$"+faixa2);
		System.out.println("Acima de "+emissao2+" multa de R$ "+faixa3+" por poluente emitido");
		System.out.println("____________________________________________________________________");
		
		key.close();
	}

}
