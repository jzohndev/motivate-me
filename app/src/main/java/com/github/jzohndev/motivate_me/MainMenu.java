package com.github.jzohndev.motivate_me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {
    private TextView iJustAte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_activity);

        iJustAte = (TextView) findViewById(R.id.ate_tvb);
        addMeal();
    }

    public void addMeal(){
        iJustAte.setOnClickListener(
            new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    setContentView(R.layout.meals_list);
            }
        });
    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
        return true;
    }
}
