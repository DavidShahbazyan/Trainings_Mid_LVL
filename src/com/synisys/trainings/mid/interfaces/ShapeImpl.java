package com.synisys.trainings.mid.interfaces;

import com.sun.istack.internal.NotNull;

/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public abstract class ShapeImpl implements Shape {
    @NotNull
    @Override
    public abstract String getType();

    @NotNull
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
