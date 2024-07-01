package Question_7;

class Chair extends Furniture {

    Chair(String name, int hours) {
        super(name, hours);
    }

    @Override
    double expenditure() {
        return 0.5 * hours;
    }
}
