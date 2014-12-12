package com.synisys.trainings.mid.interfaces;


import com.sun.javafx.beans.annotations.NonNull;

/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public abstract class ShapeImpl implements Shape {
    @NonNull
    @Override
    public abstract String getType();

    @NonNull
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
