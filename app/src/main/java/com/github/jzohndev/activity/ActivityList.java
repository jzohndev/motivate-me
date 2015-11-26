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
public class ActivityList extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void activityListNavigation(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.add_activity_bt:
                i = new Intent(this, ActivityCommit.class);
                startActivity(i);
                break;
            case R.id.modify_activity_bt:
                i = new Intent(this, ActivityCustom.class);
                startActivity(i);
                break;
            case R.id.delete_activity_bt:
                break;
            case R.id.custom_activity_bt:
                i = new Intent(this, ActivityCustom.class);
                startActivity(i);
                break;
            case R.id.catalog_activity_bt:
                i = new Intent(this, ActivityCatalog.class);
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
