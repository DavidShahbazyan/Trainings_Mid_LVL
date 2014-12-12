package com.synisys.trainings.mid.interfaces;

import com.sun.javafx.beans.annotations.NonNull;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public interface Shape {
    /**
     * @return The shape's type
     */
    @NonNull
    String getType();

    /**
     * @return The shape's name
     */
    @NonNull
    String getName();
}
