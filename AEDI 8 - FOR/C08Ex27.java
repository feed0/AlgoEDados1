
public class C08Ex27 {

	public static void main(String[] args) {
		for (int k = 1; k <= 10; k ++) {
			
			for (int j = 0; j <= 6; j++) {
				for (int i = 1; i <= Math.pow(2, j); i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for (int j = 5; j >= 0; j--) {
				for (int i = 1; i <= Math.pow(2, j); i++) {
					System.out.print("*");
				}
				
				System.out.println();
				
			}
			
			if (k % 2 == 0)
			System.out.println();
		}

	}

}