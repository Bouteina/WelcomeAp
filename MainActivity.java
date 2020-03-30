package com.example.mygreetingap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    welcome = "Hello from Android!";

         Button button = findViewById(R.id.greetingButton);
        final String finalWelcome = welcome;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplicationContext(),
                        welcome,
                        Toast.LENGTH_SHORT);

                toast.show();

            }
        });


    }
    }

