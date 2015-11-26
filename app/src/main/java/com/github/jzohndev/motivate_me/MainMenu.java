package com.github.jzohndev.motivate_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.jzohndev.activity.ActivityList;
import com.github.jzohndev.meals.MealsList;
import com.github.jzohndev.motivate_me.R;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);
    }

    //starts an activity if "I Just Ate" or "I Just Worked Out" are clicked
    public void mainMenuNavigation(View iJust){
        Intent i;

        switch (iJust.getId()) {
            case R.id.ate_tvb:
                i = new Intent(this, MealsList.class);
                startActivity(i);
                break;
            case R.id.worked_tvb:
                i = new Intent(this, ActivityList.class);
                startActivity(i);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }
}
