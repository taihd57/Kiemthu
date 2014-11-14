package isTriangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void isTriangle() {
		Triangle trl1 = new Triangle(9,8,1);
		assertEquals(false,trl1.isTriangle());
	}

	@Test
	public void triangleType1() {
		Triangle trl2 = new Triangle(1,1,1);
		assertEquals("Equilateral",trl2.triangleType());
	}
	
	@Test
	public void triangleType2() {
		Triangle trl3 = new Triangle(3,2,2);
		assertEquals("Isosceles",trl3.triangleType());
	}
	
	@Test
	public void triangleType3() {
		Triangle trl4 = new Triangle(2,3,4);
		assertEquals("Scalene",trl4.triangleType());
	}
	
	@Test
	public void triangleType4() {
		Triangle trl5 = new Triangle(1,2,3);
		assertEquals("NotATriangle",trl5.triangleType());
	}
}
