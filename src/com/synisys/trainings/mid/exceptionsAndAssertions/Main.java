package com.synisys.trainings.mid.exceptionsAndAssertions;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class Main {
    public static void main(String[] args) {
        try {
            test(321564136, 2);
//            test(10, 10);
//            test(321564136, 999999999);
//            test(1000, 0);
        } catch (UnsupportedArgumentException e) {
            e.printStackTrace();
        }
    }

    private static void test(Integer n1, Integer n2) throws UnsupportedArgumentException {
        if (n1.compareTo(n2) == -1) {
            throw new UnsupportedArgumentException("Attention [argument1] must be grader or equal to [argument2]!");
        }
        try {
            while (n1 % n2 == 0) {
                System.out.println(n1 /= n2);
            }
            System.out.println("The minimum value is reached!");
        } catch (ArithmeticException ex) {
            throw new UnsupportedArgumentException("The method's arguments are not correct!", ex);
        }
    }
}
