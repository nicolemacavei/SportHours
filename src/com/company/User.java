package com.company;
import javafx.scene.effect.Light;

import java.util.*;

public class User implements Sport{
    private String firstName;
    private String lastName;
    private List<Sport> sports;

    public User(String firstName, String lastName, List<Sport> sports) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sports = sports;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    public double calculateTime(){
        double time=0;
        return time;
    }

    public double calculateMediumTime() {
        double time = 0;

        return time;
    }
}
