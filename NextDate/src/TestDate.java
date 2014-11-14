import static org.junit.Assert.*;

import org.junit.Test;


public class TestDate {

	@Test
	public void testNextDate() {
		Date first_day = new Date();
		assertEquals("11/5/1994",first_day.nextDate(10,5,1994));
	}
	
	@Test
	public void testNextDate1() {
		Date second_day = new Date();
		assertEquals("Input Error",second_day.nextDate(29,2,2011));
	}
	
	@Test
	public void testNextDate2() {
		Date third_day = new Date();
		assertEquals("1/3/2000",third_day.nextDate(29,2,2000));
	}
	
	@Test
	public void testNextDate3() {
		Date fourth_day = new Date();
		assertEquals("1/2/2000",fourth_day.nextDate(31,1,2000));
	}
	
	@Test
	public void testNextDate4() {
		Date fifth_day = new Date();
		assertEquals("1/1/2000",fifth_day.nextDate(31,12,1999));
	}
	
	@Test
	public void testNextDate5() {
		Date sixth_day = new Date();
		assertEquals("Input Error",sixth_day.nextDate(0,2,2000));
	}
	
	@Test
	public void testNextDate6() {
		Date seventh_day = new Date();
		assertEquals("Input Error",seventh_day.nextDate(29,0,2011));
	}

}
