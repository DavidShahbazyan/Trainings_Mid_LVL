package com.synisys.trainings.mid.interfacesAndNestedClasses;

/**
 * @author David.Shahbazyan
 * @since Nov 11, 2014.
 */
public class Main {
    public static void main(String[] args) {
        GUIForm_InterfacesAndNestedClasses guiForm = new GUIForm_InterfacesAndNestedClasses();
        guiForm.display();
    }

    public static void createNewEqualsAndHashcodeGUIForm() {
        GUIForm_EqualsAndHashcode guiForm = new GUIForm_EqualsAndHashcode("Equals and Hashcode Template");
        guiForm.display();
    }

    public static void createNewNestedClassesGUIForm() {
        GUIForm_NestedClasses guiForm = new GUIForm_NestedClasses("Nested Classes Template");
        guiForm.display();
    }
}
