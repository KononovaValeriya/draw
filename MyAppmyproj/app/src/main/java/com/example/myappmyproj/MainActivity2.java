package com.example.myappmyproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ImageButton ImageButton = findViewById(R.id.imageButton2);
        ImageButton ImageButton3 = findViewById(R.id.imageButton3);
    }
    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void el(View view) {
        Intent b;
        b = new Intent(this, HeartActivity.class);
        startActivity(b);
    }
    public void Sap(View view) {
        Intent v;
        v = new Intent(this, Sap.class);
        startActivity(v);
    }
}