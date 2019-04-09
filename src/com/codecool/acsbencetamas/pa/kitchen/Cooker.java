package com.codecool.acsbencetamas.pa.kitchen;

import java.util.Date;

public abstract class Cooker extends Employee {
    protected boolean hasKnife = false;

    Cooker(Kitchen kitchen, String name, Date birthDate, double salary) {
        super(kitchen, name, birthDate, salary);
    }


    abstract public void cook();

    public void obtainKnife() {
        hasKnife = true;
    }
}
