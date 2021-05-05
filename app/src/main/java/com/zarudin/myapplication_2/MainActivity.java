package com.zarudin.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Integer arg1;
    private Integer arg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.compare);

        Button button = findViewById(R.id.button_2);
        button.setOnClickListener(v -> Toast.makeText(MainActivity.this, "PUSH",
                Toast.LENGTH_SHORT).show());

        Button button3 = findViewById(R.id.button3);
        final EditText editText1 = findViewById(R.id.editText1);
        final EditText editText2 = findViewById(R.id.editText2);
        final TextView textView = findViewById(R.id.textView);

        button.setOnClickListener(v -> {
            arg1 = Integer.valueOf(editText1.getText().toString());
            arg2 = Integer.valueOf(editText2.getText().toString());
            if (arg1.equals(arg2)) {
                textView.setText("Равно!");
            } else {
                textView.setText("Не равно!");
            }

        });
    }


}



