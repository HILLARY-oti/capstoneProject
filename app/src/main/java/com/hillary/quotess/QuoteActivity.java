package com.hillary.quotess;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class QuoteActivity extends AppCompatActivity {
    private Button quoteButton;
    private TextView quoteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        quoteButton = (Button) findViewById(R.id.quoteBtn);
        quoteText =  (TextView) findViewById(R.id.TextView);

        quoteButton.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick (View view) {
                Quote quotes = new Quote();
                quoteText.setText(quotes.getRandomQuotes());
            }
        });
    }
}

