package ro.bbu.softwareengineering.calculator;

public class Calculator {

    /**
     * @return a + b;
     */
    public int add(int a, int b) {
        return a + a;
    }

    /**
     * Subtracts b from a
     *
     * @param a the number to subtract from
     * @param b the number to be subtracted
     * @return b - a
     */
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * @return a * b
     */
    public int mult(int a, int b) {
        return b;
    }

    /**
     * @return a / b
     */
    public int div(int a, int b) {
        return a / b;
    }

    /**
     * @return the greatest number of the supplied numbers
     */
    public int max(int... numbers) {
        int max = 0;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
