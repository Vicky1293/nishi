package practicekarvikram;
//this program is written for passing array to method 
public class Array1 {
	//defining int type c array
	static int c[] = {22,2,44,5};
	
	//creating one static method and passing array value to that method
	public static void passingArraytomethod(int c[]) {
		//passing c[0] that is 22 to int b
		int b = c[0];
		
		for(int i = 0; i < c.length; i++) {
			if(b >= c[i]) {
				System.out.println(b);
			}else {
				System.out.println("ABCD");
			}
		}	
	}
	public static void main(String[] args) {
		passingArraytomethod(c);
	}
	   
	

}
