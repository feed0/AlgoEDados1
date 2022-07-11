package AEDI12;
import java.util.Scanner;
public class c12ex13 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		String[] mes = new String[3];
		String temp;
		for (int i = 0; i < mes.length; i++) { 
			mes[i] = key.nextLine();
		}
		
		for (int a = 0; a < mes.length - 1; a++) {
			for (int b = 0; b < mes.length - 1; b++) {
				if(mes[b].compareToIgnoreCase(mes[b+1]) > 0) {
					temp = mes[b];
					mes[b] = mes[b+1];
					mes[b+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < mes.length; i ++) {
			System.out.println(mes[i]);
		}
		key.close();
	}

}
