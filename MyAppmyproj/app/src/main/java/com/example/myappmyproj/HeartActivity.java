package com.example.myappmyproj;



import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeartActivity extends AppCompatActivity {
    static String color_select = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);
    }

    public void onClick(View v) {
        onBackPressed();
    }
    public void select_button(View view) {
        Button button = (Button) view;
        switch (color_select) {
            case "2":
                button.setBackgroundColor(Color.parseColor("#FF0000"));
                break;
            case "1":
                button.setBackgroundColor(Color.parseColor("#8B0000"));
                break;
        }
    }

    public void back(View view) {
        Intent a = new Intent(this, MainActivity2.class);
        startActivity(a);
        finish();
    }


    public void set_BlueColor(View view) {
        color_select = "1";
       // set_BlueColor().setBackgroundColor(Color.DarkRed);

    }

    public void set_redColor(View view) {
        color_select = "2";

    }


    public class MainActivity extends AppCompatActivity {

        int state = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        public void set_redColor(View view) {
            color_select = "2";


        }


        public void set_BlueColor(View view) {
            color_select = "1";
        }
    }
}
