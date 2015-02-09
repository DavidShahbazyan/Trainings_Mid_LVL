package com.synisys.trainings.mid.inheritance;

import com.synisys.trainings.mid.interfaces.*;

/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public class GeometricalFigure extends ShapeImpl {
    private int anglesQuantity;

    public GeometricalFigure(int anglesQuantity) {
        this.anglesQuantity = anglesQuantity;
    }

    @Override
    public String getType() {
        return "I'm a geometrical figure. I have " + anglesQuantity + " angles as you specified wile creating me :)." +
                "\n\tTo find out the quantity of my angles, please call getAnglesQuantity() method.";
    }

    public Shape getShape() {
        switch (anglesQuantity) {
            case 0:
                return new Oval();
            case 3:
                return new Triangle();
            case 4:
                return new Square();
            default:
                return new Shape() {
                    @Override
                    public String getType() {
                        return "I don't know who am I :(";
                    }

                    @Override
                    public String getName() {
                        return "Unknown shape type";
                    }
                };
        }
    }
    
    public int getAnglesQuantity() {
        return anglesQuantity;
    }
}
