package practicekarvikram;

public class RelationalOperator {

	public static void main(String[] args) {
	/*	int a = 300;
		double b = 30.05 ;
		
		if(a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a is equal to b");
		}

	}*/
		
		String p = "VIKRAM";
		String q = "vikram";
		
		if(p == q) {
			System.out.println("p is equal to q");
		}else {
			System.out.println("p is not equal to q");
		}
	    if(p.equals(q)) {
	    	System.out.println("p is equal to q");
	    }else {
	    	System.out.println("p is not equal to q");
	    }
	    if(p.equalsIgnoreCase(q)) {
	    	System.out.println("p is equal to q");
	    }else {
	    	System.out.println("p is not equal to q ");
	    }
	    
	    
	}
}


