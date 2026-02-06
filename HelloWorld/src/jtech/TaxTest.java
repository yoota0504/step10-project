package jtech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxTest {

	@Test
	void testTaxIn() {
		Tax tax = new Tax(); // テスト対象のクラスのインスタンス化
		assertEquals(1100, tax.taxIn(1000));
	}

}
