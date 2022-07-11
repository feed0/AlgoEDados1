package c14ex02;

public class Classe1 {

	public static double AreaQuadrado() {
		
		System.out.println("Diga o lado do quadrado: ");
		double lado = c14ex02.in.nextDouble();
		
		double area = lado * lado;
		return area;
		
	}
	
	public static double AreaRetangulo() {

		System.out.println("Diga a base e a altura do retângulo: ");
		double base = c14ex02.in.nextDouble();
		double altura = c14ex02.in.nextDouble();

		double area = base * altura;
		return area;

	}
	
	public static double AreaTrianguloRetangulo() {

		System.out.println("Diga a base e a altura do triânuglo retângulo: ");
		double base = c14ex02.in.nextDouble();
		double altura = c14ex02.in.nextDouble();

		double area = base * altura / 2;
		return area;

	}
	
	public static double AreaCirculo() {

		System.out.println("Diga o raio do círculo: ");
		double raio = c14ex02.in.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		return area;

	}
	
}
