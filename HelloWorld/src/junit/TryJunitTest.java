package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TryJunitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("This is BeforeAll!");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This is AfterAll!");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This is BeforeEach!");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("This is AfterEach!");
	}

	@Test
	public void testTryJunit() {
		System.out.println("This is Test1");
		
		assertEquals(1, TryJunit.cnt);
	}

	@Test
	public void testMain() {
		System.out.println("This is Test2");
		
		String[] str = { "main", "メソッド" };
		TryJunit.main(str);
		
		TryJunit tj = new TryJunit();
		assertEquals(4, tj.sub());
	}

}
