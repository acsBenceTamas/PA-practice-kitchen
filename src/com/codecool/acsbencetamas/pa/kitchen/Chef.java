package com.codecool.acsbencetamas.pa.kitchen;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Chef extends Cooker {
    private List<Ingredient> ingredients = new LinkedList<>();
    private static final double REQUEST_CHANCE = 0.2;

    Chef(Kitchen kitchen, String name, Date birthDate, double salary) {
        super(kitchen, name, birthDate, salary);
    }


    @Override
    public void cook() {
        shout();
    }

    private void shout() {
        if (Math.random() < REQUEST_CHANCE) {
            requestIngredient();
        } else {
            System.out.println("Everybody do your work!");
        }
    }

    private void requestIngredient() {
        Random rnd = new Random();
        int ingredientIndex = rnd.nextInt(Ingredient.values().length);
        Ingredient requestedIngredient = Ingredient.values()[ingredientIndex];
        List<Helper> helpers = kitchen.getHelpers();
        for (Helper helper : helpers) {
            if (helper.giveIngredientToChef(this, requestedIngredient)) {
                return;
            }
        }
        for (Helper helper : helpers) {
            helper.shoutOutOfStock();
        }
    }

    public void takeIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
}
