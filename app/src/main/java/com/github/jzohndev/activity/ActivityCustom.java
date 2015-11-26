package com.github.jzohndev.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.github.jzohndev.motivate_me.R;

/**
 * Created by Jzohn on 11/25/2015.
 */
public class ActivityCustom extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_custom);
    }

    public void activityCustomNavigation(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.commit_custom_bt:
                i = new Intent(this, ActivityList.class);
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
