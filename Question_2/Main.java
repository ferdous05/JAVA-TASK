package Question_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter semester name: ");
        String name = scanner.nextLine();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        Intersession intersession1 = new Intersession(name, year);
        intersession1.display();
        System.out.println("Year % 2: " + intersession1.calculate());
        intersession1.project();

        System.out.println();

        Intersession intersession2 = new Intersession(name, year + 1);
        intersession2.display();
        System.out.println("Year % 2: " + intersession2.calculate());
        intersession2.project();
    }
}