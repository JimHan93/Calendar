package JimHan.calendar;
import java.util.Scanner;

public class calendar {
	public static void main(String[] args) {
		int month;
		int[] days= {31, 28, 31, 30, 31, 30, 31,
		             31, 30, 31, 30, 31};
		
		System.out.println(" S  M  Tu W  Th F  S");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	
		System.out.println("Please input the number of the month");
		Scanner scanner = new Scanner (System.in);
		month = scanner.nextInt();
		System.out.printf("%d has %d days", month,days[month-1]);
		
	}
	
}
