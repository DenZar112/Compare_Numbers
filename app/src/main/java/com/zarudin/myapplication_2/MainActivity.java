package com.zarudin.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_2);
        button.setOnClickListener(v -> Toast.makeText(MainActivity.this, "PUSH",
                Toast.LENGTH_SHORT).show());
    }
}