package jtech;

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Tax ctax = new Tax();
		int price = ctax.taxIn(1000);
		System.out.println(price);
	}

}
