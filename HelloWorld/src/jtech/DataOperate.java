package jtech;

public class DataOperate {

	public String str(String s) {
		String str1 = "abc";

		if (str1.equals(s)) {
			return "OK";
		} else {
			return "NG";
		}
	}
	
	public Double tax(int t) {
		return t * 1.08;
	}
}
