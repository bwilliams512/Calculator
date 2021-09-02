/*
This is a simple arithmetic calculator.
 */

package bwilliams512.calculator;

public class Calculator {
    
    // Calculator constructor
    public Calculator() {

    }

    // add method
    public double add(int a, int b) {
        return a + b;
    }

    // subtract method
    public double subtract(int a, int b) {
        return a - b;
    }

    // multiply method
    public double multiply(int a, int b) {
        return a * b;
    }

    // divide method
    public double divide(int a, int b) {
        return a / b;
    }

    // modulo method
    public double modulo(int a, int b) {
        return a % b;
    }
    
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(1, 4));
        System.out.println(myCalculator.subtract(10, 5));
    }
}
