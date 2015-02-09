package com.synisys.trainings.mid.interfaces;

import com.sun.istack.internal.NotNull;
/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public interface Shape {
    /**
     * @return The shape's type
     */
    @NotNull
    String getType();

    /**
     * @return The shape's name
     */
    @NotNull
    String getName();
}
