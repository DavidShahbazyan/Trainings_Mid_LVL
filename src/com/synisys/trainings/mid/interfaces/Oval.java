package com.synisys.trainings.mid.interfaces;

import com.sun.javafx.beans.annotations.NonNull;

/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public class Oval extends ShapeImpl {
    @NonNull
    @Override
    public String getType() {
        return "I'm an Oval. I have NO corner. :(";
    }
}
