package com.synisys.trainings.mid.interfaces;

import com.sun.javafx.beans.annotations.NonNull;

/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public class Triangle extends ShapeImpl {
    @NonNull
    @Override
    public String getType() {
        return "I'm a Triangle. I have 3 corners.";
    }
}
