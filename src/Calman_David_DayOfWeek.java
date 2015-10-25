//David Calman
//APCS, Period 1
//2015-10-25
import java.util.*;

public class Calman_David_DayOfWeek {
	public static Calendar c = Calendar.getInstance();
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please input year, month and day: ");
		int y = s.nextInt();
		int m = s.nextInt();
		int d = s.nextInt();
		c.set(y, m, d);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		switch(dow) {
		case Calendar.SUNDAY: System.out.println("Sunday");
		case Calendar.MONDAY: System.out.println("Monday");
		case Calendar.TUESDAY: System.out.println("Tuesday");
		case Calendar.WEDNESDAY: System.out.println("Wednesday");
		case Calendar.THURSDAY: System.out.println("Thursday");
		case Calendar.FRIDAY: System.out.println("Friday");
		case Calendar.SATURDAY: System.out.println("Saturday");
		}
	}
}
