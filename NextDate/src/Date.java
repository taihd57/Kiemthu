public class Date {
	public int day_max = 31;
	public int month_max = 12;
	public int year_max = 2012;
	public int year_min = 1892;

	public String nextDate(int a, int b, int c) {
		int day = a;
		int month = b;
		int year = c;

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day_max = 31;
				break;
			case 2:
				if (year % 4 == 0)
					day_max = 29;
				else
					day_max = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day_max = 30;
				break;
			default:
				break;
		}
		
		if( day <= 0 || day > day_max || month <= 0 || month > month_max || year < year_min || year > year_max)
			return "Input Error";
		
		day ++;
		
		if (day > day_max) {
			day = 1;
			month++;
			if (month > month_max) {
				month = 1;
				year++;
			}
		}
		
		
		String nextDate = day + "/" + month +"/" + year;
		return nextDate;
	}
}
