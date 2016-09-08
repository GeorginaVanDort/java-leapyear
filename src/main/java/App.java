import java.io.Console;

public class App {
  public static void main (String[] args) {
    Console c = System.console();
    LeapYear leapYear = new LeapYear();
    int year = Integer.parseInt(c.readLine("Enter a Year to determine if it is a leap year: "));
    boolean result = leapYear.isLeapYear(year);
    c.printf("Is your year a leap year?\n %b.\n", result);
  }
}
