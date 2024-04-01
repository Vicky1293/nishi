package practicekarvikram;

public class EH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 5 / 0;    //Arithmetic exception
		} catch (ArithmeticException a) {
			System.out.println(a);
		}catch (NullPointerException b) {
			System.out.println(b);
		}catch (ArrayIndexOutOfBoundsException c) {
			System.out.println(c);
		}catch (Exception e) {
			System.out.println(e);
		
		}
		System.out.println("Exception Handled");

	}

}
