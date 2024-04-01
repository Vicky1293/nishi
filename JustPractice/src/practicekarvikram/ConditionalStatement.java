package practicekarvikram;

public class ConditionalStatement {

	public static void main(String[] args) {
		int w = 500;
		int q = 400;
		
		if(w < q) {
			System.out.println("w is lesser");
		}else if(w == q){
			System.out.println("w is equal to q");
		}else {
			System.out.println("w is greater than q");
		}
		
		int age = 19;
		int weight = 49;
		//outer if block
		if(age > 18) {
			//inner if block
			if(weight > 50) {
				System.out.println("you are eligible");
			}else {
				System.out.println("you are not eligible");
			}
		}else {
			System.out.println("your age is not grater than 18");
		}
	}

}
