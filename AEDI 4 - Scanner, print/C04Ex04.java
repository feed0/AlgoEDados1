import javax.swing.JOptionPane;
public class C04Ex04 {
	// Autor: e02064
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null,
				"Qual o seu primeiro nome?",
				"Aula de Java",
				JOptionPane.QUESTION_MESSAGE);
		String nomeMeio = JOptionPane.showInputDialog(null,
				"Qual o seu nome do meio?",
				"Aula de java",
				JOptionPane.QUESTION_MESSAGE);
		String sobrenome = JOptionPane.showInputDialog(null,
				"Qual o seu sobrenome?",
				"Aula de java",
				JOptionPane.QUESTION_MESSAGE);
		String idadeStr = JOptionPane.showInputDialog(null,
				"Qual a sua idade?",
				"Aula de java",
				JOptionPane.QUESTION_MESSAGE);
		int idade = Integer.valueOf(idadeStr).intValue();
		JOptionPane.showMessageDialog(null,
				sobrenome+", "+nome+" "+nomeMeio+"\nIdade: "+idade+" anos.");
			
	}

}
