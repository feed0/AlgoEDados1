import java.util.Scanner;
public class C05Ex10 {
	// e02064
	public static void main(String[] args) {
		long numero5Digitos;
		
		Scanner key = new Scanner(System.in);
		System.out.println("IMPRESSÃO VERTICAL \n");
		System.out.print("Diga o número a ser verticalizado: ");
		numero5Digitos = key.nextLong();
		
		System.out.println();
		System.out.printf("%d \n%d \n%d \n%d \n%d", 
				numero5Digitos / 10000, 
				numero5Digitos / 1000 % 10, 
				numero5Digitos / 100 % 10, 
				numero5Digitos / 10 % 10, 
				numero5Digitos % 10);
		key.close();
	
	}

}
