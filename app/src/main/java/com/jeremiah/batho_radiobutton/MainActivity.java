package com.jeremiah.batho_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declare String variable to be used to retrieve radio button text values
    String selected;
    //declare radio button variables
    RadioButton fruitRadio, veggieRadio, grainRadio, selectedButton;
    //declare radio group to house the radio buttons
    RadioGroup radioGroup;
    //declare button variable
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link radio group variable to XML counterpart
        radioGroup = findViewById(R.id.radioGroup);
        //Link radio buttons to XML counterpart
        fruitRadio = findViewById(R.id.radio0);
        veggieRadio = findViewById(R.id.radio1);
        grainRadio = findViewById(R.id.radio2);
        //Link button to XML counterpart
        next = findViewById(R.id.buttonNext);
        //Set on click event on the button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get the selected radio button
                selectedButton = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                //get the text of the selected radio button
                selected = selectedButton.getText().toString();
                //function to move from current activity to the next activity
                Intent nextScreen = new Intent(MainActivity.this, SelectionActivity.class);
                //the below will pass on the text value of the String variable selected onto the next Activity
                nextScreen.putExtra("selection", selected);
                //open the next activity
                startActivity(nextScreen);
            }
        });
    }
}