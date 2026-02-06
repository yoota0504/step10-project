package jtech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiscountTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testPriceCheck() {
		Discount pc = new Discount();
		assertTrue(pc.priceCheck(50000));
		assertFalse(pc.priceCheck(10000));
	}

	@Test
	public void testSexCheck() {
		Discount sc = new Discount();
		assertEquals(0.2, sc.sexCheck("f"), 0.0);
		assertEquals(0.1, sc.sexCheck("m"), 0.0);
	}

	@Test
	public void testAgeCheck() {
		Discount ac = new Discount();
		assertEquals(3000, ac.ageCheck(18));
		assertEquals(0, ac.ageCheck(20));
	}
	
	@Test
	public void testMain() {
		Main m = new Main();
		assertEquals(0, m.num);
		
		String[] str = { "main", "メソッド" };
		Main.main(str);
		assertNull(Main.sub());
	}

}
