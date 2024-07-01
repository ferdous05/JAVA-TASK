package Question_1;

class NextSemester {
    protected String name;
    protected int year;

    public NextSemester(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println(name + " " + year);
    }

    public int calculate() {
        int sum = 0;
        int tempYear = year;
        while (tempYear != 0) {
            sum += tempYear % 10;
            tempYear /= 10;
        }
        return sum;
    }
}