import java.util.Scanner; 
import javax.swing.JOptionPane;
public class C06Ex13 {
	// e02064
	// DURAÇÃO DE UM JOGO COM HORA E MINUTO
	public static void main(String[] args) {
		int horaInicio, minutoInicio, horaFim, minutoFim;
		
		Scanner key = new Scanner (
				C06Ex13.class.getResourceAsStream("C06Ex13fonte.txt"));
		horaInicio = key.nextInt();
		minutoInicio = key.nextInt();
		horaFim = key.nextInt();
		minutoFim = key.nextInt();
		
		int minutosDecorridos = ( (horaFim * 60) + minutoFim ) - ( (horaInicio * 60) + minutoInicio );
		int horasInteiras = minutosDecorridos / 60;
		int minutosInteiros = (minutosDecorridos % 60);
				
		JOptionPane.showMessageDialog(null,
				"Duração: "+horasInteiras+" h "+minutosInteiros+" min",
				"TEMPO DE JOGO",
				JOptionPane.INFORMATION_MESSAGE);
		
	key.close();
	}

}
