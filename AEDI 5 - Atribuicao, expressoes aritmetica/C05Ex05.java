import java.util.Scanner;
public class C05Ex05 {
	public static void main(String[] args) {
		double temperaturaCelsius;
		
		Scanner key = new Scanner(System.in);		
		System.out.println("CONVERSOR DE TEMPERATURAS - CELSIUS PARA KELVIN E FAHRENHEIT");
		System.out.print("\nInforme a temperatura em graus celsius: ");
		temperaturaCelsius = key.nextDouble();
		
		double temperaturaKelvin = temperaturaCelsius + 273;
		double temperaturaFahrenheit = (((9 * temperaturaCelsius) + 160 ) / 5f);
		
		System.out.println("\nTemperatura em Kelvin: "+temperaturaKelvin);
		System.out.println("Temperatura em Fahrenheit: "+temperaturaFahrenheit);
		key.close();
	}

}
