package ;

class FourMonths extends NextSemester {
    private int studentSupport;

    public FourMonths(String name, int year, int studentSupport) {
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
        return year % 4;
    }
}