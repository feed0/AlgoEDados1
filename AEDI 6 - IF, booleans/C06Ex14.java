import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex14 {
	// e02064
	// INVERTER NÚMERO COM 4 DÍGITOS
	public static void main(String[] args) {
		int numero, numeroInvertido;
		
		Scanner key = new Scanner (
				C06Ex14.class.getResourceAsStream("C06Ex14fonte.txt"));
		numero = key.nextInt();
		
		if (numero / 1000 >= 1 && numero / 1000 < 10) {
			int digito1 = numero / 1000;
			int digito2 = numero / 100 % 10;
			int digito3 = numero / 10 % 10;
			int digito4 = numero % 10;
			numeroInvertido = (digito4*1000)+(digito3*100)+(digito2*10)+digito1;
			
			JOptionPane.showMessageDialog(null,
					numeroInvertido,
					"NÚMERO INVERTIDO",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null, 
				"O NÚMERO DEVE TER 4 DÍGITOS",
				"ERRO",
				JOptionPane.ERROR_MESSAGE);

		key.close();

	}
}