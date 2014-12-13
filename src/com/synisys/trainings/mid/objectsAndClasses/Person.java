package com.synisys.trainings.mid.objectsAndClasses;

/**
 * Author: David.Shahbazyan
 * Date: 13.12.2014
 * Description:
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name:" + firstName + " | ");
        sb.append("Last Name:" + lastName + " | ");
        sb.append("Age:" + age + " | ");
        sb.append("Gender:" + gender);
        return sb.toString();
    }
}
