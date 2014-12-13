package com.synisys.trainings.mid.objectsAndClasses;

import java.util.Random;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            System.out.println(new Person(uppercaseFirstLetter(generateWord(6)), uppercaseFirstLetter(generateWord(6)), generateAge(), generateGender()));
        }
    }

    private static char generateGender() {
        Random r = new Random();
        return r.nextInt() % 2 == 0 ? 'F' : 'M';
    }

    private static int generateAge() {
        Random r = new Random();
        return r.nextInt(75 - 1) + 1;
    }

    private static String generateWord(int lettersQuantity) {
        Random r = new Random();
        String word = "";
        for (int i = 0; i < lettersQuantity; i++) {
            int letterCode = r.nextInt(90 - 65) + 65;
            word += new Character((char) letterCode);
        }
        return word;
    }

    private static String uppercaseFirstLetter(String str) {
        if (!"".equals(str)) {
            return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        }
        return str;
    }
}
