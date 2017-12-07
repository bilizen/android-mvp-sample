package com.billflores.android_mvp_sample.data.entity;

/**
 * Created by rodrigo on 5/10/17.
 */

public class Person {
    String name;
    int dni;

    public Person(String name, int dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
