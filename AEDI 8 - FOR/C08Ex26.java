
public class C08Ex26 {

	public static void main(String[] args) {
		for (int reps = 1; reps <= 10; reps++) {
			for (int k = 1; k <= 10; k++) {
				for (int linha = 1; linha <= k; linha++) {
					System.out.printf(" ");
				}
				System.out.print("*\n");
			}
			for (int k = 10; k >= 1; k--) {
				for (int linha = 1; linha <= k; linha++) {
					System.out.printf(" ");
				}
				System.out.print("*\n");
			}
			System.out.println();
		}
	}

}
