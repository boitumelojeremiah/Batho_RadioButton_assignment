package com.jeremiah.batho_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SpecificActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title, content;
    String prevous, content_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific);

        imageView = findViewById(R.id.imageViewSpecific);
        title = findViewById(R.id.textViewOtherTitle);
        content = findViewById(R.id.textViewContent);

        Intent prevIntent = getIntent();
        prevous = prevIntent.getStringExtra("spec");

        switch (prevous){
            case "Apples":
                imageView.setImageResource(R.drawable.apple);
                title.setText(prevous);
                content_string = "An apple is an edible fruit produced by an apple tree. Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today";
                content.setText(content_string);
                break;
            case "Bananas":
                imageView.setImageResource(R.drawable.banana);
                title.setText(prevous);
                content_string = "A banana is an elongated, edible fruit – botanically a berry – produced by several kinds of large herbaceous flowering plants in the genus Musa. In some countries, bananas used for cooking may be called \"plantains\", distinguishing them from dessert bananas.";
               content.setText(content_string);
                break;
            case "Oranges":
                imageView.setImageResource(R.drawable.orange);
                title.setText(prevous);
                content_string = "The orange is the fruit of various citrus species in the family Rutaceae; it primarily refers to Citrus × sinensis, which is also called sweet orange, to distinguish it from the related Citrus × aurantium, referred to as bitter orange.";
                content.setText(content_string);
                break;
            case "Spinach":
                imageView.setImageResource(R.drawable.spinach);
                title.setText(prevous);
                content_string = "Spinach is a leafy green flowering plant native to central and western Asia. It is of the order Caryophyllales, family Amaranthaceae, subfamily Chenopodioideae. Its leaves are a common edible vegetable consumed either fresh, or after storage using preservation techniques by canning, freezing, or dehydration.";
                content.setText(content_string);
                break;
            case "Carrots":
                imageView.setImageResource(R.drawable.carrot);
                title.setText(prevous);
                content_string = "The carrot is a root vegetable, usually orange in color, though purple, black, red, white, and yellow cultivars exist. They are a domesticated form of the wild carrot, Daucus carota, native to Europe and Southwestern Asia. The plant probably originated in Persia and was originally cultivated for its leaves and seeds.";
                content.setText(content_string);
                break;
            case "Broccoli":
                imageView.setImageResource(R.drawable.broccoli);
                title.setText(prevous);
                content_string = "Broccoli is an edible green plant in the cabbage family whose large flowering head, stalk and small associated leaves are eaten as a vegetable.";
                content.setText(content_string);
                break;
            case "Wheat":
                imageView.setImageResource(R.drawable.wheat);
                title.setText(prevous);
                content_string = "Wheat is a grass widely cultivated for its seed, a cereal grain which is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat.";
                content.setText(content_string);
                break;
            case "Maize":
                imageView.setImageResource(R.drawable.maize);
                title.setText(prevous);
                content_string = "Maize, also known as corn, is a cereal grain first domesticated by indigenous peoples in southern Mexico about 10,000 years ago. The leafy stalk of the plant produces pollen inflorescences and separate ovuliferous inflorescences called ears that yield kernels or seeds, which are fruits.";
                content.setText(content_string);
                break;
            case "Sorghum":
                imageView.setImageResource(R.drawable.sorghum);
                title.setText(prevous);
                content_string = "Sorghum is a genus of flowering plants in the grass family Poaceae, which includes about 25 species. Some of these species have grown as cereals for human consumption and some in pastures for animals. One species, Sorghum bicolor, was originally domesticated in Africa and has since spread throughout the globe.";
                content.setText(content_string);
                break;
        }
    }
}