package com.codecool.acsbencetamas.pa.kitchen;

import java.util.Date;

public class Cook extends Cooker {


    Cook(Kitchen kitchen, String name, Date birthDate, double salary) {
        super(kitchen, name, birthDate, salary);
    }

    @Override
    public void cook() {
        // DO ACTUAL COOKING //
    }
}
