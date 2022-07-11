public class C08Ex25 {

	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			for (int k = 1; k <= 10; k++) {
				for (int i = 1; i <= k; i++) {
					System.out.printf("*");
				}
				System.out.println();
			}
			for (int k = 10; k >= 1; k--) {
				for (int i = 1; i <= k; i++) {
					System.out.printf("*");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
