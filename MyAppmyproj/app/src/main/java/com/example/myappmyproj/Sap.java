package com.example.myappmyproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sap extends AppCompatActivity {
    static String color_select = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sap);
    }
    public void onClick(View v) {
        onBackPressed();
    }
    public void select_button(View view) {
        Button button = (Button) view;
        switch (color_select) {
            case "1":
                button.setBackgroundColor(Color.parseColor("#000000"));
                break;
            case "2":
                button.setBackgroundColor(Color.parseColor("#87CEEB"));
                break;
            case "3":
                button.setBackgroundColor(Color.parseColor("#8B4513"));
                break;
            case "4":
                button.setBackgroundColor(Color.parseColor("#A0522D"));
                break;
            case "5":
                button.setBackgroundColor(Color.parseColor("#DEB887"));
                break;
        }
    }
    public void back(View view) {
        Intent a = new Intent(this, MainActivity2.class);
        startActivity(a);
        finish();
    }
    public void set_BlackColor(View view) {
        color_select = "1";
        // set_BlueColor().setBackgroundColor(Color.DarkRed);

    }

    public void set_SkyBlueColor(View view) {
        color_select = "2";

    }
    public void set_SaddleBrownColor(View view) {
        color_select = "3";

    }
    public void set_SiennaColor(View view) {
        color_select = "4";

    }
    public void set_BurlyWoodColor(View view) {
        color_select = "5";

    }


    public class MainActivity extends AppCompatActivity {

        int state = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }



    }
}
