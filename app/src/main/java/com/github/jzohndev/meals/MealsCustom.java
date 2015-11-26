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
public class MealsCustom  extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.meals_custom);
    }

    public void mealsCustomNavigation(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.meals_custom_commit_bt:
                i = new Intent(this, MealsList.class);
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