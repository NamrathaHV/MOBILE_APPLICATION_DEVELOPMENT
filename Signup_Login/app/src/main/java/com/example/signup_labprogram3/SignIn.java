package com.example.signup_labprogram3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity implements View.OnClickListener {
    EditText txtloginusername, txtloginpassword;
    Button btnlogin;
    String user,pass;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        txtloginusername=(EditText)findViewById(R.id.txtUsername);
        txtloginpassword=(EditText) findViewById(R.id.txtPassword);
        btnlogin=(Button)findViewById(R.id.btnSignup);
        btnlogin.setOnClickListener(this);
        Bundle bundle=getIntent().getBundleExtra("data");
        user=bundle.getString("user");
        pass=bundle.getString("pass");
    }

    @Override
    public void onClick(View v) {
        String user1=txtloginusername.getText().toString();
        String pass1=txtloginpassword.getText().toString();
        if(user.equals(user1)&&pass.equals(pass1))
        {
            Toast.makeText(this,"Successful Login",Toast.LENGTH_LONG).show();
        }
        else
        {
            count++;
            if(count==2)
            {
                btnlogin.setEnabled(false);
                Toast.makeText(this,"Failed Login Attempt",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"Login Failed"+count,Toast.LENGTH_LONG).show();
            }
        }
    }
}