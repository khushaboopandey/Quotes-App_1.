package com.chandan.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button QuoteBtn;
    private TextView Quotetext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Quotetext = findViewById(R.id.textview);
        QuoteBtn = findViewById(R.id.btn);
        QuoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuotesServer quotesServer = new QuotesServer();

//                System.out.println("khushaboo");
                Quotetext.setText(quotesServer.getRandomQuote());
            }
        });
    }
}
