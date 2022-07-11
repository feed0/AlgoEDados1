package c14ex01;
public class Classe5 {

	public static void CalcularHipotenusa() {
		
     double hipotenusa, cateto1, cateto2;
    
     System.out.print("Informe o valor do cateto 1: ");
     cateto1 = c14ex01.in.nextDouble();
     System.out.print("Informe o valor do cateto 2 : ");
     cateto2 = c14ex01.in.nextDouble();
     hipotenusa = Math.pow(Math.pow(cateto1,2)+Math.pow(cateto2,2),1.0/2);
     System.out.print("Hipotenusa = "+hipotenusa);
     
   }
}