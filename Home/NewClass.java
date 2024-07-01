/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

/**
 *
 * @author BC
 */
class Computer {

    Computer() {
        System.out.println("Constructor of Computer class.");
    }

    void computer_method() {
        System.out.println("Power gone! Shut down your PC soon...");
    }

    public static void main(String[] args) {
        Computer my = new Computer();
        Laptop your = new Laptop();

        my.computer_method();
        your.laptop_method();
    }
}

class Laptop {

    Laptop() {
        System.out.println("Constructor of Laptop class.");
    }

    void laptop_method() {
        System.out.println("99% Battery available.");
    }
}
