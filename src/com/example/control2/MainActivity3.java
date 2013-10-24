package com.example.control2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RatingBar;
import android.widget.TextView;


public class MainActivity3 extends Activity {

	private TextView name1, email1;
    private RatingBar resultRating0;
    String name,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.MainActivity3);
            
            
            name1 = (TextView) findViewById(R.id.name1);
            email1 = (TextView) findViewById(R.id.email1);
            resultRating0 = (RatingBar) findViewById(R.id.resultRating0);
            
            name = getIntent().getStringExtra("name");
            email = getIntent().getStringExtra("email");
            Float ratingBar = getIntent().getFloatExtra("ratingBar", 0);

            name1.setText(name);
            email1.setText(email);
            resultRating0.setRating(ratingBar);
		
		
	}


	
	

}
