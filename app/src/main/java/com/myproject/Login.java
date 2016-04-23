
package com.myproject;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    AutoCompleteTextView reg;
    EditText Password;
    TextView SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        reg = (AutoCompleteTextView) findViewById(R.id.actv);
        Password = (EditText) findViewById(R.id.password);
        SignUp =(TextView) findViewById(R.id.signup);
        CheckBox checkBox = (CheckBox) findViewById(R.id.cbx);
        //boolean rememberMe = checkBox.isChecked();
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(Login.this, "Remember me checked box was checked", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(Login.this, "CheckBox was unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button submit =  (Button) findViewById(R.id.log_button);
        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (reg.getText().toString().equals("ankit") && Password.getText().toString().equals("password")) {
                    Toast.makeText(getApplicationContext(), "You are successfully log in.", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),Profile_page.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Please enter correct data", Toast.LENGTH_SHORT).show();
                }

            }
        });
        SignUp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Signup.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}