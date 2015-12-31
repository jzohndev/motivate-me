package com.github.jzohndev.meals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.github.jzohndev.catalogs.MealDatabaseHelper;
import com.github.jzohndev.motivate_me.R;

import java.util.List;

/**
 * Created by Jzohn on 11/25/2015.
 */
public class MealsCatalog  extends AppCompatActivity {
    MealDatabaseHelper db;
    ListView lv;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.meals_catalog);
        createListView();
    }

    public void mealsCatalogNavigation(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.add_meals_catalog_bt:
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

    public void createListView(){
        lv = (ListView) findViewById(R.id.meal_lv);
        lv.
    }
}
