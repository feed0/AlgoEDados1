import java.util.Scanner;
import javax.swing.JOptionPane;
// e02064
public class C04Ex05 {
	public static void main(String[] args) {
		String nome, CPF, RG, empresa;
		long tituloEleitor, CNH;
		double salario;
		
		Scanner arquivo = new Scanner (
			C04Ex05.class.getResourceAsStream("C04Ex05nome.txt"));
		nome = arquivo.nextLine();
		CPF = arquivo.nextLine();
		RG = arquivo.nextLine();
		tituloEleitor = arquivo.nextLong();
		CNH = arquivo.nextLong();
		salario = arquivo.nextDouble();
		arquivo.nextLine();
		empresa = arquivo.nextLine();
		
		JOptionPane.showMessageDialog(null, 
				"FICHA FUNCIONAL DE: "+nome+
				"\n"+
				"\nDocumentos: "+
				"\nCPF ....................................................."+CPF+
				"\nC.I. ......................................................."+RG+
				"\nTítulo de eleitor ................................"+tituloEleitor+
				"\nCarteira de motorista ....................."+CNH+
				"\n"+
				"\nEmpresa: "+empresa+
				"\nSalário: R$ "+salario,
				"FICHA FUNCIONAL",
				JOptionPane.INFORMATION_MESSAGE);
		arquivo.close();
	}
}