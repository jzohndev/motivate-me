package com.github.jzohndev.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.github.jzohndev.motivate_me.MainMenu;
import com.github.jzohndev.motivate_me.R;

/**
 * Created by Jzohn on 11/25/2015.
 */
public class ActivityCommit extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_commit);
    }

    public void activityCommitNavigation(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.remove_activity_commit_bt:
                break;
            case R.id.commit_activity_commit_bt:
                i = new Intent(this, MainMenu.class);
                startActivity(i);
                break;
            case R.id.add_another_activity_commit_bt:
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
