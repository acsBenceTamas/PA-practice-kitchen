package com.codecool.acsbencetamas.pa.kitchen;

import java.util.Date;

public abstract class Employee {
    protected Kitchen kitchen;
    protected String name;
    protected Date birthDate;
    protected double salary;

    Employee(Kitchen kitchen, String name, Date birthDate, double salary) {
        this.kitchen = kitchen;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public void reportSalary() {
        System.out.println("The tax of " + name + " is " + salary*0.99 + " dollars.");
    }
}
