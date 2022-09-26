package com.example.style_theme_example_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ret(View view){

        EditText nameET = findViewById(R.id.firstET);
        TextView nameTV = findViewById(R.id.firstTV);
        EditText ageET = findViewById(R.id.secondET);
        TextView ageTV = findViewById(R.id.secondTV);
        EditText howET = findViewById(R.id.thirdET);
        TextView howTV = findViewById(R.id.thirdTV);

        String one = nameET.getText().toString();
        String two = ageET.getText().toString();

        if(nameET !=null)

        {
            nameTV.setText(one + " is a cool name");
        }

        if(ageET !=null)

        {
            ageTV.setText(two + " is a nice age");
        }

        if(howET !=null)

        {
            howTV.setText("Have a good day!");
        }


    }

}