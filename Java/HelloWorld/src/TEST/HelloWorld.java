package TEST;

import org.junit.Test;



public class HelloWorld {
	
	static final char CR='\n';
	static final int inWord 		= 0;
	static final int betweenWord 	= 1;
	static final int lineBreak	= 2;
	static final int crFound		= 3;
	
	

	
	public static String Triangle(int a, int b,int c) {
		if (a == b && b == c)
			return "equilateral";
		if (a == b && b != c)
			return "isosceles";
		if (b == c && c != a)
			return "isosceles";
		if (c == a && a != b)
			return "isosceles";
		
		return "scalene";
				
		//fail("Not yet implemented");
	}
}
