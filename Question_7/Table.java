package Question_7;

class Table extends Furniture {

    Table(String name, int hours) {
        super(name, hours);
    }

    @Override
    double expenditure() {
        return 2.0 * hours;
    }
}