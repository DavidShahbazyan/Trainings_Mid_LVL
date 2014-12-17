package com.synisys.trainings.mid.interfaces;

import com.sun.istack.internal.NotNull;

/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public class Square extends ShapeImpl {
    @NotNull
    @Override
    public String getType() {
        return "I'm a Square, I have 4 angles.";
    }
}
