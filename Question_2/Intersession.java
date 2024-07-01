package Question_2;
import java.util.Scanner;
class Intersession extends NextSemester {
    public Intersession(String name, int year) {
        super(name, year);
    }

    @Override
    public int calculate() {
        return year % 2;
    }

    public void project() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you have a project (yes/no)? ");
        String hasProject = scanner.nextLine();
        if (hasProject.equalsIgnoreCase("yes")) {
            System.out.println("Has a project");
        } else {
            System.out.println("No projects");
        }
    }
}
