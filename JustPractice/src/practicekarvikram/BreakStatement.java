package practicekarvikram;

public class BreakStatement {

	public static void main(String[] args) {
		
		//Break Statement using For Loop
		/*
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * if (i == 3) { break;
		 * 
		 * } System.out.println(i); } System.out.println("control out of loop");
		 */
		
		////Break Statement using nested
		
		for (int m = 1; m < 3; m++) {

			for (int n = 1; n < 3; n++) {

				if (m == 2 && n == 2) {

					break;
				}
				System.out.println(m + " " + n);
			}
			System.out.println("control out of inner loop");
		}
		System.out.println("control came out of loop");
		
		//Break Statement using While Loop
		/*
		 * int i = 1; while (i <= 5) { if (i == 3) { break; } System.out.println(i);
		 * i++; } System.out.println("control came out of loop");
		 */
		
		//Break Statement using Do While Loop
		
		/*int i = 1;
		do {
			if(i == 3) {
				break;
			}
			System.out.println(i);
			i++;
		}while(i <= 5);
		System.out.println("control out of loop");*/
	}

}
