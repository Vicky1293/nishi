package practicekarvikram;

public class LoopConcept {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("value of i is : " + i);
		}
		System.out.println("control out of loop");

		Object a[] = { 1, "selenium", 1 > 5, 'x' };
		for (Object b : a) {
			System.out.println(b);
		}
		int j = 10;
		while (j < 20 & j < 12) {
			System.out.println(j);
			j++;
		}

		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k <= 7);

	}

}
