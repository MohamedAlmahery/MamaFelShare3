package com.example.youssef.mamafelshare3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

/* This page Created by : Youssef Guba

    This page is for list of food
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* this  Code By :  Muhammad Ashraf
        ( while Open SplashScreen This code will be able to show the (SplashLoginScreen) for Only First Show this App )

        ( I wil disable it -- when us Publish this App make it showen)
         */

        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);

        if (isFirstRun) {
            startActivity(new Intent(this, SplashLoginScreen.class));
        }
        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit().putBoolean("isFirstRun", false).commit();
    }
}
