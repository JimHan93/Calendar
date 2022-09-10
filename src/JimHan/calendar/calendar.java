package JimHan.calendar;


import java.util.Scanner;

public class calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31};
	
	public static int maxDaysofMonths(int month) {
		return MAX_DAYS[month-1];
	}
	
	public void sampleCalendar() {
		System.out.println(" S  M Tu  W Th  F  S");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] args) {
		int month;
		int maxDays;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please input the number of the month");
		month = scanner.nextInt();
		
		System.out.printf("%d has %d days\n",month,maxDaysofMonths(month));
		scanner.close();
		
	}
	
}
