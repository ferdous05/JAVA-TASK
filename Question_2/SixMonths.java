package Question_2;

class SixMonths extends NextSemester {
    private int studentSupport;

    public SixMonths(String name, int year, int studentSupport) {
        super(name, year);
        this.studentSupport = studentSupport;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student Support: " + studentSupport);
    }

    @Override
    public int calculate() {
        return year % 6;
    }
}
