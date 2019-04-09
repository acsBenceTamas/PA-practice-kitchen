package com.codecool.acsbencetamas.pa.kitchen;

import java.util.*;

public class Helper extends Employee {
    private List<Ingredient> ingredients = new LinkedList<>();

    Helper(Kitchen kitchen, String name, Date birthDate, double salary) {
        super(kitchen, name, birthDate, salary);
        fillIngredientList();
    }

    private void fillIngredientList() {
        Random rnd = new Random();
        for (Ingredient ingredient : Ingredient.values()) {
            int ingredientCount = rnd.nextInt(3);
            for (int i = 0; i < ingredientCount; i++) {
                ingredients.add(ingredient);
            }
        }
    }

    boolean giveIngredientToChef(Chef chef, Ingredient ingredient) {
        Iterator iterator = ingredients.listIterator();
        while (iterator.hasNext()) {
            Ingredient current = (Ingredient) iterator.next();
            if (current == ingredient) {
                iterator.remove();
                chef.takeIngredient(ingredient);
                return true;
            }
        }
        return false;
    }

    public void shoutOutOfStock() {
        System.out.println("We're all out!");
    }
}
