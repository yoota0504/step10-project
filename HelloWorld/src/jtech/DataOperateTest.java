package jtech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataOperateTest {

	@Test
	void testStr() {
		DataOperate strope = new DataOperate();
		assertEquals("OK", strope.str("xyz"), "文字列が一致しません" );
	}
	
	@Test
	void testTax() {
		DataOperate strope = new DataOperate();
		assertEquals(1058, strope.tax(980), 0.5);
		assertEquals(1058, strope.tax(980), 0.3, "誤差が許容範囲ではありません");
	}
	
}
