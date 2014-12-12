package com.synisys.trainings.mid.interfaces;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        System.out.println(shape.getName() + ":\t" + shape.getType());

        shape = new Square();
        System.out.println(shape.getName() + ":\t" + shape.getType());

        shape = new Oval();
        System.out.println(shape.getName() + ":\t" + shape.getType());
    }
}
