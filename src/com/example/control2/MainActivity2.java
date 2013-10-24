package com.example.control2;


import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RatingBar;
import android.view.View.OnClickListener;

public class MainActivity2 extends Activity {
	
	 private EditText name1, email1;
     private Button Boton;
     private RatingBar ratingBar0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
		
		name1 = (EditText) findViewById(R.id.Editnombre);
		email1 = (EditText) findViewById(R.id.Editcorreo);
        Boton = (Button) findViewById(R.id.Buttonenviar);
        ratingBar0 = (RatingBar) findViewById(R.id.RatingBar);
         
         Boton.setOnClickListener(new OnClickListener() {
	

	
	public void onClick(View v)	
	{
	
		Intent i=new Intent(this, MainActivity3.class);
		i.putExtra("name", name1.getText());
		i.putExtra("email", email1.getText());
		i.putExtra("ratingBar1", ratingBar0.getRating());
		startActivity(i);
	}

}
	}
}
