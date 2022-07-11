import java.util.Scanner;
public class C06Ex04 {
	// e0264
	public static void main(String[] args) {
		String nome;
		double altura, peso;
		String situacao;
		
		Scanner key = new Scanner(System.in);
		System.out.println("CÁLCULO DE IMC");
		System.out.print("Diga o seu nome: ");
		nome = key.nextLine();
		System.out.print("Diga a sua altura: (m)");
		altura = key.nextDouble();
		System.out.print("Diga o seu peso: (kg)");
		peso = key.nextDouble();
		
		double IMC = peso / Math.pow(altura, 2);
		
		System.out.printf("%s %.2f %s","Com IMC", IMC,"\n"); 
		
		if (IMC < 18)
			situacao = "desnutrição";
		else
			if (IMC < 20)
				situacao = "abaixo do peso";
			else
				if (IMC <= 25)
					situacao = "peso ideal";
				else
					if (IMC < 27)
						situacao = "acima do peso";
					else
						situacao = "obesidade";
					
		System.out.printf("%s%s %s", nome, ", a sua situação é:", situacao);
		key.close();
	
	}

}
