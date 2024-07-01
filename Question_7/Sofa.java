package Question_7;

class Sofa extends Furniture {

    Sofa(String name, int hours) {
        super(name, hours);
    }

    @Override
    double expenditure() {
        return 5.0 * hours;
    }
}