package com.myproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.myproject.R.id.submit11;

/**
 * Created by user on 12/11/2015.
 */
public class Signup extends Activity {
    Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
    Submit= (Button) findViewById(submit11);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup.this, "Your account will be created in 2 minutes",Toast.LENGTH_SHORT).show();
            }
        });
    }



    }
