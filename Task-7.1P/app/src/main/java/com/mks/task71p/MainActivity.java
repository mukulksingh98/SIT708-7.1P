package com.tamim.task71p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button newAdvertButton;
    Button lostAndFoundButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newAdvertButton = findViewById(R.id.newAdvertButton);
        lostAndFoundButton = findViewById(R.id.lostAndFoundButton);
        newAdvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,CreateAdvertActivity.class);
                startActivity(i);
            }
        });
        lostAndFoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,ListActivity.class);
                startActivity(i);
            }
        });
    }
}