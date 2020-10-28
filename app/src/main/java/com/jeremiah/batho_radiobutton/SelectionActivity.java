package com.jeremiah.batho_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class SelectionActivity extends AppCompatActivity {
    //create TextView variables
    TextView title, sub1, sub2, sub3, nut1, nut2, nut3;
    //create ImageView variables
    ImageView img1, img2, img3;
    //create String variables
    String title_string, sbtl1, sbtl2, sbtl3, nutr1, nutr2, nutr3, prevIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        //link TextView variables to the XML counterparts
        title = findViewById(R.id.textViewTitle);
        sub1 = findViewById(R.id.textSubTitle1);
        sub2 = findViewById(R.id.textSubTitle2);
        sub3 = findViewById(R.id.textSubTitle3);
        nut1 = findViewById(R.id.textNutrient1);
        nut2 = findViewById(R.id.textNutrient2);
        nut3 = findViewById(R.id.textNutrient3);
        //link the ImageView variables to the XML counterparts
        img1 = findViewById(R.id.imageView1);
        img2 = findViewById(R.id.imageView2);
        img3 = findViewById(R.id.imageView3);
        //get values passed on from previous screen and assign to a variable
        Intent previousIntent = getIntent();
        //the string in the getStringExtra should match the string in the putStringExtra from the previous screen
        prevIntent = previousIntent.getStringExtra("selection");
    //switch case statement to get values based on the value of the prevIntent string variable
        switch (prevIntent){
            //set images, strings and textviews based on the case
            case "Fruits":
                img1.setImageResource(R.drawable.apple);
                img2.setImageResource(R.drawable.banana);
                img3.setImageResource(R.drawable.orange);

                title_string = "Fresh Fruits";
                sbtl1 = "Apples";
                sbtl2 = "Bananas";
                sbtl3 = "Oranges";
                nutr1 = "Apples are a good source of fiber and vitamin C. They also contain polyphenols, which may have numerous health benefits.";
                nutr2 = "Bananas are one of the most popular fruits worldwide. They contain essential nutrients that can have a protective impact on health.";
                nutr3 = "Oranges are a type of low calorie, highly nutritious citrus fruit. As part of a healthful and varied diet, oranges contribute to strong, clear skin and can help lower a person’s risk of many conditions.";

                title.setText(title_string);
                sub1.setText(sbtl1);
                sub2.setText(sbtl2);
                sub3.setText(sbtl3);
                nut1.setText(nutr1);
                nut2.setText(nutr2);
                nut3.setText(nutr3);

                break;

            case "Vegetables":
                img1.setImageResource(R.drawable.spinach);
                img2.setImageResource(R.drawable.carrot);
                img3.setImageResource(R.drawable.broccoli);

                title_string = "Fresh Vegetables";
                sbtl1 = "Spinach";
                sbtl2 = "Carrots";
                sbtl3 = "Broccoli";
                nutr1 = "Spinach is a superfood. It is loaded with tons of nutrients in a low-calorie package. Dark, leafy greens like spinach are important for skin, hair, and bone health.";
                nutr2 = "It is crunchy, tasty, and highly nutritious. Carrots are a particularly good source of beta carotene, fiber, vitamin K1, potassium, and antioxidants.";
                nutr3 = "Broccoli is a green vegetable that vaguely resembles a miniature tree. Broccoli is a nutritional powerhouse full of vitamins, minerals, fiber and antioxidants.";

                title.setText(title_string);
                sub1.setText(sbtl1);
                sub2.setText(sbtl2);
                sub3.setText(sbtl3);
                nut1.setText(nutr1);
                nut2.setText(nutr2);
                nut3.setText(nutr3);

                break;

            case "Grains":
                img1.setImageResource(R.drawable.wheat);
                img2.setImageResource(R.drawable.maize);
                img3.setImageResource(R.drawable.sorghum);

                title_string = "Wholesome Grains";
                sbtl1 = "Wheat";
                sbtl2 = "Maize";
                sbtl3 = "Sorghum";
                nutr1 = "It comes from a type of grass (Triticum) that is grown in countless varieties worldwide. Whole wheat is a good source of several vitamins and minerals.";
                nutr2 = "Maize is the preferred staple food for 900 million poor consumers and the most important food crop in sub-Saharan Africa.";
                nutr3 = "Sorghum, (Sorghum bicolor), also called great millet, Indian millet, milo, durra, orshallu, cereal grain plant of the grass family (Poaceae) and its edible starchy seeds";

                title.setText(title_string);
                sub1.setText(sbtl1);
                sub2.setText(sbtl2);
                sub3.setText(sbtl3);
                nut1.setText(nutr1);
                nut2.setText(nutr2);
                nut3.setText(nutr3);

                break;
        }
        //set a click event on the image
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (sbtl2){
                    case "Bananas":
                        Intent bananas = new Intent(SelectionActivity.this, SpecificActivity.class);
                        bananas.putExtra("spec", sbtl2);
                        startActivity(bananas);
                        break;
                    case "Carrots":
                        Intent carrots = new Intent(SelectionActivity.this, SpecificActivity.class);
                        carrots.putExtra("spec", sbtl2);
                        startActivity(carrots);
                        break;
                    case "Maize":
                        Intent maize = new Intent(SelectionActivity.this, SpecificActivity.class);
                        maize.putExtra("spec", sbtl2);
                        startActivity(maize);
                        break;
                }
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (sbtl1){
                    case "Apples":
                        Intent apples = new Intent(SelectionActivity.this, SpecificActivity.class);
                        apples.putExtra("spec", sbtl1);
                        startActivity(apples);
                        break;
                    case "Spinach":
                        Intent spinach = new Intent(SelectionActivity.this, SpecificActivity.class);
                        spinach.putExtra("spec", sbtl1);
                        startActivity(spinach);
                        break;
                    case "Wheat":
                        Intent wheat = new Intent(SelectionActivity.this, SpecificActivity.class);
                        wheat.putExtra("spec", sbtl1);
                        startActivity(wheat);
                        break;
                }
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (sbtl3){
                    case "Oranges":
                        Intent apples = new Intent(SelectionActivity.this, SpecificActivity.class);
                        apples.putExtra("spec", sbtl3);
                        startActivity(apples);
                        break;
                    case "Broccoli":
                        Intent spinach = new Intent(SelectionActivity.this, SpecificActivity.class);
                        spinach.putExtra("spec", sbtl3);
                        startActivity(spinach);
                        break;
                    case "Sorghum":
                        Intent wheat = new Intent(SelectionActivity.this, SpecificActivity.class);
                        wheat.putExtra("spec", sbtl3);
                        startActivity(wheat);
                        break;
                }
            }
        });
    }
}