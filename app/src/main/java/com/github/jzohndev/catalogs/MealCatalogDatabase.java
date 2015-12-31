package com.github.jzohndev.catalogs;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jzohn on 12/30/2015.
 */
public class MealCatalogDatabase extends AppCompatActivity{
    public static int isCreated = 0;
    public MealDatabaseHelper db;

    public MealCatalogDatabase(){
        db = new MealDatabaseHelper(this);
        addBreakfest();
        addLunch();
        addDinner();
        addSnack();
    }

    public void addBreakfest(){
        db.createMeal("placeholderBreakfest", "200", "3", "0", "25", "100", "0", "10", "1", "2", "2", "0", "0", "0");
    }

    public void addLunch(){
        db.createMeal("placeholderLunch", "120", "3", "0", "25", "100", "0", "10", "1", "2", "2", "0", "0", "0");
    }

    public void addDinner(){
        db.createMeal("placeholderDinner", "400", "3", "0", "25", "100", "0", "10", "1", "2", "2", "0", "0", "0");
    }

    public void addSnack(){
        db.createMeal("placeholderSnack", "80", "3", "0", "25", "100", "0", "10", "1", "2", "2", "0", "0", "0");
    }
}
