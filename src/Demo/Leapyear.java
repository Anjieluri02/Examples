package Demo;

public class Leapyear {
	
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static void main(String[] args) {
        int year = 2024; // You can change this year to test

        System.out.println(year + (isLeapYear(year) ? " is a leap year." : " is not a leap year."));
    }
}
