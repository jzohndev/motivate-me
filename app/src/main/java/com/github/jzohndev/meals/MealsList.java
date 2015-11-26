package com.github.jzohndev.meals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.github.jzohndev.motivate_me.R;

/**
 * Created by Jzohn on 11/25/2015.
 */
public class MealsList extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.meals_list);
    }

    public void mealsListNavigation(View v){
        Intent i;

        switch (v.getId()){
            case R.id.add_activity_bt:
                i = new Intent(this, MealsCommit.class);
                startActivity(i);
                break;
            case R.id.modify_activity_bt:
                i = new Intent(this, MealsCustom.class);
                startActivity(i);
                break;
            case R.id.delete_activity_bt:
                break;
            case R.id.custom_activity_bt:
                i = new Intent(this, MealsCustom.class);
                startActivity(i);
                break;
            case R.id.catalog_activity_bt:
                i = new Intent(this, MealsCatalog.class);
                startActivity(i);
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}

























/*
        //meal_list buttons
        addMealFromList = (Button) findViewById(R.id.add_meals_bt);
        modifyMeals = (Button) findViewById(R.id.modify_meals_bt);
        customMeals = (Button) findViewById(R.id.custom_meals_bt);
        addMealFromCatalog = (Button) findViewById(R.id.catalog_meals_bt);

        //meal_list listeners
        addMealFromListL();
        modifyMealsL();
        customMealsL();
        addMealFromCatalogL();
    }









    public void addMealFromListL(){
        addMealFromList.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.meals_commit);
                    }
                });
    }

    public void modifyMealsL(){
        modifyMeals.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.meals_custom);
                    }
                });
    }

    public void customMealsL(){
        customMeals.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.meals_custom);
                    }
                });
    }

    public void addMealFromCatalogL(){
        addMealFromCatalog.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.meals_catalog);
                    }
                });*/
