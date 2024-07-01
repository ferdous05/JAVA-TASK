package Question_3;

class Calculator {

    public void whatDoes() {
        System.out.println("Does calculation");
    }
}


class Add extends Calculator {
    @Override
    public void whatDoes() {
        System.out.println("Addition");
    }
}


class Sub extends Calculator {
    @Override
    public void whatDoes() {
        System.out.println("Subtraction");
    }
}
