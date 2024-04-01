package practicekarvikram;

public class Abstraction1 extends Abstraction {

	void a() {
		System.out.println("Abstraction method");
		
	}
	
	public static void main(String[] args) {
		Abstraction1 c = new Abstraction1();
		
		c.a();
		c.b();
	}

}
