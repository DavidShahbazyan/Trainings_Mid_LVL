package com.synisys.trainings.mid.exceptionsAndAssertions;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class Main {
    public static void main(String[] args) {
        try {
//            test(1);
            test(2);
//            test(-2);
        } catch (UnsupportedArgumentException e) {
            e.printStackTrace();
        }
    }

    private static void test(int i) throws UnsupportedArgumentException {
        if (i != 2) {
            throw new UnsupportedArgumentException("The method's argument should be equal to 2.");
        }
        int counter = 0;
        for (int j = i; j < 999999999; j *= i) {
            System.out.println("POW(2,"+ ++counter + ") = " + j);
        }
        System.out.println("The maximum number for int is reached!");
    }
}
