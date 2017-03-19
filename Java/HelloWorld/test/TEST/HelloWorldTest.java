package TEST;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest extends HelloWorld {

	@Test
	public void testTriangle1() {
		assertEquals("equilteral", HelloWorld.Triangle(1, 1, 1));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testTriangle2() {
		assertEquals("equilateral", HelloWorld.Triangle(1, 1, 1));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testTriangle3() {
		assertEquals("isosceles", HelloWorld.Triangle(1, 1, 4));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testTriangle4() {
		assertEquals("isosceles", HelloWorld.Triangle(1, 4, 4));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testTriangle5() {
		assertEquals("isosceles", HelloWorld.Triangle(4, 4, 4));
		//fail("Not yet implemented");
	}
	
	
	@Test
	public void testTriangle6() {
		assertEquals("scalene", HelloWorld.Triangle(1, 3, 4));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testTriangle7() {
		assertEquals("scalene", HelloWorld.Triangle(1, 3, 1));
		//fail("Not yet implemented");
	}

}
