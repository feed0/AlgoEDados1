import javax.swing.JOptionPane;
public class C08Ex11 {
	// LOIRA OLHOS AZUIS JOVEM COM SALÁRIO 10.000 + SALARIO MAIS ALTO + DIFERENÇA SALÁRIO DOS HOMENS
	public static void main(String[] args) {
		String tituloJOp = "PESQUISA FENOTÍPICA E SOCIAL", nome, idadeSTR, salarioSTR, nomeMaiorSalario = null;
		int sexo, estadoCivil, corOlhos, corCabelos, escolaridade, contadorMulheresRicas = 0, idade;
		double maiorSalario = 0, menorSalarioMasculino = 0, maiorSalarioMasculino = 0;
		
		for (int i = 1; i <= 50; i++) { // 50 pessoas -> i <= 50
			nome = JOptionPane.showInputDialog(null,
					"Diga seu nome:", tituloJOp,
					JOptionPane.QUESTION_MESSAGE);
			
			idadeSTR = JOptionPane.showInputDialog(null,
					"Diga sua idade:", tituloJOp,
					JOptionPane.QUESTION_MESSAGE);
			idade = Integer.parseInt(idadeSTR);
			
			String[] botoesSexo = {"F", "M"};
			sexo = JOptionPane.showOptionDialog(null, 
					"Diga seu sexo:", tituloJOp, 
					JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null,
					botoesSexo, "M");
			
			String[] botoesEstadoCivil = {"C", "S", "O"};
			estadoCivil = JOptionPane.showOptionDialog(null, 
					"Diga seu estado civil:", tituloJOp, 
					JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null,
					botoesEstadoCivil, "C");
			
			String[] botoesCorOlhos = {"A", "C", "P", "O"};
			corOlhos= JOptionPane.showOptionDialog(null, 
					"Diga sua cor dos olhos:", tituloJOp, 
					JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null,
					botoesCorOlhos, "A");
			
			String[] botoesCorCabelos= {"L", "P", "C", "R"};
			corCabelos = JOptionPane.showOptionDialog(null, 
					"Diga sua cor dos cabelos:", tituloJOp, 
					JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null,
					botoesCorCabelos, "L");
			
			salarioSTR = JOptionPane.showInputDialog(null,
					"Diga seu salário:", tituloJOp,
					JOptionPane.QUESTION_MESSAGE);
			double salario = Double.valueOf(salarioSTR);
			
			String[] botoesEscolaridade = {"1", "2", "3", "4"};
			escolaridade = JOptionPane.showOptionDialog(null,
					"Diga sua escolaridade", tituloJOp,
					JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null,
					botoesEscolaridade, "1");
		
			if (sexo == 0 && corCabelos == 0 && corOlhos == 0 && (18 <= idade && idade <= 25) && estadoCivil == 1 && salario > 10000 && escolaridade == 3) {
				contadorMulheresRicas ++;
			}
			
			if (i == 1 || salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
			
			if (i == 1 || (sexo == 1 && salario < menorSalarioMasculino) ) {
				menorSalarioMasculino = salario;
			}
			else if (i == 1 || (sexo == 1 && salario > maiorSalarioMasculino) ) {	
				maiorSalarioMasculino = salario;
			}
			
		}	
		
		JOptionPane.showMessageDialog(null,
				  "Número de mulheres ricas:       " + contadorMulheresRicas +
				"\nNome pessoa mais rica:          " + nomeMaiorSalario +
				"\nAlcance do salário do homens:   " +  (maiorSalarioMasculino - menorSalarioMasculino),
				tituloJOp, JOptionPane.INFORMATION_MESSAGE);
	}

}
