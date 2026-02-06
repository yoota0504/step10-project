package jtech;

public class Tax {
	
	public int taxIn(int price) {
		double taxRate = 0.1;
		
		//税込み金額を計算する
		int postTax = (int)(price * (1 + taxRate));
		//税込み金額を返す
		return postTax;
	}

}
