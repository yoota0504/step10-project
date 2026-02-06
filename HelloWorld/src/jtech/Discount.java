package jtech;

public class Discount {
	public boolean priceCheck(int price) {
		if(price >= 50000) {
			// 購入額が50,000円以上なら割引対象となる
			return true;
		} else {
			// 割引対象とならない
			return false;
		}
	}
	
	public double sexCheck(String sex) {
		if(sex == "f") {
			// 女性なら2割引
			return 0.2;
		}else {
			// 男性なら1割引
			return 0.1;
		}
	}
	
	public int ageCheck(int age) {
		if(age < 20) {
			// 3,000円引き
			return 3000;
		} else {
			// 割引なし
			return 0;
		}
	}

}
