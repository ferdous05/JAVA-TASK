package Question_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter semester name: ");
        String name = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter student support for sixMonths: ");
        int studentSupportSix = scanner.nextInt();
        System.out.print("Enter student support for fourMonths: ");
        int studentSupportFour = scanner.nextInt();
        NextSemester nextSemester = new NextSemester(name, year);
        SixMonths sixMonths = new SixMonths(name, year, studentSupportSix);
        FourMonths fourMonths = new FourMonths(name, year, studentSupportFour);
        nextSemester.display();
        System.out.println("Sum of digits of the year: " + nextSemester.calculate());
        sixMonths.display();
        System.out.println("Year % 6: " + sixMonths.calculate());
        fourMonths.display();
        System.out.println("Year % 4: " + fourMonths.calculate());
    }
}