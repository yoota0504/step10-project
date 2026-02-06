package refact;

public class Calc extends MonthCheck {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int year = 2023; // 西暦年
		int month = 1; // 月
		int day = chkDays(year, month);

		System.out.println("その月の日数は" + day + "です！");

	}

}
