import javax.swing.JOptionPane;
public class C06Ex15 {
	// e02064
	// TV A CABO
	public static void main(String[] args) {
		int cidadeAssinante, codigoPacote;
		String diasPayperviewSTR, valorExtrasSTR;
		double valorTotal = 0;
		
		String[] botoesPacote = {" Basic "," Advanced"," Premium "};
		codigoPacote = JOptionPane.showOptionDialog(null,
				"Selecione seu pacote:",
				"TV A CABO",
				JOptionPane.PLAIN_MESSAGE,
				JOptionPane.QUESTION_MESSAGE,
				null,
				botoesPacote,
				" Basic ");
		String[] botoesCidades = {"Belo Horizonte","São Paulo","Rio de Janeiro","Demais cidades"};
		cidadeAssinante = JOptionPane.showOptionDialog(null,
				"Selecione sua cidade:",
				"TV A CABO",
				JOptionPane.PLAIN_MESSAGE,
				JOptionPane.QUESTION_MESSAGE,
				null, 
				botoesCidades,
				"Belo Horizonte");
		diasPayperviewSTR = JOptionPane.showInputDialog(null,
				"Dias de PayPerView:",
				"TV A CABO",
				JOptionPane.QUESTION_MESSAGE);
		valorExtrasSTR = JOptionPane.showInputDialog(null,
				"Valor dos serviços extras: R$ ",
				"TV A CABO",
				JOptionPane.QUESTION_MESSAGE);
		
		int diasPayperview = Integer.valueOf(diasPayperviewSTR);
		double valorExtras = Double.parseDouble(valorExtrasSTR.replace(",", "."));
		
		if (codigoPacote == 0) { // basic
			if (diasPayperview * 1.2 <= 65) {
				valorTotal = 65 + ( diasPayperview * 1.2 ) + valorExtras;
				if (cidadeAssinante == 1) 
					valorTotal += valorTotal * 0.01;
				else if (cidadeAssinante == 2) 
					valorTotal += valorTotal * 0.015;
				else if (cidadeAssinante == 3) 
					valorTotal += valorTotal * 0.02;
			}
			else {
				valorTotal = 130 + valorExtras; 
				if (cidadeAssinante == 1)
				valorTotal += valorTotal * 0.01;
				else if (cidadeAssinante == 2)
				valorTotal += valorTotal * 0.015;
				else if (cidadeAssinante == 3)
				valorTotal += valorTotal * 0.02;
			}
		}
		
		else if (codigoPacote == 1) { // advanced
			valorTotal = 104 + ( diasPayperview * 2.1 ) + valorExtras;
			if (cidadeAssinante == 1)
				valorTotal += valorTotal * 0.01;
			else if (cidadeAssinante == 2)
				valorTotal += valorTotal * 0.015 ;
			else if (cidadeAssinante == 3)
				valorTotal += valorTotal * 0.02;
		}
		
		else if (codigoPacote == 2) { // premium
				valorTotal = 137 + valorExtras;
			if (cidadeAssinante == 1)
				valorTotal += valorTotal * 0.01;
			else if (cidadeAssinante == 2)
				valorTotal += valorTotal * 0.015;
			else if (cidadeAssinante == 3)
				valorTotal += valorTotal * 0.02;
		}
		
		 JOptionPane.showMessageDialog(null,
				"Valor total:"
				+ " \nR$ " + String.format("%.2f", valorTotal), 
				"TV A CABO",
				JOptionPane.INFORMATION_MESSAGE);
	}
}