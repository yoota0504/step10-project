package refact;

public class MonthCheck {

	protected static int chkDays(int year, int month) {
		int day = 1; // 日
	
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			// 31日の月か？
			day = 31;
		} else if (month == 2) {
			day = leapYear(year);
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			// 30日の月か？
			day = 30;
		} else {
			System.out.println("該当する年月がありません！");
		}
		return day;
	}

	private static int leapYear(int year) {
		int day;
		// 2月か？ うる年か？
		if ((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)))
			day = 29;
		else
			day = 28;
		return day;
	}

	public MonthCheck() {
		super();
	}

}