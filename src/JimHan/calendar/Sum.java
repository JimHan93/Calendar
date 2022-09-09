package JimHan.calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int first, second;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("Please input two numbers");
		s1 = scanner.next();
		s2 = scanner.next();
		first = Integer.parseInt(s1);
		second = Integer.parseInt(s2);
		System.out.printf("Sum of two numbers is: %d", first + second);
		scanner.close();
	}
}
