package Ingeritance;

public class FullTime extends Employ {

    private double basic;
    private double allowance;

    public FullTime(String name, int age, String address, String department, String desingnation, double basic, double allowance) {
        super(name, age, address, department, desingnation);
        this.basic = basic;
        this.allowance = allowance;
    }

    public void setBasic(double basic) {
        this.basic = basic;

    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;

    }

    public double getBasic() {
        return this.basic;
    }

    public double getAllowance() {
        return this.allowance;
    }

    public double Getsalary() {

        return this.basic * this.allowance * Getsalary();

    }

    @Override
    public String toString() {

       return "Name :"+getname()+"\n age:"+getage()+"\n Address: "+getAddress();
    }

}
