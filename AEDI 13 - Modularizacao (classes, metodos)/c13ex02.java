package AEDI13;

public class c13ex02 {
	
	// FUNCAO COM PARAMETRO
	public static double Funcao(double x) {
		
		double fx;
		
		if (x < 4) 
			fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2)) ;
		else if (x == 4)
			fx = 0;
		else 
			fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
			
		return fx;
	
	}

}
