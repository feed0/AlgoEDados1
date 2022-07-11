import javax.swing.JOptionPane;
public class C06Ex17 {
	// e02064
	// APTIDÃO PARA EMPREGO PROGRAMADOR
	public static void main(String[] args) {
		int cursoTecnico, cursoSuperior, anosExperiencia, pessoaCriativa, lider, sozinho, autodidata, remuneracao, localBH;
		
		String [] botoes = {" NÃO ", " SIM "};
		cursoTecnico = JOptionPane.showOptionDialog(null, 
				"Você tem curso técnico de programação?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		cursoSuperior = JOptionPane.showOptionDialog(null,
				"Você tem curso superior de programação?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		anosExperiencia = JOptionPane.showOptionDialog(null,
				"Você tem menos de 3 anos de experiência em programação?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		 pessoaCriativa = JOptionPane.showOptionDialog(null,
				"Você se considera um pessoa criativa?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		 lider = JOptionPane.showOptionDialog(null,
					"Você prefere liderar a ser liderado(a)?", "ENTREVISTA",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
					null,
					botoes, " SIM ");
		sozinho = JOptionPane.showOptionDialog(null,
				"Você prefere trabalhar sozinho a trabalhar em equipe?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		autodidata = JOptionPane.showOptionDialog(null,
				"Você é autodidata (aprende sozinho(a))?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		remuneracao = JOptionPane.showOptionDialog(null,
				"Você aceitaria uma remuneração inicial de R$ 1500,00?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		localBH = JOptionPane.showOptionDialog(null,
				"Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		
		
	}

}
