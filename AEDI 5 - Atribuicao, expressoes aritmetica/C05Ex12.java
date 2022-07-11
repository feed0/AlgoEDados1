import java.util.Scanner;
public class C05Ex12 {
	// e02064
	public static void main(String[] args) {
		long tempoSegundos;
		
		Scanner key = new Scanner(System.in);
		System.out.println("TEMPO DE DURAÇÃO DE UM EVENTO \n");
		System.out.print("Informa o tempo de duração do evento em segundos: ");
		tempoSegundos = key.nextLong();
		
		long resultadoHora = tempoSegundos / 3600;
		long resultadoMinuto = (tempoSegundos - (resultadoHora * 3600)) / 60;
		long resultadoSegundo = tempoSegundos - (resultadoHora * 3600) - (resultadoMinuto * 60);
		
		System.out.println();
		System.out.printf("%d%s %d%s %d%s",
				resultadoHora, "h",
				resultadoMinuto, "min",
				resultadoSegundo, "seg");
		key.close();
	}

}
