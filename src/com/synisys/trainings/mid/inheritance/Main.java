package com.synisys.trainings.mid.inheritance;

/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        GeometricalFigure figure;
        for (int i = 0; i < 6; i++) {
            figure = new GeometricalFigure(i);
            System.out.println("[INFO] " + figure.getType());
            System.out.println(figure.getShape().getName() + " -> " + figure.getShape().getType());
            System.out.println("--------------------------------");
        }
    }
}
