package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView name , description , rating ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = (TextView) findViewById(R.id.dNameID);
        description = (TextView) findViewById(R.id.dDescriptionID);
        rating = (TextView) findViewById(R.id.dRatingID);

        Bundle extras = getIntent().getExtras();
        String Name = extras.getString("name");
        String Description = extras.getString("description");
        String Rating  = extras.getString("rating");


        name.setText(Name);
        description.setText(Description);
        rating.setText(Rating);

        // ## will Done ^_^ .

    }
}
