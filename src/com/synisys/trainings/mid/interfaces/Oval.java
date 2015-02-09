package com.synisys.trainings.mid.interfaces;

import com.sun.istack.internal.NotNull;
/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public class Oval extends ShapeImpl {
    @NotNull
    @Override
    public String getType() {
        return "I'm an Oval. I have NO corner. :(";
    }
}
