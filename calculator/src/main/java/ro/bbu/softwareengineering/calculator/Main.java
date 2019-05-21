package ro.bbu.softwareengineering.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Hey I'm an calculator and I can determine the greatest numnbers out of [-2,-1,-5] and it's " + calculator.max(-2, -1, -1));
    }
}
