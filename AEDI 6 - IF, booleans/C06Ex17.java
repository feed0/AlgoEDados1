import javax.swing.JOptionPane;
public class C06Ex17 {
	// e02064
	// APTID�O PARA EMPREGO PROGRAMADOR
	public static void main(String[] args) {
		int cursoTecnico, cursoSuperior, anosExperiencia, pessoaCriativa, lider, sozinho, autodidata, remuneracao, localBH;
		
		String [] botoes = {" N�O ", " SIM "};
		cursoTecnico = JOptionPane.showOptionDialog(null, 
				"Voc� tem curso t�cnico de programa��o?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		cursoSuperior = JOptionPane.showOptionDialog(null,
				"Voc� tem curso superior de programa��o?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		anosExperiencia = JOptionPane.showOptionDialog(null,
				"Voc� tem menos de 3 anos de experi�ncia em programa��o?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		 pessoaCriativa = JOptionPane.showOptionDialog(null,
				"Voc� se considera um pessoa criativa?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		 lider = JOptionPane.showOptionDialog(null,
					"Voc� prefere liderar a ser liderado(a)?", "ENTREVISTA",
					JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
					null,
					botoes, " SIM ");
		sozinho = JOptionPane.showOptionDialog(null,
				"Voc� prefere trabalhar sozinho a trabalhar em equipe?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		autodidata = JOptionPane.showOptionDialog(null,
				"Voc� � autodidata (aprende sozinho(a))?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		remuneracao = JOptionPane.showOptionDialog(null,
				"Voc� aceitaria uma remunera��o inicial de R$ 1500,00?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		localBH = JOptionPane.showOptionDialog(null,
				"Voc� s� aceitaria trabalhar em escrit�rios da empresa dentro da grande BH?", "ENTREVISTA",
				JOptionPane.PLAIN_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null,
				botoes, " SIM ");
		
		
	}

}
